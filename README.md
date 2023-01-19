This project was made to play with Spring Boot framework by tutorial

In this project I made the following steps:
1. Using Spring Initializr constructed Maven project with all the necessary dependencies in Java
2. Ran a SpringBootApplication on http://127.0.0.1:8080/
3. Implemented entity Student
4. Implemented the API layer, represented by the StudentController
5. Implemented the Business layer, represented by the StudentService
6. Created PostgresSQL Database and the StudentRepository to store entities
7. Implemented logic for adding, getting, putting and deleting entities
8. Tested the built application

This project allows the creation and manipulation of web app model of 
class journal. In this model all the information about students of the 
class or school is stored in the database. The program gets all the 
students from the database and shows them on the web page. It makes 
sure that all the student emails in the database are unique, and 
we can’t add students with the same email twice, or delete students 
that are not present in the database. Also, the program manages changing 
data in the database: it does not allow changing a student’s email to an 
already taken or the same as previous one, also it forbids changing 
a student’s name to the identical.