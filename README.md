# Expense Tracker Web Application



## Overview

The **Expense Tracker** is a web application designed to help users manage and track their expenses efficiently. Built with Java Servlet technology, HTML, CSS, and JavaScript, this project demonstrates fundamental concepts in web development and database management.

## Features

- **User Authentication**: Secure login with user authentication.
- **Expense Management**: Add, view, and delete expenses.
- **Reports**: Generate and view expense reports.

## Tech Stack

- **Backend**: Java Servlet, JDBC
- **Frontend**: HTML, CSS, JavaScript
- **Database**: SQL Server
- **Server**: Apache Tomcat

## Project Structure

ExpenseTrackerWeb/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── com/
│ │ │ │ └── example/
│ │ │ │ └── servlet/
│ │ │ │ └── ExpenseServlet.java
│ │ ├── resources/
│ │ └── webapp/
│ │ ├── WEB-INF/
│ │ │ ├── web.xml
│ │ ├── css/
│ │ │ └── styles.css
│ │ ├── js/
│ │ │ └── scripts.js
│ │ └── index.html
│ └── test/
│ └── java/
├── .gitignore
├── pom.xml
└── README.md


## Getting Started

### Prerequisites

- **Java Development Kit (JDK) 8 or higher**
- **Apache Tomcat 9 or higher**
- **SQL Server**

### Setup

**Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/ExpenseTrackerWeb.git
# ExpenseTrackerWeb

ExpenseTrackerWeb is a web application for managing and tracking your expenses efficiently.

### Build the Project

Navigate to the project directory and run:

```bash
mvn clean install

### Configure Tomcat
1. Install Apache Tomcat.
2. Configure Tomcat in your IDE or as a standalone server.
3. Deploy the ExpenseTrackerWeb.war file to Tomcat.
### Setup Database
1. Create a SQL Server database.
2. Run the SQL scripts provided in the db folder to set up the tables.
3. Run the Application
Start Tomcat.
Access the application at http://localhost:8080/ExpenseTrackerWeb/.
