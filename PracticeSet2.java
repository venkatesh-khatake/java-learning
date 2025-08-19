public class PracticeSet2 {
    public static void main(String[] args) {

        // 1. Even/Odd Numbers
        // Write a program to print numbers from 1 to 20, and check whether each number
        // is even or odd using an if-else inside a for loop.

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even number");
            } else {
                System.out.println(i + " is odd number.");
            }
        }

        // 2. Sum of Natural Numbers
        // Take an input n and use a while loop to calculate the sum of numbers from 1
        // to n.

        int n = 12;
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of natural number : " + sum);

        // 3. Multiplication Table
        // Print the multiplication table of a given number using a for loop.

        int num = 4;

        for (int j = 1; j <= 10; j++) {
            System.out.println(num + " * " + j + " = " + (num * j));
        }

        // Factorial of a Number
        // Use a while loop and if condition to find the factorial of a number.

        int factNum = 7;
        int factorial = 1;
        int f = factNum;
        while( f >= 1){
            factorial = factorial * f;
            f--;
        }
        System.out.println("The Factorial of "+ factNum + " is : "+ factorial);

        


        
    }
}
