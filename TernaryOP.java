public class TernaryOP {
    public static void main(String [] args){
        int a = 5, b = 22, c = 10;

        int max = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);

        System.out.println(max);
    }
}
