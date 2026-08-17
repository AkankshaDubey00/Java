public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {11,12,13,14,15,16,17};
        int ans = secondLargest(arr);
        System.out.println(ans);
    }
    static int secondLargest(int[] arr){
        int secondLargestEle = arr[0];
        if (secondLargestEle< Largest(arr)) {
             secondLargestEle = Largest(arr)-1;
        }
        return secondLargestEle;
    } 
    static int Largest(int[] arr){
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
}
