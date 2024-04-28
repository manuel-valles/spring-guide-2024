# Spring Guide 2024
A step-by-step guide for Spring Boot 3:
- Spring 6
- Spring Core
- Spring REST
- Spring MVC
- Spring Security
- Thymeleaf
- Hibernate
- MySQL

> References:
> - [Spring](https://spring.io/)
> - [Spring Projects](https://spring.io/projects)
> - [Spring Initializer](https://start.spring.io/)
> - [Maven Central Repository](https://central.sonatype.com/)

## 0. Before Start
### Optional - IntelliJ
To automatically restart your app when code is updated:
1. Add `spring-boot-devtools` to pom dependencies
    ```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
    </dependency>
    ```
2. Tick `Build project automatically` in `Settings > Build, Execution, Deployment > Compiler`
3. Tick `Allow auto-make to...` in `Preferences > Advanced Settings`

### Spring Boot Actuator
- To expose endpoints to monitor and manage your application, just add the following dependency to the pom file:
   ```
   <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-actuator</artifactId>
   </dependency>
   ```
   This will automatically expose endpoints for metrics out-of-the-box that are prefixed with `/actuator`.
- To add other pages like `info`, just add the following details to `src/main/resources/application.properties`:
   ```
   management.endpoints.web.exposure.include=health,info
   management.info.env.enabled=true
   
   # App Info (endpoint: /actuator/info)
   info.app.name=Demo App
   info.app.description=An overview of Spring Boot 3
   info.app.version=1.0.0
   ```
  [Actuator](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#actuator)

### Spring Boot Security
- To expose all the endpoints, use `*` wildcard: `management.endpoints.web.exposure.include=*`. However, you should add a new dependency to the project:
    ```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
    ```
    This will add a login screen for any endpoint. The default user is `user` and password should be printed out in the console:
    ```
    Using generated security password: cf122f83-29aa-45af-9210-bc1b33e78fa6
    
    This generated password is for development use only. Your security configuration must be updated before running your application in production.
    ```
- To exclude individual endpoints, use comma-delimited list in the property: `management.endpoints.web.exposure.exclude`. This will end in a `404` page/response.

### Command Line
Since Spring Boot apps are self-contained you can run the app in any terminal without any server.
- Using `java` command:
  - Create the JAR file for our app (output in `/target`): `$ ./mvnw package`
  - Run app: `java -jar target/demo-0.0.1-SNAPSHOT.jar`
- Using `mvn` plugin (`mvnw` wrapper): `$ ./mvnw spring-boot:run`

### Custom Application Properties
By default, Spring Boot reads information from a standard properties file: `src/main/resources/application.properties`, what can 
be accessed by using `@Value`

[Common Application Properties](https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html)