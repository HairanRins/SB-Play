// Control flow determines the order in which statements are executed in a program.
// Conditionals: if, else if, else, and the ternary operator (?:)
// Loops: for, enhanced for (for-each), while, do-while.
// Switch Statements: Traditional switch and Java 21’s enhanced switch expressions/pattern matching.
// Break and Continue: To control loop execution.
// Java 21 Features: Enhanced switch with arrow syntax (->) and pattern matching for cleaner code.

// Best Practices:
// Keep conditions clear and avoid nested if statements when possible.
// Use Java 21’s switch expressions for concise code.
// Ensure loops have clear exit conditions to avoid infinite loops.

package fundamentals.contolflow;

import java.util.List;

public class ControlFlow {
    public static void main(String[] args) {
        // 1. Conditionals: if, else if, else
        System.out.println("=== Conditional Statements ===");
        int score  = 85;
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("Score: " + score + " Grade : " + grade);

        // Ternary operator (short-hand conditional)
        String passStatus = score >= 70 ? "Pass" : "Fail";
        System.out.println("Pass Status: " + passStatus);

        // 2. Loops: for, enhanced for, while, do-while
        System.out.println("\n=== Loop Examples ===");
        // Standard for loop: Print numbers 1 to 5
        System.out.println("Standard for loop");
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(i + " ");
        }
        System.out.println();

        // While loop: Sum numbers until reaching a limit
        int sum = 0;
        int counter = 1;
        System.out.println("While loop (sum until 100):");
        while (sum < 100) {
            sum += counter;
            counter++;
        }
        System.out.println("Sum: " + sum + ", Iterations: " + (counter - 1));

        // Do-while loop: Run at least once
        int attempts = 0;
        System.out.println("Do-while loop:");
        do {
            System.out.println("Attempts: " + (++attempts));
        } while (attempts < 3);

        // 3. Switch Statements: Traditional and Java 21 enhanced switch
        System.out.println("\n=== Switch Statements ===");
        String day = "Wednesday";
        // Traditional switch
        System.out.println("Traditional switch:");
        String dayType;
        switch (day) {
            case "Monday":
                case "Tuesday":
                    case "Wednesday":
                        case "Thursday":
                            case "Friday":
                                dayType = "Weekday";
                                break;
            default:
                    dayType = "Invalid day";
        }
        System.out.println(day + "is a " + dayType);

        // Java 21 switch expression with arrow syntax
        System.out.println("Java 21 switch expression:");
        String activity = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Work";
            case "Saturday", "Sunday" -> "Relax";
            default -> "Unknown";
        };
        System.out.println("On " + day + ", you should: " + activity);

        // 4. Break and Continue in Loops
        System.out.println("\n=== Break and Continue ===");
        System.out.println("Loop with break (stop at 50):");
        for (int i = 0; i < 100; i += 10) {
            if (i == 50) {
                break; // Exit loop
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Loop with continue (skip multiples of 3):");
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                continue; // Skip this iteration
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // 5. Practical Example: Process a list of grades
        System.out.println("\n=== Practical Example: Process Grades ===");
        List<Integer> grades = List.of(95, 82, 65, 78, 88);
        int passingCount = 0;
        for (int currentGrade : grades) {
            if (currentGrade >= 70) {
                passingCount++;
            }
        }
        System.out.println("Grades: " + grades);
        System.out.println("Number of passing grades (>= 70): " + passingCount);

        // 6. Java 21 Pattern Matching in Switch (Preview Feature)
        System.out.println("\n=== Java 21 Pattern Matching (Preview) ===");
        Object obj = "Hello, Java!";
        String result = switch (obj) {
            case String s -> "Object is a String: " + s;
            case Integer i -> "Object is a Integer: " + i;
            case null -> "Object is a null";
            default -> "Unknown type";
        };
        System.out.println(result);
    }
}

// Experiment:

 // Change the score value to test different grades.
 // Modify the day variable to explore other switch cases.
 // Add a loop to calculate the average of the grades list.
 // Trigger an infinite loop (e.g., while (true)) and fix it with a break condition.

