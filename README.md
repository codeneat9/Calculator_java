# Java Calculator

A simple console-based calculator program implemented in Java. This program performs basic arithmetic operations such as addition, subtraction, multiplication, and division. The user inputs two numbers and selects an operation to perform.


##  Features

- ✅ Addition
- ✅ Subtraction
- ✅ Multiplication
- ✅ Division (with divide-by-zero check)
- ✅ Square
- ✅ Cube
- ✅ Square Root (with negative number check)
- 🔁 Menu-driven loop until Exit is selected
- ⚠️ Full Exception Handling (InputMismatchException, ArithmeticException, IllegalArgumentException)

## Requirements
- Java 8 or higher
- IDE (e.g., IntelliJ IDEA, Eclipse) or text editor (e.g., VS Code, Notepad++) to run the code

## Setup

1. Clone or download the repository.
2. Open the project in your favorite IDE or text editor.
3. Compile the Java program using the following command:
    ```bash
    javac Calculator.java
    ```
4. Run the program:
    ```bash
    java Calculator
    ```

## Usage

1. The program will prompt the user to input the first number.
2. It will then ask for the operation to perform (e.g., +, -, *, /).
3. Afterward, the user will input the second number.
4. The result of the operation will be displayed.
5. The program will continue to ask for new inputs until the user chooses to exit.


## Code Explanation

- **Calculator.java**: The main class which handles user input, performs arithmetic operations, and outputs results.
  - It uses a `Scanner` object to read user input.
  - It contains methods for each arithmetic operation.
  - It checks for invalid input and handles division by zero.

## Sample output
Calculator Menu:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Square
6. Cube
7. Square Root
8. Exit
Choose an option (1-8): 4
Enter two numbers to divide: 10 0
Math error: Cannot divide by zero!

## By:
- Yashwith Behara
- 23070126151
- AIML B3

