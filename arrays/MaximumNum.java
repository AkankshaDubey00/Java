import java.util.Scanner;

public class MaximumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        System.out.println(MaxNum(a, b, c));
        
    }
    static int MaxNum(int a , int b ,int c){
        int max = 0;
        if(a > max){
            max = a;
        }if (b > max) {
            max = b;
        }if ( c > max) {
            max = c;
        }
        return max;

    }
  
}




