# Spring

## Table of Contents

* [What is the Spring Boot?](#what-is-the-spring-boot)
* [Difference Between Spring and Spring Boot?](#difference-between-spring-and-spring-boot)
* [Spring vs Spring MVC vs Spring Boot](#spring-vs-spring-mvc-vs-spring-boot)
* [Explain `@SpringBootApplication`, `@Configuration` and `@ComponentScan` annotations](#explain-springbootapplication-configuration-and-componentscan-annotations)
* [Why do we need a spring-boot-maven plugin?](#why-do-we-need-a-spring-boot-maven-plugin)
* [@RestController vs @Controller in Spring Boot?](#restcontroller-vs-controller-in-spring-boot)
* [How to Implement Security for Spring Boot Application?](#how-to-implement-security-for-spring-boot-application)
* [What is Spring JPA](#what-is-spring-jpa)

## What is the Spring Boot?

    Spring Boot is a framework that simplifies the development of
    Spring applications

- **Auto-configuration**: Automatically configures your Spring application based on the jar dependencies you have added.
- **Standalone**: Creates standalone Spring applications that can be run with a simple `java -jar` command.
- **Embedded Servers**: Comes with embedded Tomcat, Jetty, or Undertow servers, eliminating the need for deploying WAR
  files.
- **Production-ready Features**: Includes features like metrics, health checks, and externalized configuration.
- **Spring CLI**: Provides command-line tools for developing and testing Spring Boot applications.
- **Starter POMs**: Provides a set of convenient dependency descriptors to simplify Maven configuration.

## Difference Between Spring and Spring Boot?

**Spring:**

- **Framework**: Provides a comprehensive programming and configuration model for Java applications.
- **Configuration**: Requires extensive configuration, either through XML or Java annotations.
- **No Embedded Server**: Applications typically need to be deployed on external servers like Tomcat or Jetty.
- **Complex Setup**: Involves manual setup of dependencies and configurations.

**Spring Boot:**

- **Framework Extension**: Builds on Spring Framework, simplifying development.
- **Auto-Configuration**: Automatically configures the application based on the dependencies.
- **Embedded Server**: Comes with embedded servers, allowing for easier deployment.
- **Simplified Setup**: Uses starter POMs and default configurations to minimize setup and boilerplate code.

## Spring vs Spring MVC vs Spring Boot

**Spring Framework:**

- **Core Framework**: Provides comprehensive infrastructure support for developing Java applications.
- **Dependency Injection**: Centralizes dependency management and promotes loose coupling.
- **Configuration**: Supports XML and Java-based configuration.

**Spring MVC:**

- **Web Framework**: Part of the Spring Framework, focused on building web applications.
- **Model-View-Controller**: Implements the MVC design pattern to separate concerns.
- **Flexible Views**: Supports multiple view technologies like JSP, Thymeleaf, and FreeMarker.

**Spring Boot:**

- **Spring Extension**: Simplifies Spring application development.
- **Auto-Configuration**: Automatically configures Spring applications based on the dependencies.
- **Embedded Servers**: Includes embedded servers like Tomcat, Jetty, and Undertow.
- **Starter POMs**: Provides pre-configured POMs for quick setup.
- **Production-Ready**: Offers features like health checks, metrics, and externalized configuration.

## Explain `@SpringBootApplication`, `@Configuration` and `@ComponentScan` annotations

**@SpringBootApplication:**

- **Combination Annotation**: A convenience annotation that combines `@Configuration`, `@EnableAutoConfiguration`,
  and `@ComponentScan`.
- **Purpose**: Used to mark a configuration class that declares one or more `@Bean` methods and also triggers
  auto-configuration and component scanning.

**@Configuration:**

- **Indicates Configuration Class**: Marks a class as a source of bean definitions for the Spring IoC container.
- **Equivalent to XML Configuration**: Functions similarly to the `<beans>` tag in XML configuration.

**@ComponentScan:**

- **Component Scanning**: Configures component scanning directives for use with `@Configuration` classes.
- **Package Scanning**: Scans the specified package(s) for Spring components,
  including `@Component`, `@Service`, `@Repository`, and `@Controller` annotated classes.

## Why do we need a spring-boot-maven plugin?

- **Build Tasks**: Facilitates building Spring Boot applications using Maven.
- **Executable JAR/WAR**: Packages the application into an executable JAR or WAR file that includes all dependencies,
  making it easy to run with `java -jar`.
- **Repackage**: Repackages existing JARs to be executable.
- **Dependency Management**: Manages classpath and dependency resolution for the application.
- **Spring Boot Features**: Integrates with Spring Boot-specific features, such as running the application, creating an
  optimized classpath, and more.

## `@RestController` vs `@Controller` in Spring Boot?

**@RestController:**

- **Specialization of @Controller**: Combines `@Controller` and `@ResponseBody`.
- **REST API**: Typically used to create RESTful web services.
- **Automatic JSON/XML Response**: Automatically serializes return objects to JSON or XML format.
- **Simplified Code**: Eliminates the need to annotate each method with `@ResponseBody`.

**@Controller:**

- **Generic Controller**: Used to define a web controller in a Spring MVC application.
- **View Resolution**: Typically returns views (e.g., JSP, Thymeleaf) and relies on view resolvers.
- **Flexible Responses**: Can return any type of response, including views and data (with `@ResponseBody`).

## How to Implement Security for Spring Boot Application?

1. **Dependency Configuration**: Include dependencies like `spring-boot-starter-security` in your `pom.xml`
   or `build.gradle`.

2. **Security Configuration**: Create a security configuration class annotated with `@EnableWebSecurity` to customize
   security settings.

3. **Authentication and Authorization**: Configure authentication using in-memory, JDBC, LDAP, or custom user details
   services. Define authorization rules using `HttpSecurity`.

4. **User Roles and Permissions**: Define roles and permissions using `@Secured`, `@PreAuthorize`, or `@PostAuthorize`
   annotations.

5. **Form-Based Login or OAuth**: Implement form-based login using `UsernamePasswordAuthenticationFilter` or integrate
   OAuth providers like Google or GitHub using Spring Security OAuth.

6. **Secure REST APIs**: Use `@EnableGlobalMethodSecurity` with `@PreAuthorize` or `@PostAuthorize` for method-level
   security in REST controllers.

7. **Testing Security**: Write integration tests using Spring Security’s test support to validate authentication and
   authorization rules.

8. **Monitoring and Logging**: Monitor security events and log authentication/authorization failures for auditing
   purposes.



## What is spring JPA

    Uses the Java Persistence API (JPA) to 
    manage relational data in Java applications by providing
    repositories that abstract the underlying data access technologies. 

### Key Features
- **Repository Abstraction**: Provides CRUD (Create, Read, Update, Delete) functionality.
- **Query Methods**: creation of queries directly from method names
- **Pagination and Sorting**: Built-in support for paginating and sorting query results.
- **Auditing**: Automatically keeps track of who created or modified an entity and when.
- **Integration with Spring**: Seamless integration with Spring's transaction management and dependency injection.

### Concepts
1. **Entity**: 
   - A JPA entity is a lightweight, persistent domain object. 
   - Typically represents a table in a relational database
   - Each entity instance corresponds to a row in that table.
2. **Repository**: 
   - user define interface
   - extends one of the Spring Data repository interfaces (`JpaRepository`, `CrudRepository`).
   - Spring Data provides the implementation at runtime.
3. **Service**: 
   - contains the business logic of the application
   - uses the repository to interact with the data layer.

### Advanced Features
1. **Custom Queries**: you can define custom JPQL or native SQL queries using the @Query annotation.
2. **Specifications**: Interface to create complex queries dynamically.
3. **Pagination and Sorting**: Use the `Pageable` and `Sort` interfaces to handle pagination and sorting.
