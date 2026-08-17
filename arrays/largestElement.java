import java.util.*;
public class largestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5};
        int ans = SumofElement(arr);
        System.out.println(ans);

   }
   static int SumofElement(int[] arr){
    int largest = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] > largest){
            largest = arr[i];
        }
    }
    return largest;
   }
   }
