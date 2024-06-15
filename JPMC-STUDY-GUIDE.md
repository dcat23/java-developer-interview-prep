# JPMC Study Guide

## Table of Contents
* [Can you explain Spring MVC flow?](#can-you-explain-spring-mvc-flow)
* [What are the bean scopes available in spring?](#what-are-the-bean-scopes-available-in-spring)
* [How do we create a single class java methodology?](#how-do-we-create-a-single-class-java-methodology)
* [How do we block the bad request before reaching the controller?](#how-do-we-block-the-bad-request-before-reaching-the-controller)
* [What is the purpose of using Kafka?](#what-is-the-purpose-of-using-kafka)
* [What are the closures in JavaScript?](#what-are-the-closures-in-javascript)
* [Microservices: if Service A is talking to Service B, how do you handle it?](#in-a-microservices-architecture-if-service-a-is-talking-to-service-b-how-do-you-handle-it)
* [How do you declare a singleton class?](#how-do-you-declare-a-singleton-class)
* [In Spring, what are the different singleton beans available?](#in-spring-what-are-the-different-singleton-beans-available)
* [What is the default scope of beans in Spring?](#what-is-the-default-scope-of-beans-in-spring)
* [What is dependency injection?](#what-is-dependency-injection)
* [How do you validate the headers before they reach the controller?](#how-do-you-validate-the-headers-before-they-reach-the-controller)
* [Explain the process/flow of MVC.](#explain-the-processflow-of-mvc)
* [SQL: Difference between the "WHERE" and "HAVING" clause?](#sql-question-what-is-the-difference-between-the-where-clause-and-the-having-clause)
* [You have a complex SQL query with slow performance. How would you optimize the given query?](#you-have-a-complex-sql-query-with-slow-performance-how-would-you-optimize-the-given-query)
* [In Java, how do hash maps work internally?](README.md#how-hashmap-works-internally)
* [In what scenarios do we use Comparable?](#in-what-scenarios-do-we-use-comparable)
* [How do you secure REST APIs?](#how-do-you-secure-rest-apis)
* [What are the AWS services you have experience with?](#what-are-the-aws-services-you-have-experience-with)
* [Explain the CI/CD flow.](#explain-the-cicd-flow)
* [What are the storage levels for S3, and what are the storage patterns?](#what-are-the-storage-levels-for-s3-and-what-are-the-storage-patterns)


## Responsibilities
- A clear communicator who is curious and embraces continuous improvement

- Independently delivers high-quality, testable, and maintainable code 
within planned timeframes

- Design and build support for non-functional requirements such as security, 
performance, resiliency, fault-tolerance, monitoring, alerting, reporting, etc.

- Apply system thinking and methodologies, to decompose complex use cases into 
elegant solutions

- Analyze, design, develop, and troubleshoot with consideration of upstream 
and downstream systems and technical implications

- Drive requirements discussions with a consultative and solution-oriented 
approach with ability to influence

- Apply knowledge of tools within the SDLC toolchain to apply automation

- Add to a team culture of diversity, equity, inclusion, and respect


## Required qualifications, capabilities, and skills

- Formal training or certification on software engineering concepts 
- 3+ years applied experience
- Multiple years of recent experience with Angular, TypeScript, CSS, HTML required
- Professional coding experience with Java, Spring Boot, JPA, SQL,
- REST Experience with full SDLC – analysis, research, design, development,
testing, documentation, implementation, deployment, maintenance, monitoring, 
and troubleshooting support
- Solid understanding of DevOps principles, CI/CD, Git/Bitbucket, branching/merging, 
npm, Maven
- Experience with agile and scrum processes applicable to product development and delivery
AWS Cloud experience

## Questions

1. Tell me something about your experience.
2. How were you deploying applications?
3. Brief us about your exp and tech stacks currently using or used in the recent project?
4. What are the AWS services you have experience with?

### I have a UI application, the data need to be stored and send it to the downstream application for further processing how do you design this whole process?

## Technical Questions

### Can you explain Spring MVC flow?

1. **Client Request**: The client sends a request to the server.
2. **DispatcherServlet**: The request is received by the DispatcherServlet.
3. **Handler Mapping**: DispatcherServlet consults HandlerMapping to find the appropriate Controller.
4. **Controller**: The request is forwarded to the Controller.
5. **Model**: The Controller processes the request, interacts with the Model, and prepares data.
6. **View Resolver**: The Controller returns a View name to the DispatcherServlet.
7. **Render View**: The ViewResolver resolves the view, and the DispatcherServlet renders it.
8. **Response**: The rendered view is sent back to the client as the response.

This flow ensures separation of concerns, making the application easier to manage and scale.

### What are the bean scopes available in spring? 

1. **Singleton**: One instance per Spring container (default scope).
2. **Prototype**: A new instance for each request.
3. **Request**: One instance per HTTP request (only for web applications).
4. **Session**: One instance per HTTP session (only for web applications).
5. **Application**: One instance per ServletContext (only for web applications).
6. **WebSocket**: One instance per WebSocket (only for web applications).

### How do we create a singleton class java methodology?
1. **Private Constructor**: Prevents instantiation from other classes.
2. **Private Static Instance**: Holds the single instance of the class.
3. **Public Static Method**: Provides a global access point to the instance.

```java
public class Singleton {
    // Private static instance
    private static Singleton instance;
    
    // Private constructor
    private Singleton() {}

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

### How do we block the bad request before reaching the controller?

You can use an interceptor or a filter

1. **Create Interceptor**: Implement `HandlerInterceptor` and override `preHandle` method.
2. **Configure Interceptor**: Register the interceptor in a configuration class.

```java
public class RequestInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // Add logic to block bad requests
        if (isBadRequest(request)) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
            return false;
        }
        return true;
    }
    
    private boolean isBadRequest(HttpServletRequest request) {
        // Define logic to determine if request is bad
        return false; // Example logic
    }
}

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new RequestInterceptor());
    }
}
```

### What is the purpose of using Kafka?

Used for building real-time data pipelines and streaming applications 
due to its robustness and scalability.

1. **Real-Time Data Streaming**: Kafka is designed to handle real-time data feeds efficiently.
2. **Scalability**: Kafka can handle large-scale data streams and is easily scalable horizontally.
3. **Durability**: Kafka stores data reliably and durably using distributed log storage.
4. **High Throughput**: Kafka provides high throughput for both publishing and subscribing.
5. **Fault Tolerance**: Kafka replicates data across multiple servers to ensure fault tolerance.
6. **Decoupling Systems**: Kafka decouples producers and consumers, enabling asynchronous communication.
7. **Event Sourcing**: Kafka can be used for event sourcing, capturing changes in state as a sequence of events.
8. **Stream Processing**: Kafka integrates with stream processing frameworks like Kafka Streams and Apache Flink for real-time data processing.

### What are the closures in JavaScript?

**Closures in JavaScript**:

1. **Definition**: A closure is a function that has access to its own scope, the scope of the outer function, and the global scope.
2. **Scope Access**: Closures allow functions to access variables from an enclosing scope, even after the outer function has finished executing.

```javascript
function outerFunction() {
    let outerVariable = 'I am from outer scope';

    function innerFunction() {
        console.log(outerVariable); // Accesses outerVariable from outerFunction
    }

    return innerFunction;
}

const closureFunction = outerFunction();
closureFunction(); // Output: 'I am from outer scope'
```
**Use Cases**:
Data Privacy: Encapsulating data and creating private variables.
Callbacks: Passing functions as arguments and maintaining scope.
Function Factories: Creating functions dynamically with specific environments.

### In a microservices architecture, if Service A is talking to Service B, how do you handle it? 

1. **RESTful APIs**:
    - **HTTP/HTTPS**: Service A calls Service B using standard HTTP/HTTPS protocols.
    - **Endpoints**: Define and expose RESTful endpoints in Service B.
    - **Tools**: Use tools like Postman for testing and Swagger for API documentation.

```java
// Example using Spring RestTemplate in Service A
@RestController
public class ServiceAController {
    
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/callServiceB")
    public String callServiceB() {
        String serviceBResponse = restTemplate.getForObject("http://service-b/api/resource", String.class);
        return serviceBResponse;
    }
}

@Bean
public RestTemplate restTemplate() {
    return new RestTemplate();
}
```

2. **Service Discovery**:
   - **Registry**: Use a service registry like Eureka, Consul, or Zookeeper to manage service instances.
   - **Discovery Client**: Service A can dynamically discover Service B using the registry.

```java
// Example using Spring Cloud Netflix Eureka
@EnableEurekaClient
@SpringBootApplication
public class ServiceAApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAApplication.class, args);
    }
}

@Service
public class ServiceA {
    @Autowired
    private DiscoveryClient discoveryClient;

    public String callServiceB() {
        List<ServiceInstance> instances = discoveryClient.getInstances("service-b");
        ServiceInstance serviceBInstance = instances.get(0);
        String serviceBUrl = serviceBInstance.getUri().toString() + "/api/resource";
        return restTemplate.getForObject(serviceBUrl, String.class);
    }
}
```
3. **Message Brokers**:
   - **Asynchronous Communication**: Use message brokers like Kafka, RabbitMQ, or AWS SQS for asynchronous communication.
   - **Event-Driven**: Service A publishes messages/events to a topic/queue, and Service B subscribes to them.

### In Spring, what are the different singleton beans available?

In Spring, there are primarily two types of singleton beans:

1. **Default Singleton Beans**:
    - Created once per Spring IoC container.
    - Typical scope for beans unless specified otherwise.

2. **Lazy Initialization Singleton Beans**:
    - Created when first requested, rather than at container startup.
    - Defined using `@Lazy` annotation or `lazy-init="true"` in XML configuration.

### What is the default scope of beans in Spring?

The default scope of beans in Spring is **singleton**.

This means that Spring creates and manages only one instance of 
the bean per Spring IoC container.

### What is dependency injection?

Dependency Injection (DI) is a design pattern in which the dependencies 
of a class are provided externally rather than created within the class itself.

It helps in achieving *loose coupling* between classes by allowing dependencies 
to be injected from outside

Typically through:
- constructor injection
- setter injection 
- field injection


[//]: # (When making an HTTP request, there are some headers coming in. )

### How do you validate the headers before they reach the controller?

To validate HTTP headers before they reach the controller in a Spring application, you can use a `HandlerInterceptor` or a `Filter`:

1. **HandlerInterceptor Approach**:
   - Implement `HandlerInterceptor` and override `preHandle` method.
   - Register the interceptor in a configuration class.
   - **Example**:
     - [HeaderValidationInterceptor.java](demo%2Fsrc%2Fmain%2Fjava%2Fcom%2Fdcat23%2Fspring%2Fdemo%2FheaderValidation%2FHeaderValidationInterceptor.java)
     - [WebConfig.java](demo%2Fsrc%2Fmain%2Fjava%2Fcom%2Fdcat23%2Fspring%2Fdemo%2FheaderValidation%2FWebConfig.java)

2. **Filter Approach**:
   - Implement Filter and override doFilter method.
   - Register the filter in a configuration class.
   - **Example**:
   - [HeaderValidationFilter.java](demo%2Fsrc%2Fmain%2Fjava%2Fcom%2Fdcat23%2Fspring%2Fdemo%2FheaderValidation%2FHeaderValidationFilter.java)
   - [FilterConfig.java](demo%2Fsrc%2Fmain%2Fjava%2Fcom%2Fdcat23%2Fspring%2Fdemo%2FheaderValidation%2FFilterConfig.java)

### Explain the process/flow of MVC.

The MVC (Model-View-Controller) architectural pattern divides an application into three interconnected components:

1. **Model**:
   - Represents the data and business logic of the application.
   - Interacts with the database or other data sources.
   - Often consists of POJOs (Plain Old Java Objects) or entities.

2. **View**:
   - Represents the presentation layer of the application.
   - Displays the data from the Model to the user.
   - Typically consists of HTML, JSP, Thymeleaf templates, etc.

3. **Controller**:
   - Handles user requests and acts as an intermediary between Model and View.
   - Processes incoming requests, retrieves data from the Model, and selects the appropriate View to render the response.
   - Typically consists of Java classes annotated with `@Controller` in Spring MVC.

### Flow of MVC:

1. **Client Request**:
   - The user interacts with the application through a web browser or client-side application.
   - Sends a request to the server.

2. **DispatcherServlet**:
   - Central front controller in Spring MVC.
   - Receives all incoming requests.
   - Acts as the entry point for all requests, managing the flow of requests to the appropriate controllers.

3. **Handler Mapping**:
   - DispatcherServlet consults the HandlerMapping to determine which controller should handle the request based on the URL pattern.

4. **Controller**:
   - DispatcherServlet dispatches the request to the appropriate controller based on the mapping.
   - Controller processes the request, interacts with the Model to retrieve or update data.

5. **Model**:
   - Contains the application's data and business logic.
   - Controller interacts with the Model to retrieve or update data as required by the request.

6. **View Resolver**:
   - After processing the request, the Controller returns the name of the View to the DispatcherServlet.
   - ViewResolver resolves the logical View name to an actual View (JSP, Thymeleaf template, etc.).

7. **Render View**:
   - The resolved View is rendered to generate the response.
   - Populates the view with data from the Model (if necessary).

8. **Response**:
   - The rendered View is sent back to the client as the HTTP response.
   - Client sees the updated UI or response based on the initial request.

This flow ensures separation of concerns, where each component (Model, View, Controller) handles 
a specific aspect of the application's functionality, promoting modularity, maintainability, and testability.

### You have a complex SQL query with slow performance. How would you optimize the given query?

To optimize a complex SQL query with slow performance, here are several approaches:

1. **Index Optimization**:
   - Identify columns used in WHERE, JOIN, and ORDER BY clauses.
   - Add appropriate indexes to these columns to speed up data retrieval.
   - Avoid over-indexing, as it can impact write performance.

2. **Query Rewriting**:
   - Analyze the query execution plan using `EXPLAIN` (or equivalent) to identify bottlenecks.
   - Rewrite the query to use efficient JOINs, subqueries, and WHERE conditions.
   - Simplify complex logic and eliminate unnecessary calculations.

3. **Data Normalization and Denormalization**:
   - Normalize tables to reduce redundancy and improve data integrity.
   - Denormalize tables for read-heavy operations to reduce JOIN operations.

4. **Use of Caching**:
   - Utilize caching mechanisms (application-level caching, query result caching, etc.) to store frequently accessed data.
   - Reduces database load and improves response time for repetitive queries.

5. **Query and Index Statistics**:
   - Update statistics regularly to help the query optimizer generate efficient execution plans.
   - Monitor and analyze query execution times and adjust indexing strategies accordingly.

6. **Database Schema and Configuration Tuning**:
   - Adjust database configuration parameters such as memory allocation, buffer sizes, and parallelism settings.
   - Ensure optimal configuration for the underlying hardware and storage.

7. **Query Optimization Techniques**:
   - Use appropriate SQL constructs like EXISTS, IN, and NOT EXISTS instead of NOT IN for better performance.
   - Limit the use of DISTINCT and ORDER BY clauses if possible.

8. **Partitioning**:
   - Partition large tables based on criteria such as date range or key ranges to improve query performance.
   - Distribute data across multiple physical storage devices.

9. **Review and Optimize Application Code**:
   - Check application code for inefficient data retrieval patterns.
   - Optimize ORM mappings and data access patterns to minimize unnecessary queries.

10. **Database Tuning Tools**:
   - Utilize database-specific tuning tools and profilers to identify performance bottlenecks.
   - Monitor database performance metrics and optimize based on findings.

By systematically applying these optimization techniques, the performance of a complex 
SQL query can be significantly improved.

Ensuring efficient data retrieval and application responsiveness.

### In Java, how do hash maps work internally? 

In Java, `HashMap` works internally using an array of linked lists (also known as buckets). Here’s a concise explanation of how `HashMap` operates internally:

* **Hashing**: Converts keys to array indices.
* **Buckets**: Array of linked lists (or trees) to handle collisions.
* **Collision Handling**: Linked lists for small collisions, trees for larger collisions.
* **Resizing**: Dynamically adjusts size to maintain performance.

1. **Hashing**:
   - When a key-value pair is inserted, the key’s hash code is computed using the `hashCode()` method.
   - The hash code is then transformed into an array index using the formula: `index = hashCode % arrayLength`.

2. **Buckets**:
   - The array index determines which bucket (linked list) will store the entry.
   - Each bucket can store multiple entries to handle hash collisions (when different keys produce the same index).

3. **Entry (Node) Structure**:
   - Each entry in the `HashMap` is represented by a `Node` (or `Entry`) object.
   - The `Node` contains the key, value, hash code, and a reference to the next `Node` in the bucket (linked list).

4. **Collision Handling**:
   - If a collision occurs (multiple keys hash to the same bucket), the new entry is added to the linked list within that bucket.
   - Java 8 and later versions convert linked lists to balanced trees (red-black trees) if the number of entries in a bucket exceeds a certain threshold (`TREEIFY_THRESHOLD`) to improve lookup performance.

5. **Retrieval**:
   - To retrieve a value, the key’s hash code is computed and the appropriate bucket is located using the same hash code transformation.
   - The bucket is traversed (or the tree is searched) to find the entry with the matching key.

6. **Resizing**:
   - When the number of entries exceeds the product of the load factor and the current capacity (`loadFactor * capacity`), the `HashMap` is resized (doubled in size) to maintain efficient performance.
   - During resizing, all entries are rehashed and redistributed into the new array of buckets.

**Example**:

```java
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insert key-value pairs
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Retrieve values
        System.out.println(map.get("one"));   // Output: 1
        System.out.println(map.get("two"));   // Output: 2
        System.out.println(map.get("three")); // Output: 3
    }
}
```

### In what scenarios do we use Comparable?

We use `Comparable` in Java in the following scenarios:

1. **Sorting Collections**:
   - To sort a collection of objects using `Collections.sort()` or `Arrays.sort()`.
   - Example:
     ```java
     public class Person implements Comparable<Person> {
         private String name;
         private int age;

         public Person(String name, int age) {
             this.name = name;
             this.age = age;
         }

         @Override
         public int compareTo(Person other) {
             return this.age - other.age; // Sort by age
         }
     }

     List<Person> people = new ArrayList<>();
     people.add(new Person("Alice", 30));
     people.add(new Person("Bob", 25));
     Collections.sort(people); // Sorts by age
     ```

2. **TreeSet and TreeMap**:
   - When using `TreeSet` or `TreeMap`, elements or keys must implement `Comparable` to maintain order.
   - Example:
     ```java
     TreeSet<Person> personSet = new TreeSet<>();
     personSet.add(new Person("Alice", 30));
     personSet.add(new Person("Bob", 25));
     ```

3. **PriorityQueue**:
   - Elements in a `PriorityQueue` must implement `Comparable` to determine their natural ordering.
   - Example:
     ```java
     PriorityQueue<Person> queue = new PriorityQueue<>();
     queue.add(new Person("Alice", 30));
     queue.add(new Person("Bob", 25));
     ```

These scenarios leverage `Comparable` to define and maintain a natural ordering of objects.

### How do your secure REST APIs?

Securing REST APIs involves multiple layers of security measures to ensure data integrity, confidentiality, and authentication. Here are some key methods:

1. **Authentication and Authorization**:
   - **OAuth2**: Use OAuth2 for token-based authentication.
   - **JWT (JSON Web Tokens)**: Issue JWT tokens for stateless authentication.
   - [SecurityConfig.java](demo%2Fsrc%2Fmain%2Fjava%2Fcom%2Fdcat23%2Fspring%2Fdemo%2Fconfig%2FSecurityConfig.java)

2. **HTTPS**:
   - Use HTTPS to encrypt data in transit.
   - Example: Configure your server (e.g., Tomcat, Nginx) to use HTTPS with a valid SSL certificate.

3. **API Key**:
   - Implement API key authentication for public APIs.
   - [ApiKeyFilter.java](demo%2Fsrc%2Fmain%2Fjava%2Fcom%2Fdcat23%2Fspring%2Fdemo%2Fconfig%2FApiKeyFilter.java)

4. **Rate Limiting**:
   - Implement rate limiting to prevent abuse and DoS attacks.
   - Example: Use a library like Bucket4j or an API gateway like Kong.

5. **Input Validation**:
   - Validate all incoming data to prevent SQL injection, XSS, and other injection attacks.
   - [Example: Use validation annotations in Spring.](demo/src/main/java/com/dcat23/spring/demo/model/User.java)

6. **CORS (Cross-Origin Resource Sharing)**:
   - Configure CORS to control which domains can access your API.
   - [CorsConfig.java](demo%2Fsrc%2Fmain%2Fjava%2Fcom%2Fdcat23%2Fspring%2Fdemo%2Fconfig%2FCorsConfig.java)

7. **Logging and Monitoring**:
   - Implement logging and monitoring to detect and respond to suspicious activities.
   - Example: Use tools like ELK stack (Elasticsearch, Logstash, Kibana) or Prometheus and Grafana.

By combining these methods, you can effectively secure your REST APIs and protect your application from various security threats.

### Explain the CI/CD flow

Continuous Integration and Continuous Deployment practices enable 
frequent, reliable, and automated code changes. 

#### CI/CD Pipeline Example with Jenkins

- **CI** focuses on integrating code changes frequently, with automated testing to catch issues early.
- **CD** ensures that code is always in a deployable state and automates deployment to staging and production environments.
- **Automation** is key in both CI and CD to reduce manual effort and increase reliability.
- **Jenkinsfile**:
    ```groovy
    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    sh 'mvn clean package'
                }
            }
            stage('Test') {
                steps {
                    sh 'mvn test'
                }
            }
            stage('Deploy to Staging') {
                steps {
                    deploy to: 'staging'
                }
            }
            stage('Approval') {
                steps {
                    input 'Deploy to Production?'
                }
            }
            stage('Deploy to Production') {
                steps {
                    deploy to: 'production'
                }
            }
        }
    }
    ```

1. **Continuous Integration (CI)**

#### Code Commit
- **Developers** write code and commit changes to the version control system (e.g., Git).

#### Automated Testing
- **Unit Tests**: Automatically run unit tests to ensure individual components work as expected.
- **Integration Tests**: Automatically run integration tests to verify that components work together.
- **Static Code Analysis**: Tools like SonarQube check code quality and adherence to coding standards.

#### Build
- **Build Automation**: Tools like Maven or Gradle compile the code, package it (e.g., into a JAR or WAR file), and prepare it for deployment.
- **Artifact Storage**: Built artifacts are stored in an artifact repository like Nexus or Artifactory.

2. **Continuous Delivery (CD)**

#### Staging Environment
- **Deployment to Staging**: Deploy the built artifacts to a staging environment that mimics production.
- **Manual/Automated Tests**: Run additional tests, including system tests, load tests, and user acceptance tests (UAT).

#### Approval Process
- **Manual Approval**: Optionally, require manual approval before deploying to production. This step can be automated in a Continuous Deployment setup.

3. **Continuous Deployment (CD)**

#### Production Deployment
- **Automated Deployment**: Deploy to production automatically if all tests pass and any required approvals are granted.
- **Blue-Green Deployment**: Deploy to a new environment while the old one remains live to ensure zero downtime.
- **Canary Deployment**: Gradually roll out the update to a small subset of users before full deployment.

#### Monitoring and Feedback
- **Monitoring**: Use tools like Prometheus, Grafana, or New Relic to monitor application performance and health.
- **Logging**: Implement centralized logging with tools like ELK stack (Elasticsearch, Logstash, Kibana) for error detection and analysis.
- **Feedback Loop**: Quickly address any issues detected in production and feed back into the development cycle.

#### Example CI/CD Tools

- **CI Tools**: Jenkins, CircleCI, Travis CI, GitHub Actions, GitLab CI/CD.
- **CD Tools**: Spinnaker, Argo CD, Octopus Deploy.
- **Version Control**: Git (GitHub, GitLab, Bitbucket).

By implementing CI/CD, development teams can deliver software more quickly, 
with higher quality and reliability.

### What is the difference between the "WHERE" clause and the "HAVING" clause?

Both are used to filter records in SQL queries

#### `WHERE` Clause
- **Purpose**: Filters rows before any grouping is done.
- **Usage**: Applies to individual rows.
- **Context**: Used with `SELECT`, `UPDATE`, `DELETE` statements.
- **Aggregate Functions**: Cannot use aggregate functions directly.

Example:
```sql
SELECT * FROM employees
WHERE salary > 50000;
```

#### `HAVING` Clause
- **Purpose**: Filters groups after the grouping is done.
- **Usage**: Applies to grouped rows.
- **Context**: Used with SELECT statements that include GROUP BY.
- **Aggregate Functions**: Can use aggregate functions.

- **Example**:
   ```sql
   SELECT department, AVG(salary) as avg_salary
   FROM employees
   GROUP BY department
   HAVING AVG(salary) > 60000;
   ```

### What are the storage levels for S3, and what are the storage patterns?

#### Amazon S3 Storage Classes

1. **S3 Standard**
   - **Use Case**: Frequently accessed data.
   - **Features**: Low latency, high throughput, high durability (99.999999999%).

2. **S3 Intelligent-Tiering**
   - **Use Case**: Unknown or unpredictable access patterns.
   - **Features**: Automatically moves data between two access tiers (frequent and infrequent) based on changing access patterns.

3. **S3 Standard-IA (Infrequent Access)**
   - **Use Case**: Data that is less frequently accessed but requires rapid access when needed.
   - **Features**: Lower cost compared to S3 Standard, with a retrieval fee.

4. **S3 One Zone-IA**
   - **Use Case**: Infrequently accessed data stored in a single Availability Zone.
   - **Features**: Lower cost compared to S3 Standard-IA, suitable for data that can be recreated if lost.

5. **S3 Glacier**
   - **Use Case**: Archive data that is infrequently accessed and retrieval times of minutes to hours are acceptable.
   - **Features**: Very low cost, suitable for long-term backups and archives.

6. **S3 Glacier Deep Archive**
   - **Use Case**: Long-term archival with retrieval times of hours.
   - **Features**: Lowest cost storage, suitable for data that rarely needs to be accessed.

#### Storage Patterns

1. **Active Storage**:
   - **Use Case**: Frequently accessed, dynamic content such as media files, logs, or data used in real-time applications.
   - **Storage Class**: S3 Standard or S3 Intelligent-Tiering.

2. **Backup and Restore**:
   - **Use Case**: Regularly backed up data, with infrequent restores.
   - **Storage Class**: S3 Standard-IA, S3 One Zone-IA.

3. **Archive**:
   - **Use Case**: Long-term data retention for compliance, historical records.
   - **Storage Class**: S3 Glacier, S3 Glacier Deep Archive.

4. **Big Data Analytics**:
   - **Use Case**: Data lakes for large-scale data analytics.
   - **Storage Class**: S3 Standard or S3 Intelligent-Tiering.

5. **Disaster Recovery**:
   - **Use Case**: Data replication for disaster recovery.
   - **Storage Class**: S3 Standard-IA, S3 One Zone-IA for secondary copies.

You can optimize costs and performance based on your data access needs and lifecycle requirements.

## System Design
