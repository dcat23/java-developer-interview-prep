package com.dcat.interviewprep.threadpool;

import java.util.concurrent.*;

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

