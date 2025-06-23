Sure! Here's the complete `README.md` file that **fully includes** the original content you provided, formatted properly as a professional and structured Markdown document:

---

```markdown
# Java Calculator Application

A simple command-line calculator application built in Java that performs basic arithmetic operations.

---

## ✅ Features

- ✅ Addition (+)
- ✅ Subtraction (-)
- ✅ Multiplication (*)
- ✅ Division (/)
- ✅ Error handling for division by zero
- ✅ Input validation for invalid operators
- ✅ User-friendly console interface

---

## 📁 Project Structure

```

src/
└── com/
└── elevateLabs/
├── Calculator.java    # Calculator class with arithmetic methods
└── MainMenu.java      # Main class with user interface

````

---

## 🔍 Classes Overview

### 🧮 Calculator Class
- **Package:** `com.elevateLabs`
- **Methods:**
  - `add(double a, double b)` – Performs addition
  - `subtract(double a, double b)` – Performs subtraction
  - `multiply(double a, double b)` – Performs multiplication
  - `divide(double a, double b)` – Performs division with zero-check validation

### 🎛️ MainMenu Class
- **Package:** `com.elevateLabs`
- **Purpose:** Handles user input/output and program flow
- **Features:** Scanner input, exception handling, switch-case operation selection

---

## ▶️ How to Run

### 🛠️ Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line terminal or Java IDE (Eclipse, IntelliJ, etc.)

### 🧪 Compilation and Execution

#### Using Command Line

```bash
# Step 1: Clone the repository
git clone [<repository-url>](https://github.com/utkarshjoshilkar/Elevate_labs_day1)
cd simple calculator

# Step 2: Compile the Java files
javac -d bin src/com/elevateLabs/*.java

# Step 3: Run the application
java -cp bin com.elevateLabs.MainMenu
````

#### Using IDE

1. Open your preferred IDE
2. Import the project folder
3. Run `MainMenu.java`

---

## 💻 Usage Example

```
******************************
Enter the 1st number : 10
Enter the operation (+ , - , * , /) : /
Enter the 2nd number : 2
******************************
Result: 5.0
```

---

## ❗ Error Handling Examples

### Division by Zero:

```
Enter the 1st number : 10
Enter the operation (+ , - , * , /) : /
Enter the 2nd number : 0
******************************
Error : Divisor is equal to zero
```

### Invalid Operator:

```
Enter the 1st number : 10
Enter the operation (+ , - , * , /) : %
Enter the 2nd number : 5
******************************
Invalid Operator
```

---

## ⚙️ Technical Details

* **Language:** Java
* **Input Type:** Double precision floating-point numbers
* **Error Handling:** Try-catch blocks with custom exception messages
* **Architecture:** Object-oriented design with separation of concerns

---

## 📘 Key Programming Concepts Demonstrated

* ✅ Object-Oriented Programming (OOP)
* ✅ Exception Handling
* ✅ User Input Processing
* ✅ Switch-Case Statements
* ✅ Clean Code Practices

---

## 🚀 Future Enhancements

* Add more advanced operations (power, square root, etc.)
* Implement calculation history
* Add GUI interface
* Support for complex numbers
* Memory functions (M+, M-, MR, MC)

---

A simple yet robust calculator application demonstrating fundamental Java programming concepts. Ideal for beginners learning control flow, method structures, and input handling.

```

---

Let me know if you want this in a downloadable `.md` file or want me to help generate the separate `Calculator.java` and `MainMenu.java` files as described!
```
