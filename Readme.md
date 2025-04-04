# Expense Tracker API

A secure backend API built with Spring Boot for tracking personal expenses. This project enables users to manage their expenses by performing CRUD operations with robust JWT-based authentication and comprehensive API documentation via Swagger.

## Features

- **User Authentication:** Secure JWT-based authentication and authorization using Spring Security.
- **CRUD Operations:** Endpoints for creating, reading, updating, and deleting expense records.
- **Expense Categorization:** Organize expenses by category.
- **API Documentation:** Integrated Swagger UI for interactive API documentation and testing.
- **Validation & Error Handling:** Robust validation for incoming data and clear error responses.

## Tech Stack

- **Backend Framework:** Spring Boot
- **Programming Language:** Java
- **Database:** MySQL
- **Authentication:** JWT (JSON Web Tokens)
- **Documentation:** Swagger (OpenAPI)

## Prerequisites

- Java 11 or later
- Maven 3.6 or later
- MySQL database
- Git

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/0xYashAnand/expense-tracker-api.git
cd expense-tracker-api
```

### 2. Setup the MySQL Database

- Create a database in MySQL (e.g., `expensetracker`).
- Update your database URL, username, and password accordingly in the `.env` file (see below).

### 3. Create a `.env` File

Create a `.env` file in the root directory of the project with the following content:

```dotenv
# .env file (DO NOT commit this file to Git)
DB_URL=jdbc:mysql://localhost:3306/expensetracker
DB_USERNAME=root
DB_PASSWORD=@

JWT_SECRET=your_jwt_secret_key
JWT_EXPIRATION_MS=86400000 # 1 day in milliseconds
```

*Note: Replace `your_jwt_secret_key` with a secure secret key of your choice.*

### 4. Build and Run the Project

Build the project using Maven:

```bash
mvn clean install
```

Run the project:

```bash
mvn spring-boot:run
```

The API should now be running at: [http://localhost:8080](http://localhost:8080)

### 5. Access Swagger API Documentation

Once the application is running, you can access the Swagger UI at:

```
http://localhost:8080/swagger-ui.html
```

This interactive documentation allows you to explore and test the API endpoints.

## Project Structure

```plaintext
expense-tracker-api/
├── src/
│   ├── main/
│   │   ├── java/com/example/expensetracker/
│   │   │   ├── config/        # Configuration classes (e.g., security, swagger)
│   │   │   ├── controller/    # REST controllers
│   │   │   ├── dto/           # Data transfer objects
│   │   │   ├── entity/        # JPA entities
│   │   │   ├── exception/     # Custom exceptions and handlers
│   │   │   ├── repository/    # Spring Data repositories
│   │   │   ├── security/      # JWT and security related classes
│   │   │   └── service/       # Business logic services
│   └── resources/
│       ├── application.properties
│       └── application-dev.properties
├── .env                     # Environment variables (DO NOT commit this file)
├── pom.xml
└── README.md
```


