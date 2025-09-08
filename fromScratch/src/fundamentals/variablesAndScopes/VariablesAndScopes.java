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


    }
}
