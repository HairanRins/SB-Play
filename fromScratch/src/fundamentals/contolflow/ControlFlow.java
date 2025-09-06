// Control flow determines the order in which statements are executed in a program.
// Conditionals: if, else if, else, and the ternary operator (?:)
// Loops: for, enhanced for (for-each), while, do-while.
// Switch Statements: Traditional switch and Java 21’s enhanced switch expressions/pattern matching.
// Break and Continue: To control loop execution.
// Java 21 Features: Enhanced switch with arrow syntax (->) and pattern matching for cleaner code.


package fundamentals.contolflow;

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
    }
}
