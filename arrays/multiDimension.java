 import java.util.*;
 public class multiDimension {
    public static void main(String[] args) {
        
        /*
        1 2 3
        4 5 6
        7 8 9
        
        */
       Scanner sc = new Scanner(System.in);
    //    int[][] arr = new int[3][];

    // int[][] arr ={
    //     {1 , 2 , 3 }, // 0th index
    //     {4 , 5 }, // 1st index
    //     { 6 ,7 , 8 , 9 } // 2nd index -> arr2D

    // };

     int arr[][] = new int[3][3];
     System.out.println(arr.length);

    // input
    // for(int i = 0; i <arr.length; i++){
    //     arr[i] =  sc.next();
    // }
    for( int row = 0; row < arr.length; row++){
        // for each colum in every row
        for(int col = 0 ; col < arr[row].length;col++){
            arr[row][col] = sc.nextInt();
        }
    }
    //output 
    // for( int row = 0; row < arr.length; row++){
        // for each colum in every row
        // for(int col = 0 ; col < arr[row].length;col++){
           
        //     System.out.print( arr[row][col]+" " );
        // }
        // System.out.println();
    //     System.out.println(Arrays.toString(arr[row]));
    // }

    // Enhansed for loop
    for(int[]  a : arr){
        System.out.println(Arrays.toString(a));
    
    }
    

    }
}
