// Arithmetic Operations: +, -, *, /, %, ++, -- (for numeric types).
// Relational Operations: ==, !=, >, <, >=, <= (for comparisons).
// Logical Operations: &&, ||, ! (for boolean logic)
// Bitwise Operations: &, |, ^, ~, <<, >>, >>> (for low-level bit manipulation)
// String Operations: Concatenation (+), and methods like toUpperCase(), substring()


// Best Practices:
// Use parentheses to clarify operator precedence.
// Check for null or invalid inputs to avoid errors (e.g., NullPointerException).
// Use StringBuilder for heavy string concatenation in loops.

package fundamentals.datatypes;

import java.util.ArrayList;
import java.util.List;

public class Operations {
    public static void main(String args[]) {
        // 1. Arithmetic Operations
        System.out.println("=== Arithmetic Operations ===");
        int a = 10, b = 3;
        double x = 10.5, y = 2.5;

        // Basic arithmetic
        System.out.println("Addition (int): " + (a + b)); // 13
        System.out.println("Subtraction (double): " + (x - y)); // 8.0
        System.out.println("Multiplication: " + (a * b)); // 30
        System.out.println("Division (int): " + (a / b)); // 3 (integer division)
        System.out.println("Division (double): " + (x / y)); // 4.2
        System.out.println("Modulus: " + (a % b)); // 1

        // Increment and decrement
        int counter = 5;
        counter++; // Increment
        System.out.println("After increment: " + counter); // 6
        counter--; // Decrement
        System.out.println("After decrement: " + counter); // 5

        // Edge case: Division by zero
        try {
            int result = a / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }

        // 2. Relational Operations
        System.out.println("\n=== Relational Operations ===");
        System.out.println("Is a equal to b? " + (a == b )); // false
        System.out.println("Is a greater than b? " + (a > b)); // true
        System.out.println("Is x less than or equal to y? " + (x <= y)); // false

        // Comparing reference types (String)
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println("String == comparison: " + (str1 == str2)); // false (compares references)
        System.out.println("String equals() comparison: " + str1.equals(str2)); // true (compares content)

        // 3. Logical Operations
        System.out.println("\n=== Logical Operations ===");
        boolean isAdult = true;
        boolean hasPermission = false;
        System.out.println("Is adult and has permission? " + (isAdult && hasPermission)); // false
        System.out.println("Is adult or has permission? " + (isAdult || hasPermission)); // true
        System.out.println("Not adult? " + (!isAdult)); // false

        // Practical example: Check if score is in valid range
        int score = 85;
        boolean isValidScore = score >= 0 && score <= 100;
        System.out.println("Is score valid (0-100)? " + isValidScore); // true

        // 4. Bitwise Operations (Basic Example)
        System.out.println("\n=== Bitwise Operations ===");
        int num1 = 5; // Binary: 0101
        int num2 = 3; // Binary: 0011
        System.out.println("Bitwise AND (5 & 3): " + (num1 & num2)); // 1 (0001)
        System.out.println("Bitwise OR (5 | 3): " + (num1 | num2)); // 7 (0111)
        System.out.println("Bitwise XOR (5 ^ 3): " + (num1 ^ num2)); // 6 (0110)
        System.out.println("Bitwise NOT (~5): " + (~num1)); // -6 (inverts bits)

        // 5. String Operations
        System.out.println("\n=== String Operations ===");
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName; // Concatenation
        System.out.println("Full name: " + fullName);

        // Common String methods
        System.out.println("Uppercase: " + fullName.toUpperCase());
        System.out.println("Length: " + fullName.length());
        System.out.println("Substring (first 4 chars): " + fullName.substring(0, 4));

        // Java 21 Text Block for formatted string
        String description = """
            Name: %s
            Score: %d
            Pass: %b
            """.formatted(fullName, score, isValidScore);
        System.out.println("Formatted description:\n" + description);

        // 6. Practical Example: Calculate Total Price with Discount
        System.out.println("\n=== Practical Example: Shopping Cart ===");
        List<Double> prices = new ArrayList<>(List.of(29.99, 15.49, 99.99));
        double discountRate = 0.1; // 10% discount
        double total = 0.0;

        for (double price: prices) {
            total += price; // Arithmetic: Accumulate total
        }

        boolean isEligibleForDiscount = total > 50.0; // Relational
        double finalPrice = isEligibleForDiscount ? total * (1 - discountRate) : total; // Logical + Arithmetic
        System.out.println("Prices: " + prices);
        System.out.println("Total before discount: $" + String.format("%.2f", total));
        System.out.println("Eligible for discount? " + isEligibleForDiscount);
        System.out.println("Final price: $" + String.format("%.2f", finalPrice));

        // 7. Combining with Control Flow
        System.out.println("\n=== Combining with Switch Expression ===");
        String priceCategory = switch ((int) finalPrice) {
            case 0 -> "Free";
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> "Low";
            case 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 -> "Medium";
            default -> finalPrice > 100 ? "High" : "Normal";
        };
        System.out.println("Price category: " + priceCategory);
    }
}
