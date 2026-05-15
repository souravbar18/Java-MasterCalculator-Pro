//import Statements
import java.math.MathContext;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//The Body
public class Main {
    public static void main (String[] args) {
        //massages to users
        System.out.println("..........Welcome to my Calculator..........");
        System.out.println("\nQuick View before calculation : What would you like to do here ?  ");
        System.out.println("\ni. Addition ➕\nii. Substraction ➖\niii. Multiplication ✖️\niv. Division ➗\nv. Temperature 🌡️\nvi. Multiplication Table ⨶\nvii. BMI 🏥\nviii. Age Calculation 🧮" );
        System.out.println("\n➡️ So let's choose a option : (e.g.,  \"i\" , \"ii\" \"iii\"...)");
        System.out.println("\nQuick Note 📝: For stop program , type 'stop' 🛑");

        //prompt
        String prompt1 = "Enter Your First Number : ";
        String prompt2 = "Enter Your Second Number : ";

        //input
        Scanner input = new Scanner(System.in);
        while (true) {

            //option selection
            System.out.print("Enter Your option : ");
            String option = input.next();
            if (option.equalsIgnoreCase("stop")) {
                System.out.println("..........Thank You for using my calculator !..........Hare Krishna.");
                break;
            }

            //addition calculator
            else if (option.equalsIgnoreCase("i")) {
                    System.out.println("\n..........Welcome to Addition!...........");
                    System.out.println("For exit, type 'exit'\n");

                    while (true) {
                        // ১. input first number and validation
                        System.out.print("Enter first number: ");
                        String num1 = input.next();
                        if (num1.equalsIgnoreCase("exit")) {
                            System.out.println("\nThanks!😊");
                            break;
                        }

                        // does the first number correct or not ?
                        try {
                            new BigDecimal(num1);
                        } catch (NumberFormatException e) {
                            System.out.println("\nError ❌: Invalid input! Please enter a valid number.");
                            continue; // if it's wrong , continue
                        }

                        // ২. input second number and validation
                        System.out.print("Enter second number: ");
                        String num2 = input.next();
                        if (num2.equalsIgnoreCase("exit")) {
                            System.out.println("\nThanks!😊");
                            break;
                        }

                        // The second number and Final calculation
                        try {
                            BigDecimal number1 = new BigDecimal(num1);
                            BigDecimal number2 = new BigDecimal(num2);

                            // results
                            BigDecimal results = number1.add(number2);

                            System.out.println("Results: " + results);
                            System.out.println("-------------------------------------------------------");
                            System.out.println("Try New One...");
                            System.out.println("-------------------------------------------------------");
                        } catch (NumberFormatException e) {
                            System.out.println("\nError ❌: Invalid input! Please enter a valid number.");
                            continue;
                        }
                    }
            }
            //substraction calculator
            else if (option.equalsIgnoreCase("ii")) {
                System.out.println("\n..........Welcome to Subtraction!..........");
                System.out.println("For exit, type 'exit'\n");

                while (true) {
                    // ১. input first number and checking instantly
                    System.out.print(prompt1);
                    String num1 = input.next();
                    if (num1.equalsIgnoreCase("exit")) {
                        System.out.println("\nThanks! 😊");
                        break;
                    }

                    try {
                        new BigDecimal(num1); //does the input correct or not ?
                    } catch (NumberFormatException e) {
                        System.out.println("\nError ❌: Invalid input! Please enter a valid number.");
                        continue;
                    }

                    // ২. same as first input
                    System.out.print(prompt2);
                    String num2 = input.next();
                    if (num2.equalsIgnoreCase("exit")) {
                        System.out.println("\nThanks!😊");
                        break;
                    }

                    try {
                        // ৩. the logic
                        BigDecimal number1 = new BigDecimal(num1);
                        BigDecimal number2 = new BigDecimal(num2);
                        BigDecimal results = number1.subtract(number2);

                        System.out.println("Results: " + results);
                        System.out.println("-------------------------------------------------------");
                        System.out.println("Try New One...");
                        System.out.println("-------------------------------------------------------");
                    } catch (NumberFormatException e) {
                        System.out.println("\nError ❌: Invalid input! Please enter a valid number.");
                        continue;
                    }
                }
            }
            //multiplication
            else if (option.equalsIgnoreCase("iii")) {
                System.out.println("\n..........Welcome to Multiplication!..........");
                System.out.println("For exit, type 'exit'");

                while (true) {
                    // input and validation of first input
                    System.out.print(prompt1);
                    String num1 = input.next();
                    if (num1.equalsIgnoreCase("exit")) {
                        System.out.println("\nThanks!😊");
                        break;
                    }

                    try {
                        new BigDecimal(num1); // checking the first number
                    } catch (NumberFormatException e) {
                        System.out.println("\nError ❌: Invalid input! Please enter a valid number.");
                        continue;
                    }

                    // input and validation of second input
                    System.out.print(prompt2);
                    String num2 = input.next();
                    if (num2.equalsIgnoreCase("exit")) {
                        System.out.println("\nThanks !😊");
                        break;
                    }

                    try {
                        // ৩. logic of multiplication
                        BigDecimal number1 = new BigDecimal(num1);
                        BigDecimal number2 = new BigDecimal(num2);

                        // for multiplication , used multiply
                        BigDecimal results = number1.multiply(number2);

                        System.out.println("Results: " + results);
                        System.out.println("-------------------------------------------------------");
                        System.out.println("Try New One...");
                        System.out.println("-------------------------------------------------------");
                    } catch (NumberFormatException e) {
                        System.out.println("\nError ❌: Invalid input! Please enter a valid number.");
                        continue;
                    }
                }
            }
            //Division
            else if (option.equalsIgnoreCase("iv")) {
                System.out.println("\n..........Welcome to Division!..........");
                System.out.println("For Exit Type 'exit'\n");
                while (true) {
                    // Instantly validation and input
                    System.out.print(prompt1);
                    String num1 = input.next();
                    if (num1.equalsIgnoreCase("exit")) {
                        System.out.println("\nThanks!😊");
                        break;
                    }

                    try {
                        new BigDecimal(num1); //user input correct or not ?
                    } catch (NumberFormatException e) {
                        System.out.println("\nError ❌: Invalid input! Please enter a valid number.");
                        continue; // Start again if you do wrong
                    }

                    // Input the second number and validation
                    System.out.print(prompt2);
                    String num2 = input.next();
                    if (num2.equalsIgnoreCase("exit")) {
                        System.out.println("\nThanks! 😊");
                        break;
                    }

                    try {
                        BigDecimal number1 = new BigDecimal(num1);
                        BigDecimal number2 = new BigDecimal(num2);

                        // Division can't allow by Zero
                        if (number2.compareTo(BigDecimal.ZERO) == 0) {
                            System.out.println("\nError ❌: Division by zero is not allowed!");
                        } else {
                            // using MathContext
                            MathContext mc = new MathContext(20, RoundingMode.HALF_UP);
                            BigDecimal results = number1.divide(number2, mc);
                            System.out.println("Results: " + results);
                            System.out.println("-------------------------------------------------------");
                            System.out.println("Try New One...");
                            System.out.println("-------------------------------------------------------");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("\nError ❌: Invalid input! Please enter a valid number.");
                        continue;
                    }
                }
            }
            //Amar Temperature 🙂‍↔️️
            else if (option.equalsIgnoreCase("v")) {
                System.out.println("\n..........Welcome to Temperature!..........");
                System.out.println("For Exit Type 'exit'\n");
                System.out.println("➡️What You Want to Do? \ni. Celsius to Fahrenheit \nii. Fahrenheit to Celsius");

                while (true) {
                    System.out.print("⌥ Enter Your Option (i/ii/exit): ");
                    String choice = input.next();

                    if (choice.equalsIgnoreCase("exit")) {
                        System.out.println("\nThanks!😊");
                        break;
                    }

                    // ১. Celsius to Fahrenheit
                    else if (choice.equalsIgnoreCase("i")) {
                        System.out.println("\n..........Welcome to CEL to FAH..........\n");
                        System.out.print("Enter Your Celsius Temperature: ");
                        String celInput = input.next();
                        if (celInput.equalsIgnoreCase("exit")) break;

                        try {
                            // use double for decimal number
                            double cel = Double.parseDouble(celInput);
                            double fahrenheit = (cel * 9/5) + 32;
                            System.out.println("Fahrenheit: " + fahrenheit + " °F");
                        } catch (NumberFormatException e) {
                            System.out.println("\nError ❌: Enter a valid numeric value!");
                            continue;
                        }
                    }

                    // ৩. Fahrenheit to Celsius
                    else if (choice.equalsIgnoreCase("ii")) {
                        System.out.println("\n..........Welcome to FAH to CEL..........\n");
                        System.out.print("Enter Your Fahrenheit Temperature: ");
                        String fahInput = input.next();
                        if (fahInput.equalsIgnoreCase("exit")) break;

                        try {
                            double fah = Double.parseDouble(fahInput);
                            double celsius = (fah - 32) * 5/9;
                            System.out.println("Celsius: " + celsius + " °C");
                        } catch (NumberFormatException e) {
                            System.out.println("\nError ❌: Enter a valid numeric value!");
                            continue;
                        }
                    } else {
                        System.out.println("Please choose a correct option! ❌");
                        continue;
                    }
                }
            }
            //Multiplication table
            else if (option.equalsIgnoreCase("vi")) {
                System.out.println("\n..........Welcome to Multiplication Table!..........");
                System.out.println("For Exit Type 'exit'\n");

                while (true) {
                    System.out.print("Enter Your Number: ");
                    String myNum = input.next();

                    if (myNum.equalsIgnoreCase("exit")) {
                        System.out.println("\nThanks!😊");
                        break;
                    }

                    try {
                        // convert string into number
                        long number = Long.parseLong(myNum);

                        System.out.println("\nTable of " + number + ":");
                        for (long i = 1; i <= 10; i++) {
                            // Multiplication Table
                            String resultLine = number + " ✕ " + i + " = " + (i * number);
                            System.out.println(resultLine);
                        }
                        System.out.println("............................................................");

                    } catch (NumberFormatException e) {
                        // Massage for wrong input
                        System.out.println("\nError ❌: Enter a valid number or type 'exit'!");
                        continue;
                    }
                }
            } else if (option.equalsIgnoreCase("vii")) {
                System.out.println("\n..........Welcome to BMI!..........");
                System.out.println("For Exit Type 'exit'\n");

                while (true) {
                    // Weight input n check
                    System.out.print("Enter Your Weight (kg) or 'exit': ");
                    String weightInput = input.next();
                    if (weightInput.equalsIgnoreCase("exit")) {
                        System.out.println("\nThanks!😊");
                        break;
                    }

                    // Height input n check
                    System.out.print("Enter Your Height (cm) or 'exit': ");
                    String heightInput = input.next();
                    if (heightInput.equalsIgnoreCase("exit")) {
                        System.out.println("\nThanks!😊");
                        break;
                    }

                    try {
                        // ৩. convert string to decimal
                        double weight = Double.parseDouble(weightInput);
                        double heightCm = Double.parseDouble(heightInput);

                        // convert height into meter ( height / 100 )
                        double heightMeters = heightCm / 100;

                        // Formula of BMI : Weight / Height^2
                        double bmiResult = weight / (heightMeters * heightMeters);

                        System.out.println("\n--- BMI Result ---");
                        System.out.printf("Your BMI is: %.2f\n", bmiResult);

                        // ৬. Health Checking
                        if (bmiResult < 18.5) System.out.println("Status: Underweight");
                        else if (bmiResult < 25) System.out.println("Status: Healthy");
                        else if (bmiResult < 30) System.out.println("Status: Overweight");
                        else System.out.println("Status: Obese");

                        System.out.println("............................................................\n");

                    } catch (NumberFormatException e) {
                        System.out.println("\nError ❌: Please enter valid numeric values!");
                        continue;
                    }
                }
            } else if (option.equalsIgnoreCase("viii")) {
                System.out.println("\n..........Welcome to Age Calculation!..........");
                System.out.println("For exit type 'exit'\n");

                while (true) {
                    try {
                        // Present Year Input and Check
                        System.out.print("\nEnter Present Year: ");
                        String yearStr = input.next();
                        if (yearStr.equalsIgnoreCase("exit")) break;
                        long y2 = Long.parseLong(yearStr);

                        //  Present Month Input and Check
                        System.out.print("Enter Present Month: ");
                        String monthStr = input.next();
                        if (monthStr.equalsIgnoreCase("exit")) break;
                        long m2 = Long.parseLong(monthStr);

                        // Present Day Input n Check
                        System.out.print("Enter Present Day: ");
                        String dayStr = input.next();
                        if (dayStr.equalsIgnoreCase("exit")) break;
                        long d2 = Long.parseLong(dayStr);

                        System.out.println("\nBirth Year, Month and Day:");

                        //  Birth Year Input n check
                        System.out.print("Enter Birth Year: ");
                        String yearsStr = input.next();
                        if (yearsStr.equalsIgnoreCase("exit")) break;
                        long y1 = Long.parseLong(yearsStr);

                        //  Birth Month input n check
                        System.out.print("Enter Birth Month: ");
                        String monthsStr = input.next();
                        if (monthsStr.equalsIgnoreCase("exit")) break;
                        long m1 = Long.parseLong(monthsStr);

                        //  Birth Day input n check
                        System.out.print("Enter Birth Day: ");
                        String daysStr = input.next();
                        if (daysStr.equalsIgnoreCase("exit")) break;
                        long d1 = Long.parseLong(daysStr);

                        // Borrow Logic
                        if (d2 < d1) {
                            d2 += 30;
                            m2 -= 1;
                        }
                        if (m2 < m1) {
                            m2 += 12;
                            y2 -= 1;
                        }

                        long finalYear = y2 - y1;
                        long finalMonth = m2 - m1;
                        long finalDay = d2 - d1;

                        System.out.println("\n--- Result ---");
                        System.out.println("Age: " + finalYear + " Years, " + finalMonth + " Months, " + finalDay + " Days");

                        // time convert
                        long totalDaysAlive = (finalYear * 365) + (finalMonth * 30) + finalDay;
                        long hours = totalDaysAlive * 24;
                        long minutes = hours * 60;
                        long seconds = minutes * 60;

                        System.out.println("Total Hours: " + hours + " hrs");
                        System.out.println("Total Minutes: " + minutes + " mins");
                        System.out.println("Total Seconds: " + seconds + " secs");

                    } catch (NumberFormatException e) {
                        System.out.println("\nError ❌: Invalid input! Please enter a valid number or type 'exit'.");
                        // if wrong , go to the beginning point
                    }
                }
                System.out.println("Thanks...Hare Krishna!");
            } else {
                System.out.println("Please enter a valid option ! ❌");
                continue;
            }
        }
    }
}