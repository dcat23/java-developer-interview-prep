# Java Full Stack Devevloper Interview Prep 
[![GitHub Stars](https://img.shields.io/github/stars/dcat23/java-developer-interview-prep.svg)](https://github.com/dcat23/java-developer-interview-prep/stargazers)
[![GitHub Issues](https://img.shields.io/github/issues/dcat23/java-developer-interview-prep.svg)](https://github.com/dcat23/java-developer-interview-prep/issues)
[![Current Version](https://img.shields.io/badge/version-0.0.0-green.svg)](https://github.com/dcat23/java-developer-interview-prep)

Resources to prepare for Java developer interviews

---

## Table of Contents

* [Core Java](#core-java)
  * [What is the difference between Comparable and Comparator?](#what-is-the-difference-between-comparable-and-comparator)
  * [How HashMap works internally?](#how-hashmap-works-internally)
* [Design Patterns](#design-patterns)
    * [What is Dependency Injection?](#what-is-dependency-injection)
    * [What is a Singleton design pattern and how it is related to Spring?](#what-is-a-singleton-design-pattern-and-how-it-is-related-to-spring)
* [Spring](#spring)
  * [What are the different types of scopes of beans in Spring?](#what-are-different-types-of-scopes-of-beans-in-spring)
  * [What is an IoC container?](#what-is-an-ioc-container)
* [React](#react)
* [Git Commands](#git-commands)
* [Coding Problems](#solving-hackerrank--leetcode-problems)
  * [Local setup](#solving-problems-locally) 

*These need to be updated:* 
* [What is Serializable interface?](#what-is-serializable-interface)
* [What is ArrayList?](#what-is-arraylist)
* [What is the difference between ArrayList and Linked List?](#what-is-the-difference-between-arraylist-and-linked-list)
* [How HashSet works internally?](#how-hashset-works-internally)
* [Difference between Spring and Spring Boot.](#difference-between-spring-and-spring-boot)
* [Difference between @RestController and @Controller annotation.](#difference-between-restcontroller-and-controller-annotation)
* [Difference between arrays and arraylist.](#difference-between-arrays-and-arraylist)
* [Why String is immutable in java and how?](#why-string-is-immutable-in-java-and-how)
* [What are wrapper classes?](#what-are-wrapper-classes)
* [What are generics?](#what-are-generics)
* [What is a Functional Interface?](#what-is-a-functional-interface)
* [What is a copy constructor?](#what-is-a-copy-constructor)
* [Can we overload the main method?](#can-we-overload-the-main-method)
* [What is the life cycle of a Thread?](#what-is-the-life-cycle-of-a-thread)
* [How we can improve the performance of queries using SQL?](#how-we-can-improve-the-performance-of-queries-using-sql)
* [What is a lambda expression?](#what-is-a-lambda-expression)
* [What are the new features of ES6?](#what-are-the-new-features-of-es6)
* [What are the features of Java 8?](#what-are-the-features-of-java-8)
* [Difference between JVM, JDK, and JRE.](#difference-between-jvm-jdk-and-jre)
* [How Java is platform independent?](#how-java-is-platform-independent)
* [What is a ContextAPI hook in React?](#what-is-a-contextapi-hook-in-react)
* [What is prop drilling in React?](#what-is-prop-drilling-in-react)
* [What is JSX?](#what-is-jsx)
* [What is an Actuator in SpringBoot?](#what-is-an-actuator-in-springboot)
* [Explain virtual DOM in react?](#explain-virtual-dom-in-react)
* [Difference between fetch and pull command in git.](#difference-between-fetch-and-pull-command-in-git)
* [What is asynchronous programming in general?](#what-is-asynchronous-programming-in-general)
* [Difference between Error and Exception in Java.](#difference-between-error-and-exception-in-java)
* [Difference between runtime exception and compile time exception.](#difference-between-runtime-exception-and-compile-time-exception)
* [State and explain different types of polymorphism in OOPs.](#state-and-explain-different-types-of-polymorphism-in-oops)
* [What is a Hibernate?](#what-is-a-hibernate)
* [Difference between Hibernate and JDBC.](#difference-between-hibernate-and-jdbc)
* [What is the use of Autowired annotation in Spring?](#what-is-the-use-of-autowired-annotation-in-spring)
* [What is a RESTful API?](#what-is-a-restful-api)
* [Difference between TreeSet and HashSet.](#difference-between-treeset-and-hashset)
* [What is a Scrum framework?](#what-is-a-scrum-framework)
* [What is the use of Static keyword in Java?](#what-is-the-use-of-static-keyword-in-java)
* [How we can make a class immutable in Java?](#how-we-can-make-a-class-immutable-in-java)
* [What is a Thread in java?](#what-is-a-thread-in-java)
* [What is an interface in Java?](#what-is-an-interface-in-java)
* [Why Java do not support multiple inheritance?](#why-java-do-not-support-multiple-inheritance)
* [Why do we need dependency injection in Java?](#why-do-we-need-dependency-injection-in-java)
* [In how many ways we can achieve dependency injection in Java and state them?](#in-how-many-ways-we-can-achieve-dependency-injection-in-java-and-state-them)
* [What is the use of POM.xml file?](#what-is-the-use-of-pomxml-file)
* [What is the use of application.properties file in a spring boot application?](#what-is-the-use-of-applicationproperties-file-in-a-spring-boot-application)
* [What is Maven?](#what-is-maven)
* [What is the difference between StringBuffer and StringBuilder?](#what-is-the-difference-between-stringbuffer-and-stringbuilder)
* [Do Java support pointers?](#do-java-support-pointers)
* [What are legacy classes(e.g HashTable)?](#what-are-legacy-classeseg-hashtable)
* [What is the use of Synchronized keyword?](#what-is-the-use-of-synchronized-keyword)
* [What is Spring Data JPA?](#what-is-spring-data-jpa)

---

## Core Java

### What is the difference between Comparable and Comparator?
`Comparable` and `Comparator` are both interfaces used for sorting objects.

#### Comparable:

- Located in the `java.lang` package
- Classes can be sorted based on the natural ordering of their instances.
- The `compareTo()` method is used to define the natural ordering of objects.
- Sorting logic is built into the [class itself](./src/main/java/com/dcat/interviewprep/Student.java) 

#### Comparator:

- Located in the `java.util` package.
- Sorts objects based on custom ordering criteria, 
- Can differ from the natural ordering defined by the objects themselves.
- The `compare()` method is used to compare two objects according to a specific ordering defined by the Comparator.
- Allows you to define multiple different sorting criteria for the same class without modifying the class itself.

[Age comparator](./src/main/java/com/dcat/interviewprep/comparator/StudentAgeComparator.java) for sorting `Students` based on their ages,  
[Grade comparator](./src/main/java/com/dcat/interviewprep/comparator/StudentGradeComparator.java) for sorting `Students` based on their grades,  


### How HashMap works internally?
`HashMap` is a data structure that implements the `Map` interface, providing 
key-value pair storage and retrieval functionality. 

Internally, `HashMap` uses an array of 'buckets' to store key-value pairs.

Each bucket is essentially a linked list of entries (or nodes), where each entry contains 
a key-value pair and a reference to the next entry in the list.

#### Hashing:
When you put a key-value pair into a HashMap, the HashMap computes the hash code of the
key using the `hashCode()` method of the key object. 

This hash code is then used to determine the index (or bucket) in the array where the 
key-value pair will be stored.

#### Bucket Selection:
Once the hash code is computed, `HashMap` uses it to determine the bucket where the 
key-value pair will be stored. 

The index of the bucket is obtained by performing a modulo operation on the hash code 
with the size of the array (number of buckets). 

This ensures that the index falls within the valid range of bucket indices.

#### Collision Handling:
Since multiple keys can have the same hash code (known as hash code collisions), 
`HashMap` handles collisions by using a linked list structure. 

If two keys hash to the same index, their key-value pairs are stored in the same bucket 
as a linked list. New entries are appended to the end of the linked list.

#### Load Factor and Rehashing:
`HashMap` maintains a load factor (default value is 0.75) that determines when the 
internal array needs to be resized and rehashed. 

When the number of entries exceeds the product of the load factor and the current 
capacity of the array, `HashMap` automatically increases the capacity of the array and
rehashes all entries to redistribute them across the new array.

#### Retrieval and Removal:
1. Compute the hash code of the key.
2. Determine the bucket where the key-value pair is stored (using modulo `%`)
3. Traverses the linked list in that bucket to find the entry with the matching key. 

Similarly, when you remove a key-value pair, `HashMap` locates the bucket and entry using 
the hash code of the key and removes the entry from the linked list.

[Example HashMap](./src/main/java/com/dcat/interviewprep/hashmap/MyHashMap.java)

--- 

## Design Patterns

### What is Dependency Injection?

#### Definition:

Dependency Injection is a design pattern where dependencies of a 
class are provided externally rather than created within the class itself.

#### Benefits:

- **Decoupling:** Allows classes to be loosely coupled, enhancing flexibility and maintainability.
- **Testability:** Simplifies unit testing by enabling easy substitution of dependencies with mocks or stubs.
- **Modularity:** Promotes modular design, making components easier to understand and maintain.

#### Types:

- **Constructor Injection:** Dependencies are provided through a class constructor.
- **Setter Injection:** Dependencies are provided through setter methods.
- **Interface Injection:** Dependencies are provided through a separate interface.

#### Frameworks:

Dependency injection frameworks like Spring facilitate automatic dependency injection based 
on configuration or annotations.

### What is a Singleton design pattern and how it is related to Spring?
The Singleton Design Pattern is a creational design pattern that
ensures a class has only one instance and provides a global point
of access to that instance.

This pattern is useful when you want
to restrict instantiation of a class to a single object, which can
be shared across different parts of your application.

#### Features

- **Single Instance**: The class should have only one instance which is shared across the application.
- **Global Access**: The instance should be globally accessible so that any part of the application can use it.

#### Implementation

Here's a simple implementation of the Singleton Pattern in Java:

```java
public class Singleton {
    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
    }

    // Public static method to get the single instance of the class
    public static Singleton getInstance() {
        // Creates the instance when needed
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods of the class
    public void showMessage() {
        System.out.println("Hello, I am a Singleton instance!");
    }
}
```

#### Advantages
- **Controlled Access**: It provides a global point of access to the instance, 
allowing controlled access to the object.
- **Memory Conservation**: It conserves memory by creating the instance only 
when it is needed (lazy initialization).
- **Global Access**: It allows the same instance to be accessed from any 
part of the application.

#### How is the Singleton pattern related to Spring
In Spring, the Singleton pattern is utilized in the management of beans within 
the [Spring IoC container](#what-is-an-ioc-container). 

By default, Spring beans are [singleton scoped](#singleton-scope), 
meaning that the Spring IoC container creates and manages only one instance 
of the bean per container. 

When you define a bean in the Spring configuration, Spring follows the 
Singleton pattern to ensure that only one instance of that bean is created
and used throughout the application context.

---


## Spring

### What are different types of scopes of beans in Spring?
In Spring Framework, beans can have different scopes, defining the 
lifecycle and visibility of bean instances within the container.


#### Singleton Scope:

- The default scope in Spring.
- Only one instance of the bean is created per [Spring IoC container](#what-is-an-ioc-container).
- The same instance is shared by all the requests for that bean.

#### Prototype Scope:

- A new instance of the bean is created each time it is requested.
- No singleton behavior; a new object is returned every time.
- Useful for stateful beans where each instance needs to be unique.

#### Request Scope:

- A new instance of the bean is created for each HTTP request.
- Beans are bound to the lifecycle of a single HTTP request.
- Scoped to the lifecycle of a web request; only valid in the context of a web-aware [Spring ApplicationContext](#spring-applicationcontext).

#### Session Scope:

- A new instance of the bean is created for each HTTP session.
- Beans are bound to the lifecycle of an HTTP session.
- Scoped to the lifecycle of an HTTP Session; only valid in the context of a web-aware  [Spring ApplicationContext](#spring-applicationcontext).

#### Global Session Scope:

- Similar to session scope, but it's applicable in a portlet-based web application.
- Beans are bound to the lifecycle of a global HTTP session.
- Scoped to the lifecycle of a global HTTP Session; only valid in the context of a web-aware [Spring ApplicationContext](#spring-applicationcontext).

#### Application Scope:

- **Deprecated since Spring 3.0.**
- A single instance of the bean is created for each ServletContext.
- It's similar to Singleton scope but is bound to ServletContext instead of Spring IoC container.

### What is an IoC container?
In software engineering, an Inversion of Control (IoC) container, 
often referred to as an IoC container or simply a container, is a component 
responsible for managing the lifecycle of objects and their dependencies. 

It implements the Inversion of Control principle, where the control of the flow of a program is inverted: instead of the application code controlling the creation and management of objects, the container takes over these responsibilities.

#### Key features of an IoC container include:

- [Dependency Injection (DI):](#what-is-dependency-injection) The container injects dependencies into objects when they are created, removing the responsibility of object creation and dependency resolution from the application code.
- [Lifecycle Management:](#lifecyle-management) The container manages the lifecycle of objects, including their creation, initialization, and destruction. It ensures that objects are created and destroyed appropriately based on their scope.
- [Configuration Management:](#configuration-management) Configuration metadata, such as bean definitions and dependencies, is provided to the container, typically through XML configuration files, annotations, or Java-based configuration classes. The container uses this metadata to create and configure objects.
- [Singleton Management:](#what-is-a-singleton-design-pattern-and-how-it-is-related-to-spring) The container can manage singleton objects, ensuring that only one instance of a bean is created and shared within the application context.

#### Spring ApplicationContext
Spring Framework provides an IoC container known as the Spring IoC container or ApplicationContext. 

Features:
- Dependency injection, 
- Aspect-oriented programming 
- Transaction management
- Powerful tool for building enterprise applications 

Other IoC containers exist in various programming languages and frameworks, 
each with its own set of features and capabilities.

---

## React

---

## Git Commands
```bash
# To show if files are added, ready to commit, untracked
git status

# To show history of all the commits
git log --oneline --all --graph 

# shows file changes within files
git diff 
```

```bash
# prepares all files/directories to be commit
git add .

# one file
git add src/test.java

# everything in src folder
git add src/

git commit -m "Commit message"
# add and commit
git commit -am "commit message"
```

```bash
git switch -C new-branch-name
git switch branch-name

# Switch to existing branch
git checkout branch-name
# Creates new branch and switches
git checkout -b branch-name
```

```bash
git push -u origin feature/branch
```

```bash
# To fetch remote branch changes and merge them in your local repo
git pull 
# To make changes of git hub available to your local repo
git pull origin 
```

```bash
# To merge the branch into the branch to which Head is pointing towards
git merge branch-name 
```

```bash
# To show branches in your local git repo
git branch 
# To show the remote branches available in your local git repo
git branch -r 
```

### To delete the branch once you are done with your branch:
```bash
# will delete the local branch on your local repo
git branch -d branch-name 
# will delete the origin/branch-name
git push -d origin branch-name 
git remote prune origin
```

---

## Solving HackerRank / LeetCode Problems

### Solving Problems Locally

- [LeetCode](./src/main/java/com/dcat/interviewprep/problems/LeetCode.java)
- [HackerRank](./src/main/java/com/dcat/interviewprep/problems/HackerRank.java)

1. Copy function as a static method

2. Create comment above the function.
*type `/**` then `Enter`*
```java
/**
 *<h1>
 *    <a href="CHANGE_THIS_TO_THE_URL">
 *      CHANGE_THIS_TO_PROBLEM_TITLE
 *    </a>
 * </h1>
 * <p>
 *     DESCRIPTION
 * </p>
 * @param nums
 * @return expected A number that we want
 */
static public int removeDuplicates(int[] nums) {
    int expected = 0;
    
    return expected;
}
```

3. Generate test for function with `command` + `N`.

4. copy test cases
```java
@Test
void removeDuplicatesTest() {
    int[] case1 = {1,1,2};
    int[] case2 = {0,0,1,1,1,2,2,3,3,4};


    assertEquals(removeDuplicates(case1), 2);
    assertEquals(removeDuplicates(case2), 5);

}
```

---



### What is Serializable interface?
### What is ArrayList?
### What is the difference between ArrayList and Linked List?
### How HashSet works internally?
### Difference between Spring and Spring Boot.
### Difference between @RestController and @Controller annotation.
### Difference between arrays and arraylist.
### Why String is immutable in java and how?
### What are wrapper classes?
### What are generics?
### What is a Functional Interface?
### What is a copy constructor?
### Can we overload the main method?
### What is the life cycle of a Thread?
### How we can improve the performance of queries using SQL?
### What is a lambda expression?
### What are the new features of ES6?
### What are the features of Java 8?
### Difference between JVM, JDK, and JRE.
### How Java is platform independent?
### What is a ContextAPI hook in React?
### What is prop drilling in React?
### What is JSX?
### What is an Actuator in SpringBoot?
### Explain virtual DOM in react?
### Difference between fetch and pull command in git.
### What is asynchronous programming in general?
### Difference between Error and Exception in Java.
### Difference between runtime exception and compile time exception.
### State and explain different types of polymorphism in OOPs.
### What is a Hibernate?
### Difference between Hibernate and JDBC.
### What is the use of Autowired annotation in Spring?
### What is a RESTful API?
### Difference between TreeSet and HashSet.
### What is a Scrum framework?
### What is the use of Static keyword in Java?
### How we can make a class immutable in Java?
### What is a Thread in java?
### What is an interface in Java?
### Why Java do not support multiple inheritance?
### Why do we need dependency injection in Java?
### In how many ways we can achieve dependency injection in Java and state them?
### What is the use of POM.xml file?
### What is the use of application.properties file in a spring boot application?
### What is Maven?
### What is the difference between StringBuffer and StringBuilder?
### Do Java support pointers?
### What are legacy classes(e.g HashTable)?
### What is the use of Synchronized keyword?
### What is Spring Data JPA?

---

## Acknowledgements

--- 

## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://dcatuns.vercel.app/)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/devin-catuns/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/)

---
## Buy me a coffee

Whether you use this project, have learned something from it,
or just like it, please consider supporting it by buying me a coffee,
so I can dedicate more time on open-source projects like this :)

<a href="https://www.buymeacoffee.com/devincatunj" target="_blank"><img src="https://www.buymeacoffee.com/assets/img/custom_images/orange_img.png" alt="Buy Me A Coffee" style="height: auto !important;width: auto !important;" ></a>

---

## Feedback

If you have any feedback, please reach out to us at `devincatuns1@gmail.com`

