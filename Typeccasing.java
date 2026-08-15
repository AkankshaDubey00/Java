import java.util.*;
public class Typeccasing {
    public static void main(String[] args) {
        // System.out.println(" Enter the Number");
        Scanner sc = new Scanner(System.in);
        // float num = sc.nextFloat();
        // System.out.println(num);
        
        //Type Casting

        // int num = (int)(45.98f);
        // System.out.println(num);
        
        //automatic type promotion in exxpressiions
        // int a = 257; // Maximum num a btye can store is 256(257%256=1 output)
        // byte b = (byte)(a);
        // System.out.println(b);
        // byte a= 40;
        // byte b = 50;
        // byte c = 100;
        // int d = (a * b) / c;
        // System.out.println(d);
        // byte b = 50;
        // b = b*2;
        // int number = 'A';
        // System.out.println(number);
        byte b = 42;
        char c= 'a';
        short s= 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b ) + (i/c) - (d*s);

        System.out.println((f * b ) +" "+ (i/c)+" " + (d*s));
        System.out.println(result);
        // float-int-double = double
    }
    
}
