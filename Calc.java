class Calc{
    public static void main(String [] args){
        int num1 = 0;
        int num2 = 25;
        char op = '/';
        float result = 0;

        // What is Switch statement?
        // switch statement is a control flow statement that allows us to execute
        // one block of code from multiple options, based on value of an expression.
        // instead of writing multiple if-else condition, we can use "switch" for better
        // readability and cleaner code.

        switch(op){
            case '+':
                result = num1 + num2;
                break;  
            case '-':
                result = num1 - num2;
                break;
             case '*':
                result = num1 * num2;
                break;  
            case '/':
                if(num1 == 0 || num2 == 0){
                    System.out.println("Cannot divide by 0");
                }else{
                    result = num1 / num2;
                }
                break;
            case '%':
                if(num1 == 0 || num2 == 0){
                    System.out.println("Cannot divide by 0");
                }else{
                    result = num1 % num2;
                }
                break;
            default:
                System.out.println("Enter valid Operator.");
        }

        System.out.println(result);
        
    }
}