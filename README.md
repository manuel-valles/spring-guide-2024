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

## Before Start
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