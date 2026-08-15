import java.util.*;
public class Max {
    public static void main(String[] args) {
        int[] arr = {1,2,23, 4,8};
        // swap(arr, 0,4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    // max value 

    // static  int max( int[] arr){
    //     int maxVal = arr[0];
    //     for( int i = 0; i < arr.length; i++){
    //         if(arr[i] > maxVal){
    //             maxVal = arr[i];
    //         }
    //     }
    //     return maxVal;
    // }

    // max value from one range to another range

    // static  int maxRange ( int[] arr, int start, int end ){
    //     int maxVal = arr[start];
    //     for( int i = start; i < end; i++){
    //         if(arr[i] > maxVal){
    //             maxVal = arr[i];
    //         }
    //     }
    //     return maxVal;
    // // }

    // Reversing array
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            
            //swap
            swap(arr , start, end);
            start++;
            end--;

        }
    }

    static  void swap ( int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
        
        
    }


