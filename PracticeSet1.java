
public class PracticeSet1 {

    public static void main(String[] args) {
        // 1. Logical & Relational Operators

        // Write a Java program that checks:

        // If a person is eligible for a driving license (age ≥ 18 and has ID).

        // Check if a number is between 10 and 50 (inclusive) using relational + logical
        // operators.

        // Take 3 integers as input and print true if at least one is greater than 100.

        int age = 17;
        
        boolean hasId = true;

        if(age >= 18 && hasId){
            System.out.println("You are eligible for Driving license.");
        }
        else{
            System.out.println("Your age must be greater than 17");
        }

        int num = 3;

        System.out.println(num >= 10 && num <= 50);

        int num1 = 120, num2  = -10, num3 = 14;

        System.out.println(num1 > 100 || num2 > 100 || num3 > 100 );
        


    //     2. Arithmetic Operators

    // Write a program that takes 2 numbers and:

    //     Adds them

    //     Subtracts them

    //     Multiplies them

    //     Divides them (integer division)

    //     Finds the remainder

    int a = 20, b = 4;

        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a % b);



        // 3. Bitwise Operators
        int x = 5;  // 0101
        int y = 3;  // 0011
        System.out.println("Bitwise AND (&): " + (x & y)); // 0001 → 1
        System.out.println("Bitwise OR (|): " + (x | y));  // 0111 → 7
        System.out.println("Bitwise XOR (^): " + (x ^ y)); // 0110 → 6
        System.out.println("Bitwise NOT (~x): " + (~x));   // flips all bits


         // Swap using XOR
        int p = 10, q = 20;
        p = p ^ q;
        q = p ^ q;
        p = p ^ q;


        System.out.println("After swap: p = " + p + ", q = " + q);
    }
}
