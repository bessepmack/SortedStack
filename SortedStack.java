import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * A program that reads a list of integer numbers from user input,
 * stores them in a Stack, sorts them in ascending order,
 * and prints the sorted Stack.
 * 
 * To compile: javac SortedStack.java
 * To run: java SortedStack
 * To generate Javadoc: javadoc -d docs SortedStack.java
 * 
 */
public class SortedStack {

    /**
     * Default constructor for the SortedStack class.
     * This constructor initializes a new instance of the SortedStack class.
     */
    public SortedStack() {
        // Default constructor, no instantiation.
    }

    /**
     * The main method reads integers from user input, stores them in a Stack,
     * sorts the Stack in ascending order, and prints the sorted Stack.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Create a Stack to store the integer numbers
        Stack<Integer> numbers = new Stack<>();
        
        System.out.println("Enter integers separated by spaces. Press Enter to finish: ");
        
        // Read the input line
        String input = scanner.nextLine();
        scanner.close();

        // Split the input line into individual strings
        String[] nums = input.split("\\s+");
        
        // Convert each string to an integer and push it onto the stack
        for (String num : nums) {
            numbers.push(Integer.parseInt(num));
        }

        // Sort the Stack in ascending order
        Collections.sort(numbers);

        // Print the sorted stack
        System.out.println("Sorted Stack:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
