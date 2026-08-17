//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/2100009756/public class SmallestLetter {
    public static void main(String[] args) {
        
    }

    public char nextGreatestLetter(char[] letters, char target) {
        // ceiling number  = greater then or equal to target 
       int  start = 0;
       int  end  = letters.length-1;
       while( start <= end ){
        // for the mid value 
       int  mid = start+ (end-start)/2;

       // what if the target is greater then the greater number in the arr
      
       if(target < letters[mid]){
        end = mid-1;

       }else 
        start = mid+1;
       
       }
       return letters[start % letters.length];
    }

    

    

