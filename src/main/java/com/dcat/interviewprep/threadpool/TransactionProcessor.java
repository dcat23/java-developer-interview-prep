package com.dcat.interviewprep.threadpool;

import java.util.concurrent.*;
import java.util.List;
import java.util.ArrayList;

// Define the task for processing transactions
class TransactionProcessor implements Callable<String> {
    private final String transaction;

    public TransactionProcessor(String transaction) {
        this.transaction = transaction;
    }

    @Override
    public String call() throws Exception {
        // Simulate transaction processing
        System.out.println("Processing transaction: " + transaction);
        // Here you would validate, enrich, persist, and log the transaction
        Thread.sleep(1000); // Simulating time-consuming task
        return "Processed transaction: " + transaction;
    }
}

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

