School Management System (SMS) - Spring Boot

📌 Overview

The School Management System (SMS) is a Spring Boot project that provides CRUD operations for managing Schools, Teachers, Students, and Management Staff. The system allows efficient record-keeping and management of educational institutions.

🚀 Features

School Management: Add, update, delete, and retrieve school details.

Teacher Management: Manage teacher records with subject associations.

Student Management: CRUD operations for student details.

Management Staff: Handle administrative staff records.

RESTful APIs: Exposes APIs for integration with frontend or other services.

Database Integration: Uses H2/MySQL database.

Pagination & Sorting: Implemented for large datasets.

Exception Handling: Custom exceptions for better API responses.

🛠️ Tech Stack

Backend: Java, Spring Boot, Spring MVC, Spring Data JPA

Database: H2 / MySQL

Build Tool: Maven

Documentation: Swagger

Testing: JUnit, Mockito

📂 Project Structure

sms-spring-mvn/
│── src/
│   ├── main/
│   │   ├── java/com/example/sms/
│   │   │   ├── controller/   # REST Controllers
│   │   │   ├── service/      # Business Logic
│   │   │   ├── repository/   # JPA Repositories
│   │   │   ├── entity/       # Entity Models
│   │   │   ├── dto/          # Data Transfer Objects
│   │   ├── resources/
│   │   │   ├── application.properties # Configurations
│   ├── test/ (JUnit Tests)
│── pom.xml (Maven dependencies)
│── README.md

⚡ Installation & Setup

Prerequisites

Java 17+

Maven

MySQL (if not using H2)

Steps to Run Locally

Clone the repository:

git clone <repo-url>
cd sms-spring-mvn

Configure application.properties (H2 default or MySQL):

spring.application.name=sms
spring.datasource.url = jdbc:postgresql://localhost:5432/sms_core
spring.datasource.username=postgres
spring.datasource.password=pass
spring.datasource.driver-class-name=org.postgresql.Driver

Build and run the application:

mvn clean install
mvn spring-boot:run

Access API documentation (Swagger):

http://localhost:8080/swagger-ui/

📡 API Endpoints

School APIs

POST /api/schools → Add a new school

GET /api/schools/{id} → Get school details

PUT /api/schools/{id} → Update school

DELETE /api/schools/{id} → Delete school

Teacher APIs

POST /api/teachers → Add a teacher

GET /api/teachers → List teachers

PUT /api/teachers/{id} → Update teacher

DELETE /api/teachers/{id} → Remove teacher

Student APIs

POST /api/students → Add a student

GET /api/students → List students

PUT /api/students/{id} → Update student details

DELETE /api/students/{id} → Remove student

🧪 Running Tests

Run unit and integration tests using:

mvn test

📜 License

This project is licensed under the MIT License.

🤝 Contributing

Feel free to submit issues or pull requests!
