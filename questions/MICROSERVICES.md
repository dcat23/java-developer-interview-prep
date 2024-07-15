# Microservices

[Spring Boot Microservices Interview Questions and Answers](https://www.javaguides.net/2023/07/spring-boot-microservices-interview.html)

## Table of Contents

* [How do you communicate between microservices in Spring Boot?](#how-do-you-communicate-between-microservices-in-spring-boot)
* [If Service A is talking to Service B, how do you handle it?](#if-service-a-is-talking-to-service-b-how-do-you-handle-it)
* [What is the purpose of using Kafka?](#what-is-the-purpose-of-using-kafka)

## How do you communicate between microservices in Spring Boot?

- **RESTful APIs**: Using HTTP requests and responses to exchange data between microservices.
- **Spring Cloud**: Utilizing components like Eureka for service discovery, Ribbon for client-side load balancing, and Feign for declarative REST clients.
- **Message Brokers**: Using tools like RabbitMQ or Kafka for asynchronous communication via message queues.
- **API Gateways**: Routing and load balancing requests across multiple microservices using tools like Spring Cloud Gateway or Netflix Zuul.
- **Service-to-Service Calls**: Direct HTTP or RPC calls between microservices, often managed by Spring Cloud components.

## If Service A is talking to Service B, how do you handle it?

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


## What is the purpose of using Kafka?

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
