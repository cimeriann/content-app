# 📚 Content App

A simple Content Management REST API built using **Spring Boot**. This application allows you to **create**, **update**, **retrieve**, and **delete** content entries.

## 🚀 Features

- ✅ Create new content
- ✏️ Update existing content
- 🗑️ Delete content
- 📄 Retrieve all or individual content items
- 🛠️ RESTful API design
- 🧪 Ready for integration with frontend apps or API testing tools like Postman

## 🛠️ Tech Stack

- Java 17+
- Spring Boot 3+
- Spring Web
- Spring Data JPA
- H2 (or your preferred DB)
- Maven (or Gradle)

## 📦 Getting Started

### Prerequisites

- Java installed (Java 17+ recommended)
- Maven installed (or Gradle)
- Git (optional)

### Clone the Project

```bash
git clone https://github.com/your-username/content-app.git
cd content-app
```

### Run the App
```bash
./mvnw spring-boot:run
```
The app will start at http://localhost:8080.

### 🧪 API Endpoints
#### Create Content
```http request
POST /api/content
```


#### Request Body:

```json
{
  "id": 1,
  "title": "My First Second program written in Java",
  "desc": "This is the first blog post, that has been edited",
  "status": "IDEA",
  "contentType": "ARTICLE",
  "dateCreated": "2025-04-05T21:39:29.703244",
  "dateUpdated": "2025-04-05T21:59:29.703244",
  "url": "http://localhost:8080/api/content/1"
}
```

#### Get All Content
```http request
GET /api/content/
```

#### Get Content by ID
```http request
GET /api/content/{id}
```

#### Update Content
````http request
PUT /api/content/{id}
````

#### Request Body:
```json lines
{
  "id": 1,
  "title": "My First Second program written in Java",
  "desc": "This is the updated blog post, that has been edited",
  "status": "IDEA",
  "contentType": "ARTICLE",
  "dateCreated": "2025-04-05T21:39:29.703244",
  "dateUpdated": "2025-04-05T22:00:54.703244",
  "url": "http://localhost:8080/api/content/1"
}
```
#### Delete Content
```http request
DELETE /api/content/{id}
```

🗂️ Project Structure
```css
src/
├── main/
│   ├── java/com/example/contentapp/
│   │   ├── controller/
│   │   ├── model/
│   │   ├── repository/
│   │   └── service/
│   └── resources/
│       └── application.properties
```

## 📃 License
This project is licensed under the MIT License. See the LICENSE file for details.







