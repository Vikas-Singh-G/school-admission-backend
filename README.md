📄 School Admission Backend

A robust and clean Spring Boot REST API for managing student data in a school admission system ⛏️.

✨ Features

RESTful APIs for CRUD operations

Search students by name or email

Error handling with global exception handler

MySQL integration with Spring Data JPA

⚖️ Tech Stack

Java 17

Spring Boot

Spring Data JPA

MySQL

Maven

📅 How to Run

Clone the repository:

https://github.com/YourUsername/school-admission-backend.git

Set up MySQL database and update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=yourpassword

Open the project in your IDE (e.g., STS)

Run StudentserviceApplication.java

🔗 API Endpoints

GET /students - Fetch all students

GET /students/{id} - Fetch student by ID

POST /students - Add new student

PUT /students/{id} - Update student

DELETE /students/{id} - Delete student

GET /students/search?query=term - Search students

🚀 Frontend

This backend powers the React frontend.

