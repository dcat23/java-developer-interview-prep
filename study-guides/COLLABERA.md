# Collabera Study Guide

## Table of Contents


| No. | Questions                                                                                                                                       |
|-----|-------------------------------------------------------------------------------------------------------------------------------------------------|
|     | **Core React**                                                                                                                                  |
| 1   | [Difference of predicate, consumer, function](#difference-of-predicate-consumer-function)                                                       |
| 2   | [Sort a list of integers in ascending order using your own logic](#sort-a-list-of-integers-in-ascending-order-using-your-own-logic)             |
| 3   | [scenario for using method reference in java](#scenario-for-using-method-reference-in-java)                                                     |
| 4   | [describe a scenario when you used thread pool to do a concurrent task](#describe-a-scenario-when-you-used-thread-pool-to-do-a-concurrent-task) |
| 5   | [describe a scenario when you used thread pool to do a concurrent task](#describe-a-scenario-when-you-used-thread-pool-to-do-a-concurrent-task) |
| 6   | [describe a scenario when you used thread pool to do a concurrent task](#describe-a-scenario-when-you-used-thread-pool-to-do-a-concurrent-task) |

## Difference of predicate, consumer, function

### Predicate
      A Predicate represents a single argument function that returns
      a boolean value.

**Use Case**: It is often used for filtering or matching criteria.

**Method Signature**: `boolean test(T t)`
```java
Predicate<Integer> isEven = num -> num % 2 == 0;
boolean result = isEven.test(4); // returns true

```

### Consumer
      A Consumer represents an operation that accepts a single 
      input argument and returns no result.

**Use Case**: It is often used for performing operations like printing, logging, or modifying elements.

**Method Signature**: `void accept(T t)`

```java
Consumer<String> print = message -> System.out.println(message);
print.accept("Hello, World!"); // prints "Hello, World!" to the console
```

print is a consumer that takes a string and prints it to the console.

### Function
      A Function represents a function that accepts one argument 
      and produces a result.

**Use Case**: It is often used for mapping or transforming data.

**Method Signature**: `R apply(T t)`

Function<Integer, String> intToString = num -> "Number: " + num;
String result = intToString.apply(5); // returns "Number: 5"
In this example, intToString is a function that takes an integer and returns a string representation of that integer.

Summary
- `Predicate<T>`: Takes an input of type T and returns a boolean (boolean test(T t)).
- `Consumer<T>`: Takes an input of type T and performs some operation but does not return any value (void accept(T t)).
- `Function<T, R>`: Takes an input of type T and returns a result of type R (R apply(T t)).
These functional interfaces enable concise and readable code, especially when combined with lambda expressions and the Stream API in Java.


## Sort a list of integers in ascending order using your own logic

One of the basic sorting algorithms is the [BubbleSort.java](..%2Fsrc%2Fmain%2Fjava%2Fcom%2Fdcat%2Finterviewprep%2Fsorting%2FBubbleSort.java)


## scenario for using method reference in java

Method references in Java are a shorthand notation for invoking methods. They can make your code more readable and concise. They are often used in the context of functional programming, such as with the Stream API, lambda expressions, and functional interfaces like Consumer, Predicate, and Function.

Here's a scenario where method references can be particularly useful: Suppose you have a list of strings representing names, and you want to sort them in alphabetical order.

Example Scenario: Sorting a List of Names
### Without Method Reference: Using a Lambda Expression
```java
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class SortNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Diana");

        // Sorting using lambda expression
        Collections.sort(names, (name1, name2) -> name1.compareTo(name2));

        System.out.println(names); // Output: [Alice, Bob, Diana, John]
    }
}

```

### With method reference
```java
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class SortNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Diana");

        // Sorting using method reference
        Collections.sort(names, String::compareTo);

        System.out.println(names); // Output: [Alice, Bob, Diana, John]
    }
}
```


## describe a scenario when you used thread pool to do a concurrent task
Certainly! Let me describe a scenario where I used a thread pool to manage concurrent tasks. In this example, I'll walk through a project where I developed a system to process and analyze a large number of financial transactions concurrently.

Scenario: Processing Financial Transactions Concurrently
Problem Statement
We had a financial application that needed to process a large batch of transactions every day. Each transaction involved several steps, including validation, enrichment, persistence to the database, and logging. Processing these transactions sequentially was inefficient and time-consuming. We needed a solution to handle multiple transactions concurrently to improve performance and reduce processing time.

Solution
I implemented a thread pool using the ExecutorService framework in Java to manage a pool of worker threads that could process multiple transactions in parallel.

Implementation Steps
Define the Task: Each task represents the processing of a single transaction. We define this as a Runnable or Callable class.

Create a Thread Pool: Using ExecutorService to create a thread pool that manages a fixed number of threads.

Submit Tasks to the Pool: Submit each transaction processing task to the thread pool for execution.

Shutdown the Pool: Once all tasks are submitted, gracefully shut down the thread pool.

