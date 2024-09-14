package algorithms;

import java.util.Arrays;

public class FibonacciIteration {
// 11 = 0, 1, 1 , 2, 3, 5, 8 , 13, 21, 34, 55...

    public static void main(String[] args) {

        displayFibonacciNumber(0);
        displayFibonacciNumber(1);
        displayFibonacciNumber(2);
        displayFibonacciNumber(5);
        displayFibonacciNumber(15);
        displayFibonacciNumber(20);
    }


    public static int generateFibonacci(int numbersQuantity) {
        if (numbersQuantity == 0) {
            return -1;
        }
        int[] fibonacciNumbers = new int[numbersQuantity];
        fibonacciNumbers[0] = 0;
        if(numbersQuantity >=2) {
            fibonacciNumbers[1] = 1;
        }
        for (int i = 2; i < fibonacciNumbers.length; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 2] + fibonacciNumbers[i - 1];
        }

        return fibonacciNumbers[fibonacciNumbers.length-1];
    }

    public static void displayFibonacciNumber(int number) {
        System.out.println("number " + number + ": " + generateFibonacci(number));
    }
}
