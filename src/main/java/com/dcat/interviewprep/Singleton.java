package com.dcat.interviewprep;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Singleton {

    private static Singleton instance;

    private final Instant start;

    private final Scanner scan;


    /**
     * Private constructor to prevent instantiation from other classes
     */
    private Singleton() {
        start = Instant.now();
        scan = new Scanner(System.in);
    }

    /**
     * Public static method to get the single instance of the class
     * @return Singleton instance
     */
    public static Singleton getInstance() {
        // Creates the instance when needed
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getRuntime() {
        Instant now = Instant.now();
        Duration duration = Duration.between(start, now);
        long seconds = duration.getSeconds();
        long absSeconds = Math.abs(seconds);
        long days = absSeconds / (24 * 3600);
        long hours = (absSeconds % (24 * 3600)) / 3600;
        long minutes = ((absSeconds % (24 * 3600)) % 3600) / 60;
        long secs = ((absSeconds % (24 * 3600)) % 3600) % 60;

        StringBuilder builder = new StringBuilder();
        if (seconds < 0) {
            builder.append("-");
        }
        if (days != 0) {
            builder.append(days).append(" days ");
        }
        if (hours != 0) {
            builder.append(hours).append(" hours ");
        }
        if (minutes != 0) {
            builder.append(minutes).append(" minutes ");
        }
        if (secs != 0 || (days == 0 && hours == 0 && minutes == 0)) {
            builder.append(secs).append(" seconds");
        }
        return builder.toString();
    }

    public Scanner getScanner() {
        return scan;
    }

    public Instant getStart() {
        return start;
    }
}
