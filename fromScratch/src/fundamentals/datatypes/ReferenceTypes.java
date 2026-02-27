package fundamentals.datatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReferenceTypes {
    public static void main(String[] args) {
        // 1. String: Immutable reference type for text
        System.out.println("=== String Example ===");
        String greeting = "Hello Java!";
        String name = new String("Ethan"); // Explicit object creation
        String multiLine = """
            This is a Text Block
            introduced in Java 15,
            great for multi-line strings!
            """; // Java 21 Text Block

        // Common String operations
        System.out.println("Greeting: " + greeting);
        System.out.println("Name length: " + name.length());
        System.out.println("Uppercase name: "  + name.toUpperCase());
        System.out.println("Multi-line text: " + multiLine);

        // 2. Arrays: Fixed-size collections
        System.out.println("\n=== Array Example ===");
        // Declare and initialize an array
        int[] numbers = new int[3]; // Array of 3 integers
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        // Alternative initialization
        String[] fruits = {"Apple", "Orange", "Banana"};

        // Display array contents
        System.out.println("Number array: " + Arrays.toString(numbers));
        System.out.println("Fruits array: " + Arrays.toString(fruits));

        // 3. ArrayList: Dynamic, resizable list
        System.out.println("\n=== ArrayList Example ===");
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("John");
        studentNames.add("Jane");
        studentNames.add("Joe");

        // Common ArrayList operations
        System.out.println("Student names: " + studentNames);
        System.out.println("First student: " + studentNames.get(0));
        studentNames.remove("Jane");
        System.out.println("After removing Jane: " + studentNames);

        // Using List.of() (Java 9+) for immutable lists
        List<String> immutableNames = List.of("Eve", "Frank");
        System.out.println("Immutable names: " + immutableNames);

        // 4. Java 21 Record: Concise data class
        System.out.println("\n=== Record Example ===");
        record Product(String name, double price, int stock) {} // Define a record
        Product laptop = new Product("Laptop", 999.99, 10);
        Product phone = new Product("Smartphone", 599.99, 25);

        // Access record fields
        System.out.println("Product: " + laptop.name() + ", Price: $" + laptop.price() + ", Stock: " + laptop.stock());
        System.out.println("Phone: " + phone);

        // 5. Variable Usage and Null Handling
        System.out.println("\n=== Variable Usage and Null Handling ===");
        String uninitializedString = null; // Reference type variable, not pointing to any object
        // System.out.println(uninitializedString.length()); // Would throw NullPointerException
        if (uninitializedString == null) {
            System.out.println("Uninitialized string is null, avoiding NullPointerException");
            uninitializedString = "Initialized now!";
        }
        System.out.println("Initialized string: " + uninitializedString);

        // Reassigning a reference
        String original = "First value";
        original = "New value"; // Points to a new String object
        System.out.println("Reassigned string: " + original);

        // 6. Common Error Example: Array Index Out of Bounds
        System.out.println("\n=== Error Example: Array Index ===");
        try {
            System.out.println(fruits[3]); // Access invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index. Array size is " + fruits.length);
        }
    }
}
