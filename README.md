# RecipeShare

> A small Java CLI / JDBC starter project — MySQL schema, simple DAO, and a CLI test.  
> Built for Review 1 (core Java, JDBC and project structure).

---

## 🚀 Quick highlights
- **User management** (create & fetch users)
- **Recipe model** with fields
- **MySQL database** with related tables (users, recipes, comments, ratings)
- **JDBC connection** using a `DBConnection` helper
- **DAO pattern** example (`UserDAO`)
- **CLI test** — `AppTest` (mvn exec:java runs main)
- Clean **Maven** project layout

---

## 📁 Project structure
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

## 🧾 SQL (path)
`sql/recipeshare_setup.sql` — creates the database, tables and initial user.

---

## ⚙️ DB Connection (what to set)
Edit `DBConnection.java` if you change DB credentials:

```java
private static final String URL = "jdbc:mysql://localhost:3306/recipeshare?useSSL=false&serverTimezone=UTC";
private static final String USER = "recipeshareuser";   // or "root" if you use root
private static final String PASS = "StrongPassword123"; // change to your MySQL password

├─ pom.xml
└─ README.md
---
## 🧪 Run CLI test (locally)

Make sure MySQL is running and you executed sql/recipeshare_setup.sql (via MySQL Workbench or mysql CLI).

Build & run with Maven from project root:
mvn clean package
mvn exec:java -Dexec.mainClass="com.recipeshare.AppTest"
(Or mvn exec:java if mainClass is in pom.xml.)
