The microservices architecture is ideal for this solution because it offers a modular and flexible approach, allowing each functionality to be developed, deployed, and managed independently. By separating the different responsibilities of the application into distinct microservices, scalability, maintenance, and evolution of the entire system are facilitated. 
Additionally, this approach promotes better reuse of components and efficient management of development teams, which is particularly advantageous for a project like this, where diverse functionalities such as sales forecasting, assortment planning, and authentication need to be integrated coherently and flexibly.


![image](https://github.com/user-attachments/assets/7b6e086d-eb90-4ac2-9ce0-e3face105c89)

# 1. Frontend Components:
## 1.1. Forecasting Web Application:
This web application is used for viewing sales forecasts and related data.
Provides a user interface for interacting with forecast data.
## 1.2. Planning Web Application:
This web application is used for planning and decision-making based on forecasts.
Provides a user interface for creating plans, budgets, and strategies.
# 2. API Gateway:
Serves as a single entry point for both the Forecasting and Planning web applications.
Routes incoming requests from the frontend to the appropriate backend microservices.
# 3. Backend Components:
## 3.1. Authentication Microservice:
Handles user authentication and authorization.
Connects to the users' database to verify user credentials.
Provides JWT tokens for authenticated users.
## 3.2. Forecast Microservice:
Manages functionalities related to forecasting.
Provides APIs for fetching and processing forecast data.
Connects to the forecast and planning database to retrieve relevant data.
## 3.3. Planning Microservice:
Manages planning functionalities based on forecasts.
Provides APIs for planning operations.
Connects to the forecast and planning database to retrieve relevant data.
## 3.4. Product and Stores Microservice:
Manages product and store information.
Provides APIs for retrieving product and store data.
Connects to the product and stores database to retrieve relevant information.
## 3.5. Headless and sales Microservice:
Handles batch processing of CSV files uploaded by users on a weekly basis.
Responsible for handling sales-related operations.
Processes the data in the CSV files to generate forecasts or other relevant information.
Connects to the forecast and planning database to store processed data.
# 4. Database Components:
## 4.1. Forecast and Planning Database:
Stores data related to forecasts, plans, budgets, and other forecasting and planning-related information.
Accessed by the Forecast, Planning, Sales, and Headless Microservices.
## 4.2. Users Database:
Stores user authentication and authorization data.
Accessed by the Authentication Microservice.
# 5. Interaction flow :
The Forecasting and Planning web applications interact with the API Gateway to access backend functionalities.
The API Gateway routes requests to the appropriate microservices based on the requested operations.
Microservices handle the business logic, interact with databases to retrieve or store data, and return responses to the API Gateway.
Databases store relevant data for each microservice and are accessed as needed during operations.
# 6. UML diagrams:
## 6.1. Use Case diagram:
![image](https://github.com/user-attachments/assets/f38412f9-ee3e-4361-ae63-cd445453a16b)
## 6.2. Class diagram:
![image](https://github.com/user-attachments/assets/c286c7d4-1efb-44d7-b09d-d5990766c76c)

# 7. Technologies:
- Backend with Spring Boot: Spring Boot is a popular Java-based framework for building robust and scalable backend applications. It provides features like dependency injection, auto-configuration, and easy integration with databases and other third-party libraries. We can use Spring Boot to develop microservices, including Authentication, Forecast, Planning, Sales, Headless.

- Frontend with Angular: Angular is a powerful frontend framework for building dynamic and interactive web applications. It provides features like two-way data binding, dependency injection, and modular development.  We can use Angular to develop the Forecasting and Planning web applications, providing intuitive user interfaces for viewing forecasts, creating plans, and interacting with the backend services.

- Database: We will use a Relational Database Management System (RDBMS) like MySQL, PostgreSQL, or MariaDB for storing structured data such as user information, product details, and sales data.

- Communication between microservices :  We can use Apache Kafka, a distributed streaming platform, to perform the communication between microservices.

