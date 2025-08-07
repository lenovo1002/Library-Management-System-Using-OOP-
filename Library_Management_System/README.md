# 📚 Library Management System (Console-Based)

A simple yet fully functional Java console application to manage a library of books and users. This system supports adding books and users, issuing and returning books, and viewing details — all through a user-friendly menu-driven interface.

---

## ✨ Features

- Add a new book with ID, title, author, total and available copies.
- Add a new user with user ID and name.
- Display all books and users.
- Issue a book to a user.
- Return a book from a user.
- View a user's issued books.
- Input validation and error handling for smoother user experience.

---

## 📦 Technologies Used

- **Java 21**
- Java Records (used for `Book` model)
- Core Java features: Collections, Streams, Exception handling, Console I/O

---

## 🗂 Project Structure

Library_Management_System/
│
├── Book.java # Book record class
├── User.java # User class to hold user data and issued books
├── Library.java # Core logic: manage books, users, issue/return
├── ConsoleUI.java # Console-based interface to interact with the user
├── Main.java # Main class to run the application
└── README.md # Project documentation (this file)


---

## 🚀 Getting Started

1. **Clone the Repository**

```bash
git clone https://github.com/your-username/Library_Management_System.git
cd Library_Management_System


javac Library_Management_System/*.java
java Library_Management_System.Main


------------------------------------------------------------------------------------------------------
                            Library Management System
------------------------------------------------------------------------------------------------------
Please Choose an option :

1.  Add a New Book
2.  Add a New User
3.  Display All Books
4.  Display All Users
5.  Issue a Book to User
6.  Return a Book from User
7.  Get user details
8.  Exit
Enter your Choice :


ID      Title                           Author                  Copies      Available Copies
---------------------------------------------------------------------------------------------
1001    The Hitchhiker's Guide          Douglas Adams           10          3
1002    Dune                            Frank Herbert           5           1
