# 🧮 Master Calculator Pro (Java)
![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java)
![Lines of Code](https://img.shields.io/badge/Lines_of_Code-440-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)

Welcome to the **Master Calculator Pro**! This is a robust, multi-functional Java application designed to handle everything from basic arithmetic to complex age and health calculations with high precision and error handling.

## 🌟 Key Features

This 440-line application is divided into 8 powerful modules:

1.  **Addition ➕:** Accurate sum of large numbers.
2.  **Subtraction ➖:** Precise difference between values.
3.  **Multiplication ✖️:** Fast product calculation for any numeric range.
4.  **Division ➗:** High-precision division (up to 20 decimal places) with **Division by Zero** protection.
5.  **Temperature Converter 🌡️:** Instant conversion between Celsius and Fahrenheit.
6.  **Multiplication Table ⨶:** Generates a clean multiplication table for any given number.
7.  **BMI Calculator 🏥:** Calculates Body Mass Index and provides health status (Underweight, Healthy, etc.).
8.  **Age Calculator 🧮:** Calculates exact age in years, months, and days, including a total breakdown of hours, minutes, and seconds lived.

![Project Demo](demo_video.mp4)

## 🛠️ Technical Highlights

As a developer, I focused on making this tool **"Crash-Proof"** and **"High Precision"**:

* **BigDecimal & MathContext:** Unlike standard `double`, I used `BigDecimal` to ensure absolute accuracy in financial and scientific calculations.
* **Robust Error Handling:** Integrated `try-catch` blocks and input validation for every single step. If a user enters an invalid character, the program guides them back instead of crashing.
* **Instant Exit Logic:** Users can type `exit` at any input prompt to return to the main menu or `stop` to terminate the program safely.
* **Borrow Logic:** Implemented custom mathematical logic for the Age Calculator to handle date subtractions correctly.

## 🚀 Getting Started

### Prerequisites
- You need to have **JDK (Java Development Kit)** installed on your machine.

### Installation & Execution
1. Clone this repository or download the `Main.java` file.
2. Open your terminal or command prompt.
3. Compile the code:
   ```bash
   javac Main.java
