public class SearchInMountain {
    public static void main(String[] args) {
        
    }
        
        //https://leetcode.com/problems/find-peak-element/submissions/2103153872/
        int search(int[] arr , int target){
            int peak = peakIndexInMountainArray(arr);
            int firstTry = orderAgnosticsBS(arr, target, 0,peak);
            if(firstTry != -1){
                return firstTry;
            }
            // try to search in second half
            return orderAgnosticsBS(arr, target, peak+1,arr.length-1);


            
        }
        



     public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end ){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                // you are in decreasing part of array
                // this may be the ans but look at the left 
                // this is why end!= mid-1
                end = mid;
            }else{
                // you are in asc part of array
                start = mid+1;// because we know that mid+1 elelment is greater than > mid element
            }
        }
        return  start;// or end as both are equal
    }
    static int orderAgnosticsBS(int[] arr, int target, int start, int end){
      
        
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            int mid = start + (end-start) /2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                 if(target < arr[mid]){
                end = mid-1;
        
            }else  {
                start = mid+1;

            }
           
            }else{
                 if(target > arr[mid]){
                end = mid-1;
        
            }else  {
                start = mid+1;

             }

          }
        }
        return -1;
        
    }
}
