🍽️ RecipeShare — Discover, Rate & Share Recipes

A modern backend-powered recipe sharing system built using
Java + JDBC + MySQL + DAO Architecture.

🌟 Features

👤 User management (create & fetch users)

📘 Recipe model with fields

🗄️ MySQL database with multiple related tables

🔌 JDBC connection with DAO pattern

🧪 CLI tester using AppTest.java

📁 Clean Maven-style folder structure

📂 Project Directory Structure

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
🗃️ Database Schema (MySQL)

The SQL script includes creation of:

Table	Purpose
users	Stores user accounts
recipes	Stores recipe data
comments	Stores user comments
ratings	Stores ratings for recipes

SQL file path:

sql/recipeshare_setup.sql

🧱 Java Components Overview
📦 Model Classes
Class	Description
User.java	Represents a system user
Recipe.java	Represents a recipe posted by a user
🔧 DAO Classes
Class	Description
DBConnection.java	Handles JDBC MySQL connection
UserDAO.java	Performs CRUD operations on users
🚀 Runner Class
Class	Purpose
AppTest.java	CLI test to insert + fetch a user
🛠️ Tech Stack
Layer	Technology
Language	Java
Database	MySQL
Connectivity	JDBC
Architecture	DAO Pattern
Build Tool	Maven
Version Control	GitHub
▶️ How to Run the Project
1️⃣ Setup MySQL Database

In MySQL Workbench or CLI:

SOURCE sql/recipeshare_setup.sql;

2️⃣ Build the project

Run:

mvn clean package

3️⃣ Execute AppTest.java
mvn exec:java -Dexec.mainClass="com.recipeshare.AppTest"


You will see:

✔ A user being inserted
✔ The same user loaded from database

🚧 Future Enhancements

User authentication system

Full recipe CRUD

Comments & rating logic

Admin dashboard

Servlet/JSP or GUI front-end

Image upload support

👥 Team Members
Name	Email
Tanmay Pathak	tanmay.24scse1011477@galgotiasuniversity.ac.in

Ayush Bhatt	ayush.24scse1010031@galgotiasuniversity.ac.in

Yushra Ubaid	yushra.24scse1010207@galgotiasuniversity.ac.in
📘 Project Summary

RecipeShare demonstrates practical skills in:

✔ Java OOP
✔ JDBC connectivity
✔ DAO architecture
✔ Modular coding
✔ Real database operations
✔ Clean project structuring
