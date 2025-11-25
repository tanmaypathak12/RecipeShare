🍽️ RecipeShare — Discover, Rate & Share Recipes

An online recipe-sharing platform built using Java, MySQL, and the DAO + JDBC architecture.
Users can share recipes, rate them, and explore content posted by others.

📌 Overview

RecipeShare is a backend-focused Java application demonstrating:

Java OOP design

JDBC connectivity

DAO (Data Access Object) architecture

MySQL relational database

Clean and modular project structure

CRUD operations for users and recipes

The goal is to simulate the backend logic of a real-world recipe platform.

🧱 Project Structure
RecipeShare/
├── sql/
│   └── recipeshare_setup.sql
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── recipeshare/
│                   ├── AppTest.java
│                   ├── model/
│                   │   ├── User.java
│                   │   └── Recipe.java
│                   └── dao/
│                       ├── DBConnection.java
│                       └── UserDAO.java
└── pom.xml

🗄️ Database Schema

The database includes:

users — stores user accounts

recipes — stores recipes

comments — stores comments on recipes

ratings — stores ratings for recipes

All tables and relations are defined in:

sql/recipeshare_setup.sql

🧪 Java Components
Models
File	Description
User.java	Represents a user entity
Recipe.java	Represents a recipe entity
DAO Layer
File	Description
DBConnection.java	Manages MySQL connection using JDBC
UserDAO.java	Performs CRUD operations on users
Runner
File	Description
AppTest.java	Simple CLI runner to test DB operations
🛠️ Technologies Used

Java

MySQL

JDBC

Maven

DAO Pattern

Git & GitHub

▶️ Running the Project
1. Build the database

Use MySQL Workbench or terminal:

SOURCE sql/recipeshare_setup.sql;

2. Build using Maven
mvn clean package

3. Run the AppTest class
mvn exec:java -Dexec.mainClass="com.recipeshare.AppTest"


This will insert and fetch sample user data.

⭐ Future Enhancements

User authentication

Recipe CRUD operations

Comments & ratings module

Admin dashboard

Web frontend (Servlets/JSP) or GUI

Image upload support

👥 Team
Name	Email
Tanmay Pathak	tanmay.24scse1011477@galgotiasuniversity.ac.in

Ayush Bhatt	ayush.24scse1010031@galgotiasuniversity.ac.in

Yushra Ubaid	yushra.24scse1010207@galgotiasuniversity.ac.in
👨‍💻 Author Message

This project showcases backend development skills using Java, JDBC, MySQL, and clean architectural patterns.
It is designed to be extendable for a full-stack application in future.
