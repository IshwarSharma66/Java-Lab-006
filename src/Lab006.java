import java.util.Scanner;

/**
 * Lab006 has a integer instance variables and a method
 *  to check if one integer is evenly divisible by another.
 * @Author: Ishwar Sharma
 */
public class Lab006 {
    private int n;
    private int m;

    // Constructor
    public Lab006(int n, int m) {
        this.n = n;
        this.m = m;
    }

    // Instance method to check if n is evenly divisible by m
    public boolean isDivisible() {
        return n % m == 0;
    }
    /**
     * The main method for the Lab006 class.
     * Prompts the user for two integers, creates a Lab006 object, and calls the isDivisible method.
     * Prints the result to the console.
     *
     *
     */
    public static void main(String[] args) {
        // Prompt the user for two integers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer (n): ");
        int inputN = scanner.nextInt();
        System.out.print("Enter the second integer (m): ");
        int inputM = scanner.nextInt();

        // Creates object using the constructor
        Lab006 lab = new Lab006(inputN, inputM);

        // Call isDivisible and handle the returned value
        boolean result = lab.isDivisible();
        if (result) {
            System.out.println(inputN + " is evenly divisible by " + inputM);
        } else {
            System.out.println(inputN + " is not evenly divisible by " + inputM);
        }
    }
}
