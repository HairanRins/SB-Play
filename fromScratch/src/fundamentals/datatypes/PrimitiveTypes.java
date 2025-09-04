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

        // 3. Practical Example: Calculate average grade
        System.out.println("\n=== Practical Example: Average Grade ===");
        double grade1 = 85.5;
        double grade2 = 90.0;
        double grade3 = 78.75;
        double average = (grade1 + grade2 + grade3)/3;
        System.out.printf("Average Grade : %f\n", average); // Formatted output

        // 4. Java 21 Feature: Using a record for structured data
        System.out.println("\n=== Java 21 Record Example ===");
        record Student(String name, int age, double grade) {} // Compact record definition
        Student student = new Student("Alice",20,average);
        System.out.println("Student: " + student.name() + ", Age: " + student.age() + ", Grade: " + student.grade());

        // 5. Common Error Example: Overflow
        System.out.println("\n=== Error Example: Byte Overflow ===");
        byte maxByte = 127;
        // byte overflowByte = maxByte + 1; // This would cause a compilation error
        System.out.println("Max byte value: " + maxByte);
        System.out.println("Adding 1 to max byte manually causes overflow: " + (byte)(maxByte+1));
    }
}
