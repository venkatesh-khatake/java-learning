public class While {
    public static void main(String[] args) {
        // int num = 10;
        // int i = 1;

        // while(i <= num){
        //     System.out.println(i);
        //     i++;
        // }

        int milkContainer = 0;   // capacity : 10 ltr

        int glass = 1;          // capacity : 1 ltr

        while(milkContainer + glass <= 10){
            milkContainer = milkContainer +  glass;
            glass++;
            System.out.println(milkContainer + " ltr filled.");
        }


    }
}
