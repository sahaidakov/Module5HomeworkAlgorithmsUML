package algorithms;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int n = 10; // Example: Find the 10th Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n-1));
    }
    public static int fibonacci(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Recursive call
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

// 5 = 1
// 4 = 2
// 3 = 3
// 2 = 4
// 1 = 5