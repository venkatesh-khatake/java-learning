public class TypeCasting {
    public static void main(String [] args){
        int a = 5;
        double b = a; // This is Implicit type conversion, means java can automatically convert one data type to another.

        System.out.println(b);


        double c = 32.54;
        // int d = c;   // This type conversion cannot be possible implicitly , because you might lose decimal part

        int d = (int) c; // but explicit conversion can be possible, 
        System.out.println(d);

    }   
}
