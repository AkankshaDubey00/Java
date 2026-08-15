import java.util.*;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = new int[5];
        // // arryy of primitive
        // arr[0] = 25;
        // arr[1] = 35;
        // arr[2] = 75;
        // arr[3] = 45;
        // arr[4] = 55;
        // System.out.println(arr[2]);

        // // input suing for loops
        // for( int i = 0; i <arr.length; i++ ){
        //     arr[i] = sc.nextInt(); 
        // }
        // for( int i = 0; i <arr.length; i++ ){
        //     System.out.print(arr[i] + " ");

        // }

        // array of objects
        String[] str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = sc.next();
            
            
        }
        System.out.println(Arrays.toString(str));

        // Modify
        
        str[1] = "Akanksha Dubey";
        System.out.println(Arrays.toString(str));
        

    }
}
