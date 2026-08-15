import java.util.*;
public class Largest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");

        int a = sc.nextInt();

        System.out.println("Enter num 2");

        int b = sc.nextInt();

        System.out.println("Enter num 3");

        int c = sc.nextInt();

        // Q : Find the largest of all
        // int max = a ;
        // if(b > max){
        //     max = b;
        // }

        // if(c > max){
        //     max = c;
        // }
        int max = Math.max(Math.max(a, b), c);

        System.out.println(max);
        }
}
