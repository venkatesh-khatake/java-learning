import java.util.Scanner;
public class Calc {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter another number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter Operation : ");
        String op = sc.nextLine();

        int result;

        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            
             case "-":
                result = num1 - num2;
                break;
            
             case "*":
                result = num1 * num2;
                break;
            
             case "/":
                result = num1 / num2;
                break;
                
            default:
            System.out.println("Enter correct Number :");
                break;
        }

    }
}
