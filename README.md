# Hello there!
## My name is Rustam Saidam, and I am glad welcome you in my app.
### I will very hope, that you get enjoying with my instructions!

 
#### Stack: Spring boot 3.2.0, Spring Security + JWT Token, DB PostgreSQL, Gradle.KTS, Swagger + Open api, Java 17, Docker, JUnit test, Mockito, Postman.

For launch this project in Docker, you must:

1) Download Docker and will registration. (check and write the command docker version)
2) Download Idea IntelliJ idea or different.
3) Download the docker-compose
   [Docker-Compose.yml](https://github.com/RustamSaydam/TestEFFECTIVEmobile/blob/saidam_back_beta/docker-compose.yml), (this version file for run when you are have project in local machine)

4) When you downloaded the docker-compose, you must find this String and few edit:
_________________________________
``` java
version: '2'
services:
app:
image: 'myorg/myapp:latest'
build:
context: .
container_name: app
ports:
- 8080:8080
depends_on:
- db
environment:
_________________________________
And change the code like below
_________________________________
version: '2'
services:
app:
image: 'saydamrustam/myapp'
container_name: app
ports:
- 8080:8080
depends_on:
- db
environment:
```
_______________________________
5) Run this command in console IntelliJ Idea: docker-compose up, and if you are done all step right, project will download from docker hub, and you can run REST api my app in [Swagger specification.](http://localhost:8080/swagger-ui/index.html#/authentication-controller)
 
![HelloWorld](https://github.com/RustamSaydam/RustamSaydam/blob/master/Screenshot%202023-12-23%20at%2023.13.03.png?raw=true)

Before you will check my app, do not forget make registration,  generate and put JWT token in place which called Authorize, and then you can test all my programm.


### Thank you for your watch.

