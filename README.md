# 🍽️ **RecipShare-Discover Rate & Share Recipes **

**RecipeShare** is a simple and beginner-friendly **Java Web Application** built using  
**Servlets, JSP, JDBC, and MySQL**.

This project allows users to:

- **Add their own recipes**  
- **View recipes added by others**  
- **Store all data in a MySQL database**  
- **Follow a clean MVC (Model–View–Controller) architecture**

This project is designed to be **college-friendly, easy to understand**, and suitable for **Review-1 submission**.
## ✨ **Features**

RecipeShare includes the following basic features:

### 🧩 **1. Add Recipes**
Users can submit recipes with:
- Title  
- Ingredients  
- Instructions  

All data is stored in MySQL using JDBC.

### 📖 **2. View Recipes**
Users can view:
- All recipes stored in the database  
- Their own recipes (optional extension)

### 🗂️ **3. Clean MVC Structure**
- **Model:** Java classes (User, Recipe)
- **View:** JSP pages  
- **Controller:** Java Servlets  
- **Database:** MySQL with JDBC connectivity  

### 🔗 **4. Database Connectivity**
Fully working JDBC connection using:
- `DBConnection.java`  
- DAO classes for clean data access  

### 🧪 **5. Simple Working Demo**
A working test file (`AppTest.java`) validates:
- Database connection  
- User creation  
- Data retrieval
  ## 📁 **Project Structure**

The project follows a clean and organized Java web-application layout:
RecipeShare/
├─ sql/
│ └─ recipeshare_setup.sql
├─ src/
│ └─ main/
│ └─ java/
│ └─ com/
│ └─ recipeshare/
│ ├─ AppTest.java
│ ├─ model/
│ │ ├─ User.java
│ │ └─ Recipe.java
│ └─ dao/
│ ├─ DBConnection.java
│ └─ UserDAO.java
---
### 🧩 **Folder Explanation**
- **sql/** → Contains database creation script  
- **model/** → Java classes (POJO Models)  
- **dao/** → Database access classes using JDBC  
- **AppTest.java** → CLI test file to verify DB operations  
- **pom.xml** → Maven configuration file
  ## 🗄️ **Database Schema (MySQL)**

The project uses a MySQL database named **`recipeshare`**, created using the SQL script:sql/recipeshare_setup.sql
### 📌 **Tables Included**

#### **1. users**
Stores all users registered in the system.

| Column       | Type             | Description                  |
|--------------|------------------|------------------------------|
| id           | INT (PK)         | Auto-increment user ID       |
| name         | VARCHAR(100)     | User’s name                  |
| email        | VARCHAR(150)     | Unique email                 |
| password     | VARCHAR(255)     | User password                |
| role         | VARCHAR(20)      | user/admin                   |
| created_at   | TIMESTAMP        | Account creation time        |

---

#### **2. recipes**
Stores the recipes shared by users.

| Column        | Type         | Description                |
|---------------|--------------|----------------------------|
| id            | INT (PK)     | Recipe ID                  |
| user_id       | INT (FK)     | Owner of the recipe        |
| title         | VARCHAR(255) | Recipe title               |
| ingredients   | TEXT         | Ingredients list           |
| instructions  | TEXT         | Cooking steps              |
| image_path    | VARCHAR(255) | (optional) Image location  |
| created_at    | TIMESTAMP    | When recipe was posted     |

---

#### **3. comments**
Stores comments on recipes.

#### **4. ratings**
Stores user ratings between 1 and 5.

---

### 🧩 **SQL Script Includes**
- Creating all tables  
- Creating MySQL user `recipeshareuser`  
- Granting permissions  
- Inserting sample admin user  
## 🛠️ **Technologies Used**

RecipeShare uses the following technologies:

### 🧩 **Backend**
- **Java (Core + OOP)**
- **Servlets & JSP** *(Web Development — if extended for Review 2)*
- **JDBC** (Java Database Connectivity)

### 🗄️ **Database**
- **MySQL**  
- SQL script included for:
  - Database creation  
  - Tables creation  
  - Sample admin user  

### 🏗️ **Architecture**
- **MVC (Model–View–Controller)**
- **DAO (Data Access Object Pattern)**

### 📦 **Build & Dependency Management**
- **Apache Maven**
  - MySQL Connector/J  
  - Exec plugin for test execution

### 🧰 **Development Tools**
- **Git & GitHub**  
- **MySQL Workbench**  
- **VS Code / IntelliJ / Eclipse** (any supported IDE)
  ## ▶️ **How to Run the Project**

Follow these steps to run the RecipeShare Java Web Application locally.

---

### ✅ **1. Install Prerequisites**

Make sure these are installed on your system:

- **Java 17+**
- **Apache Maven**
- **MySQL Server + Workbench**
- **Any IDE (VS Code / IntelliJ / Eclipse)**

Check versions:java -version mvn -version
---

### ✅ **2. Create the Database**

Open **MySQL CLI** or **MySQL Workbench**, then run: SOURCE sql/recipeshare_setup.sql;
This will:

- Create database `recipeshare`
- Create all tables
- Insert sample admin user
- Create MySQL user `recipeshareuser` with full privileges

---

### ✅ **3. Build the Project (Maven)**

Open terminal inside the project folder:mvn clean package 
This compiles all Java files and downloads required dependencies (like MySQL Connector/J).

---

### ✅ **4. Run the Test Program (AppTest.java)**

To verify the database connection and UserDAO:mvn exec:java -Dexec.mainClass="com.recipeshare.AppTest
If everything is correct, you will see:

- A new user inserted into DB  
- User details printed back from database  

This confirms:

✔ JDBC connection  
✔ DAO functionality  
✔ MySQL configuration  
✔ Successful Review-1 setup  

---
## 🎯 **Conclusion**

RecipeShare demonstrates core concepts of:

- **Object-Oriented Programming (OOP)**
- **JDBC + MySQL connectivity**
- **DAO design pattern**
- **Clean project structuring using Maven**
- **Basic MVC architecture (extendable for Review-2)**

This submission fulfills all Review-1 requirements:
- Database schema ✔  
- Java Model classes ✔  
- DAO Layer ✔  
- JDBC connection ✔  
- Test program ✔  
- README + Documentation ✔  
![Image](https://github.com/user-attachments/assets/345d6d67-fbfa-4320-bcdc-43f369ea9262)



