public class PrimeNo {
    public static void main(String[] args) {
        int num = 14;
        boolean isPrime = true;

        for(int i = 2; i < num ; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime){
            System.out.println(num + " is a prime number.");
        }
        else{
             System.out.println(num + " is not a prime number.");

        }
    }
}
