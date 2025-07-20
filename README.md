Read me
# 📝 Task Manager API - Spring Boot Project

A simple task management REST API built with **Spring Boot**, **Spring Data JPA**, **Lombok**, and **H2 Database**. It supports task creation, retrieval, and basic validation.

---

## 🚀 Spring Boot Project Setup

### 📦 1. Create Project Using Spring Initializr

- Open IntelliJ IDEA.
- Click: **File → New → Project**
- Choose: **Spring Initializr**
- Fill the following:
  - **Group:** `com.yourname.taskmanager`
  - **Artifact:** `taskmanager`
  - **Java Version:** 17 or 21
- Click **Next** and add these dependencies:
  - Spring Web  
  - Spring Data JPA  
  - H2 Database  
  - Spring Boot DevTools  
  - Lombok  
  - Validation  
  - Spring Boot Test

Click **Finish** to generate the project.

---

### ⚙️ 2. Run the Application

> You can run the application in IntelliJ or with the command line:

```bash
./mvnw spring-boot:run

By default, the server runs at
http://localhost:8080
```

### API Endpoints
🔸 Create Task
•	Method: POST /api/tasks
•	<img width="885" height="487" alt="image" src="https://github.com/user-attachments/assets/1fbc9a6f-23e0-4d59-a1ef-e92c7532b22e" />

Validation Error Example
•	Method: POST /api/tasks
•	<img width="865" height="654" alt="image" src="https://github.com/user-attachments/assets/6a10b76e-0440-45fa-af20-8e296e32576a" />

Get Task by ID
•	GET /api/tasks/{id}
•	<img width="940" height="532" alt="image" src="https://github.com/user-attachments/assets/83e24b46-9b3b-46ad-bb0e-768b5812e9f0" />

### Postman Testing
 Test: Create Valid Task
 ```bash
curl -X POST http://localhost:8080/api/tasks \
-H "Content-Type: application/json" \
-d '{"title":"Spring Boot","description":"Learn Spring","status":"PENDING","priority":"HIGH","dueDate":"2024-12-31"}'
```
Test: Invalid Task
```bash
CopyEdit
curl -X POST http://localhost:8080/api/tasks \
-H "Content-Type: application/json" \
-d '{"title":"Hi","status":"WRONG"}'
```
### Test Results
 Test passed
 <img width="940" height="654" alt="image" src="https://github.com/user-attachments/assets/b5d23f45-f2a6-48a7-a4e7-06fbce8f1454" />

 

### Project Structure
src
├── main
│   ├── java/com/yourname/taskmanager
│   │   ├── controller
│   │   ├── service
│   │   ├── repository
│   │   ├── model
│   │   ├── dto
│   │   └── enums
│   └── resources
│       └── application.properties
└── test
    └── java/com/yourname/taskmanager
