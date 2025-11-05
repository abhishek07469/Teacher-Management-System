# 📚 Teacher Data Management System

This project is a simple Java + MySQL-based system to manage teacher information, supporting CRUD operations and PDF export. It is built using MVC + DAO architecture, making the code easy to maintain and extend. Ideal for academic submissions or beginners learning JDBC and PDF generation.

---

## ✅ Features
- Add teacher records
- View all teachers
- Update teacher information
- Delete records
- Export teacher list to PDF
- DAO-based clean DB layer
- MVC project structure

---

## 🏗 Tech Stack
| Component     | Technology    |
|---------------|---------------|
| Language      | Java          |
| Database      | MySQL         |
| Architecture  | MVC           |
| Data Access   | JDBC + DAO    |
| PDF Export    | OpenPDF/iText |

---

## 📄 PDF Export
Exports teacher data into a formatted PDF file containing:
- ID
- Name
- City
- Email
- Contact

PDF helps in documentation & maintaining physical copies.

---

## 🔧 Database
**Table: `teacher`**

| Column     | Type           |
|------------|----------------|
| id         | INT (PK, AUTO) |
| name       | VARCHAR        |
| city       | VARCHAR        |
| college    | VARCHAR        |
| age        | INT            |
| email      | VARCHAR        |
| password   | VARCHAR        |
| gender     | VARCHAR        |
| bloodgroup | VARCHAR        |
| contact    | VARCHAR        |

---

## 📂 Project Structure
src/
│
├── com.Teacher.bean
│ └── Teacher.java
│
├── com.Teacher.DAO
│ └── ExportDAO.java
│
└── com.Teacher.Controller
└── TeacherPDF.java

