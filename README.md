# Quiz App Backend

This is a Spring Boot backend project for a quiz application.
It allows creating quizzes from a pool of questions, attempting them, and calculating the final score based on user responses.

---

## What this project does

* Store and manage quiz questions
* Create quizzes by selecting random questions from a category
* Send quiz questions to users (without exposing answers)
* Accept user responses
* Calculate and return the score

---

## Tech used

* Java
* Spring Boot
* Spring Data JPA / Hibernate
* MySQL
* Maven
* Lombok

---

## How it works (basic flow)

1. Add questions to the database
2. Create a quiz using category + number of questions
3. Fetch quiz questions
4. User submits answers
5. Backend checks answers and returns score

---

## API Endpoints

### Question APIs

* `GET /question/allQuestions` → get all questions
* `GET /question/category/{category}` → get questions by category
* `POST /question/add` → add a question
* `PUT /question/update/{id}` → update a question
* `DELETE /question/delete/{id}` → delete a question

---

### Quiz APIs

* `POST /quiz/create?category=Java&numQ=5&title=Java Quiz`
  → creates a quiz with random questions

* `GET /quiz/get/{id}`
  → returns questions for a quiz (answers are hidden)

* `POST /quiz/submit/{id}`
  → submit answers and get score

Example request body:

```json
[
  { "id": 1, "response": "option1" },
  { "id": 2, "response": "option3" }
]
```

Response:

```json
3
```

---

## Important detail

For sending questions to the user, I used a separate class (`QuestionWrapper`) so that the correct answers are not exposed in the API response.

---

## Score calculation

The backend compares submitted answers with the correct ones stored in the database and counts how many are correct.

---

## Run locally

Clone the repo:

```bash
git clone https://github.com/mayukh161/quizApp-backend.git
cd quizApp-backend
```

Update database config in `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/quizdb
spring.datasource.username=your_username
spring.datasource.password=your_password
```

Run:

```bash
mvn spring-boot:run
```

---

## Things I can improve later

* Add authentication (JWT)
* Store quiz attempts
* Add leaderboard
* Improve validation and error handling

---

## Author

Mayukh Kar
https://github.com/mayukh161
