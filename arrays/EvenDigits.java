public class EvenDigits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        // System.out.println(findNumbers(nums));
        System.out.println(digit2(-8167));
        
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }

        return count;
    }

    // Function to check whether the num iis even or not

    static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits %2 ==0){
            return true;
        }
        return false;

    }
    // second way to find num of digit

    static int digit2(int num ){
        if(num < 0){
            num = num * -1;   // if the number is negative it will make it positive
        }
        return (int)(Math.log10(num))+1;
    }

    // count number of digits in a number
    static int  digits(int num){

        if(num < 0){
            num = num * -1;   // if the number is negative it will make it positive
        }
        if(num == 0){
            return 1; // if the num = 0 then it will print this (1)
        }

        int count = 0;
        while (num > 0){
            count++;
            num = num/10; // num /=10
        }

        return count;
    }
}
