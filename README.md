The microservices architecture is ideal for this solution because it offers a modular and flexible approach, allowing each functionality to be developed, deployed, and managed independently. By separating the different responsibilities of the application into distinct microservices, scalability, maintenance, and evolution of the entire system are facilitated. 
Additionally, this approach promotes better reuse of components and efficient management of development teams, which is particularly advantageous for a project like this, where diverse functionalities such as sales forecasting, assortment planning, and authentication need to be integrated coherently and flexibly.


![image](https://github.com/user-attachments/assets/7b6e086d-eb90-4ac2-9ce0-e3face105c89)

# Frontend Components:
## Forecasting Web Application:
This web application is used for viewing sales forecasts and related data.
Provides a user interface for interacting with forecast data.
## Planning Web Application:
This web application is used for planning and decision-making based on forecasts.
Provides a user interface for creating plans, budgets, and strategies.
# API Gateway:
Serves as a single entry point for both the Forecasting and Planning web applications.
Routes incoming requests from the frontend to the appropriate backend microservices.
# Backend Components:
## Authentication Microservice:
Handles user authentication and authorization.
Connects to the users' database to verify user credentials.
Provides JWT tokens for authenticated users.
## Forecast Microservice:
Manages functionalities related to forecasting.
Provides APIs for fetching and processing forecast data.
Connects to the forecast and planning database to retrieve relevant data.
## Planning Microservice:
Manages planning functionalities based on forecasts.
Provides APIs for planning operations.
Connects to the forecast and planning database to retrieve relevant data.
## Product and Stores Microservice:
Manages product and store information.
Provides APIs for retrieving product and store data.
Connects to the product and stores database to retrieve relevant information.
## Headless and sales Microservice:
Handles batch processing of CSV files uploaded by users on a weekly basis.
Responsible for handling sales-related operations.
Processes the data in the CSV files to generate forecasts or other relevant information.
Connects to the forecast and planning database to store processed data.
# Database Components:
## Forecast and Planning Database:
Stores data related to forecasts, plans, budgets, and other forecasting and planning-related information.
Accessed by the Forecast, Planning, Sales, and Headless Microservices.
## Users Database:
Stores user authentication and authorization data.
Accessed by the Authentication Microservice.
# Interaction flow :
The Forecasting and Planning web applications interact with the API Gateway to access backend functionalities.
The API Gateway routes requests to the appropriate microservices based on the requested operations.
Microservices handle the business logic, interact with databases to retrieve or store data, and return responses to the API Gateway.
Databases store relevant data for each microservice and are accessed as needed during operations.

