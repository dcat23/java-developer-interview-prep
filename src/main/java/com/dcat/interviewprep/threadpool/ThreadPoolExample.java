package com.dcat.interviewprep.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // List of transactions to process
        List<String> transactions = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            transactions.add("Transaction " + i);
        }

        // Create a thread pool with a fixed number of threads
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // List to hold Future objects
        List<Future<String>> futures = new ArrayList<>();

        // Submit tasks to the thread pool
        for (String transaction : transactions) {
            TransactionProcessor task = new TransactionProcessor(transaction);
            Future<String> future = executorService.submit(task);
            futures.add(future);
        }

        // Wait for all tasks to complete and retrieve results
        for (Future<String> future : futures) {
            try {
                String result = future.get();
                System.out.println(result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Shutdown the thread pool
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}
