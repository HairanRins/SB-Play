// Variables: Containers for storing data, defined by a type (primitive or reference), name, and optional initial value
// Scopes: The region of code where a variable is accessible

// Local Scope: Variables declared inside a method or block, accessible only within that block.
// Instance Scope: Variables declared in a class (instance fields), accessible to all methods of the object
// Static Scope: Variables declared with static, shared across all instances of a class
// Block Scope: Variables declared in loops or conditionals, limited to that block


// Best Practices:
// Always initialize variables to avoid undefined behavior.
// Use meaningful names (e.g., studentCount instead of n).
// Minimize scope to prevent unintended access or modification.
// Use final for constants or variables that shouldn’t change

package fundamentals.variablesAndScopes;

import java.util.ArrayList;
import java.util.List;

public class VariablesAndScopes {
    // Instance variable (accessible to all methods in this instance)
    private String instanceName = "Default Student";
    private double instanceGrade = 0.0;

    // Static variable (shared across all instances of the class)
    private static int studentCount = 0;

    // Constructor to initialize instance variables
    public VariablesAndScopes(String name, double grade) {
        this.instanceName = name;
        this.instanceGrade = grade;
        studentCount++; // Increment shared counter
    }

    public static void main(String[] args) {
        // 1. Local Variables
        System.out.println("=== Local Variables ===");
        // Local variable (method scope)
        int localCounter = 10;
        var localMessage = "Hello, Harry";  // Type inference with 'var' (Java 10+)
        System.out.println("Local counter: " + localCounter);
        System.out.println("Local message: " + localMessage);

        // Local variable in a block (block scope)
        if (localCounter > 5) {
            String blockMessage = "Counter is large!";
            System.out.println("Inside block: " + blockMessage);
        }
        // System.out.println(blockMessage); // Error: blockMessage is out of scope

        // 2. Instance Variables
        System.out.println("\n=== Instance Variables ===");
        VariablesAndScopes student1 = new VariablesAndScopes("Alice", 85.5);
        VariablesAndScopes student2 = new VariablesAndScopes("Bob", 92.0);
        System.out.println("Student 1: " + student1.instanceName + ", Grade: " + student1.instanceGrade);
        System.out.println("Student 2: " + student2.instanceName + ", Grade: " + student2.instanceGrade);

        // 3. Static Variables
        System.out.println("\n=== Static Variables ===");
        System.out.println("Total students created: " + studentCount); // Shared across instances

        // 4. Practical Example: Process Grades with Scope
        System.out.println("\n=== Practical Example: Grade Processing ===");
        List<Double> grades = new ArrayList<>(List.of(75.0, 90.5, 62.0, 88.0));
        double total = 0.0;
        for (double grade : grades) {
            total += grade;
        }
        double average = total / grades.size();
        System.out.println("Grades: "  + grades);
        System.out.println("Average grade: " + String.format("%.2f", average));

        // 5. Scope and Shadowing
        System.out.println("\n=== Scope and Shadowing ===");
        int shadowVar = 100;
        System.out.println("Outside block, shadowVar: " + shadowVar); // 100
        
        {
            int shadowVarInner = 200;
            System.out.println("Inside block, shadowVarInner: " + shadowVarInner); // 200

            System.out.println("Inside block, outer shadowVar: " + shadowVar); // 100
        }
        System.out.println("Outside block again, shadowVar: " + shadowVar); // 100
    }
}
