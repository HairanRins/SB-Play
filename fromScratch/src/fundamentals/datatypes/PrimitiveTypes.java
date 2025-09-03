package fundamentals.datatypes;

public class PrimitiveTypes {
    public static void main(String[] args) {
        // 1. Primitive Data Types
        byte smallNumber = 127; // Range: -128 to 127
        short mediumNumber = 32000; // Range: -32,768 to 32,767
        int number = 1_000_000; // Integer with underscore for readability (Java 7+)
        long largeNumber = 123_456_789_012L; // Large integer, note the 'L'
        float simpleDecimal = 3.14f; // Single-precision, note the 'f'
        double preciseDecimal = 3.14159265359; // Double-precision
        char character = 'A'; // Single character
        boolean isTrue = true; // True or false

        // Display values
        System.out.println("=== Primitive Data Types ===");
        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + mediumNumber);
        System.out.println("Integer: " + number);
        System.out.println("Long: " + largeNumber);
        System.out.println("Float: " + simpleDecimal);
        System.out.println("Double: " + preciseDecimal);
        System.out.println("Character: " + character);
        System.out.println("Boolean: " + isTrue);

        // 2. Type Conversion Examples
        System.out.println("\n=== Type Conversions ===");
        int integerValue = 42;
        double convertedToDouble = integerValue; // Implicit casting
        System.out.println("Int to to Double (implicit): " + convertedToDouble);

        double largeDecimal = 123.456;
        int convertToInt = (int) largeDecimal;
        System.out.println("Double Decimal to Int (explicit): " + convertToInt);
    }
}
