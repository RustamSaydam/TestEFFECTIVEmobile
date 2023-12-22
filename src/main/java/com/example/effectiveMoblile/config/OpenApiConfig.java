package com.example.effectiveMoblile.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Rustam Saidam",
                        email = "rustamsaydam@icloud.com",
                        url = "https://t.me/t0m_soyer"
                ),
                description = "Description of the task:\n" +
                        "You need to create a simple system\n" +
                        "task management theme (Task Management System) using Java. The system provides creation, editing, deletion and viewing of tasks. Each task must support a title, description, status (for example, \"pending\", \"in progress\", \"completed\") and priority (for example, \"high\", \"medium\", \"low\"), as well as a task author and assignee . . Only the API needs to be implemented.\n" +
                        "Requirements:\n" +
                        "1. The service must support user authentication and authorization using email and password. \n" +
                        "2. Access to the API must be authenticated using a JWT token.\n" +
                        "3. Users can manage their tasks: create new ones, edit existing ones, view and delete, change status and assign task executors.\n" +
                        "4. Users can view other users' tasks, and task performers can change the status of their tasks.\n" +
                        "5. You can leave comments on tasks.\n" +
                        "6. The API should allow you to receive tasks of a specific author or performer, as well as all comments on them. It is necessary to provide filtering and pagination of the output.\n" +
                        "7. The service must correctly handle errors and return clear messages, as well as validate incoming data. \n" +
                        "8. The service must be well documented. The API must be described using Open API and Swagger. The service must have Swagger UI configured. It is necessary to write a README with instructions for running the project locally. The dev environment needs to be raised using docker compose.\n" +
                        "9. Write some basic tests to test the basic functionality of your system.\n" +
                        "10. Use Java 17+, Spring, Spring Boot to implement the system. You can use PostgreSQL or MySQL as a database. To implement authentication and authorization, you need to use Spring Security. You can use additional tools if necessary.\n",


                title = "RestAPI Specification",
                version = "1.0",
                termsOfService = "Terms of Service"

        ),
        servers = {
                @Server(
                        description = "Local ENV",
                        url = "http://localhost:8080"
                )

        },
        security = {
                @SecurityRequirement(
                        name = "bearerAuth"
                )
        }

)
@SecurityScheme(
        name = "bearerAuth",
        description = "JWT auth description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {
}
