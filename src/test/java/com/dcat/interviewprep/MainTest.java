package com.dcat.interviewprep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testSingleton() {
        Singleton first = Singleton.getInstance();

        try {
            System.out.println("Running for " + first.getRuntime());
            Thread.sleep(5000);

            Singleton second = Singleton.getInstance();

            assertEquals(first.getStart(), second.getStart());

            System.out.println("Running for " + second.getRuntime());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}