public class floorNum {
    public static void main(String[] args) {
        int[] arr = {12,14,15,18,20};
        int target = 11;
        int ans = FloorNum(arr,target);
        System.out.println(ans);
        
    }
    static int FloorNum(int[] arr,int  target){ // floor num is smaller thean or equal to target
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            // for the mid num of the array 
            int mid = start + (end-start)/2;
            // what if the target is smaller than the smaller value of the array
            if(target < arr.length){
                return -1;
            }
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;

            }else{
                return mid;
            }
        }
        return end;
    }
}
