# Java Dev Interview Prep 
[![GitHub Stars](https://img.shields.io/github/stars/dcat23/interview-prep.svg)](https://github.com/dcat23/interview-prep/stargazers)
[![GitHub Issues](https://img.shields.io/github/issues/dcat23/interview-prep.svg)](https://github.com/dcat23/interview-prep/issues)
[![Current Version](https://img.shields.io/badge/version-0.0.0-green.svg)](https://github.com/dcat23/interview-prep)

Resources to prepare for Java developer interviews

---

## Table of Contents
* [Design Patterns](#design-patterns)
    * [What is Dependency Injection?](#what-is-dependency-injection)
* [Spring](#spring)
  * [What are different types of scopes of beans in Spring?](#what-are-different-types-of-scopes-of-beans-in-spring)
    * [Singleton](#singleton-scope)
    * [Prototype](#prototype-scope)
    * [Request](#request-scope)
    * [Session](#session-scope)
    * [Global Session](#global-session-scope)
    * [Application](#Application-scope)
  * [What is an IOC container?](#what-is-an-ioc-container)
* [What is a Singleton design pattern and how it is related to Spring?](#what-is-a-singleton-design-pattern-and-how-it-is-related-to-spring) 
* [What is the difference between Comparable and Comparator?](#what-is-the-difference-between-comparable-and-comparator) 
* [What is Serializable interface?](#what-is-serializable-interface)
* [What is ArrayList?](#what-is-arraylist)
* [What is the difference between ArrayList and Linked List?](#what-is-the-difference-between-arraylist-and-linked-list)
* [How HashMap works internally?](#how-hashmap-works-internally)
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
* [What is asysnchronous programming in general?](#what-is-asysnchronous-programming-in-general)
* [Difference between Error and Exception in Java.](#difference-between-error-and-exception-in-java)
* [Difference between runtime exception and compile time exception.](#difference-between-runtime-exception-and-compile-time-exception)
* [State and explain different types of polymorphism in OOPs.](#state-and-explain-different-types-of-polymorphism-in-oops)
* [What is a Hibernate?](#what-is-a-hibernate)
* [Difference between Hibernate and JDBC.](#difference-between-hibernate-and-jdbc)
* [What is the use of Autowired annotation in Spring?](#what-is-the-use-of-autowired-annotation-in-spring)
* [What is a RESTfull API?](#what-is-a-restfull-api)
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
## Design Patterns

### What is Dependency Injection?

#### Definition:

Dependency Injection (DI) is a design pattern where dependencies of a 
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

### What is an IOC container?
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


### What is a Singleton design pattern and how it is related to Spring?
### What is the difference between Comparable and Comparator?
### What is Serializable interface?
### What is ArrayList?
### What is the difference between ArrayList and Linked List?
### How HashMap works internally?
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
### What is asysnchronous programming in general?
### Difference between Error and Exception in Java.
### Difference between runtime exception and compile time exception.
### State and explain different types of polymorphism in OOPs.
### What is a Hibernate?
### Difference between Hibernate and JDBC.
### What is the use of Autowired annotation in Spring?
### What is a RESTfull API?
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
