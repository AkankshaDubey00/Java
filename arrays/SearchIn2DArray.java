import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
            {23,24,25,27,52},
            {76,86,12,13,14},
            {46,56,3,98,97,96},
            {215,16,17,18,19,20,99}
        };
        int target = 98;
        int[] ans = (search(arr, target));

        System.out.println(Arrays.toString(ans));

        System.out.println(max(arr));
    }
    static int[]search(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if(arr[row][col] == target) {
                    return new int[]{row,col};
                }
            }
        }

         return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;//arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if(arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }

         return max;
    }
}