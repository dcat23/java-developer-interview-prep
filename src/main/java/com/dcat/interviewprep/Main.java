package com.dcat.interviewprep;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        try {
            System.out.println("Running for " + singleton.getRuntime());
            Thread.sleep(5000);

            Singleton secondSingleton = Singleton.getInstance();

            assert singleton.getStart().equals(secondSingleton.getStart());

            System.out.println("Running for " + secondSingleton.getRuntime());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}