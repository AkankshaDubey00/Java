//leetcode.com/problems/richest-customer-wealth/public class maxWealth {
    public static void main(String[] args) {
        
    }
     public int maximumWealth(int[][] accounts) {
        // per = row 
        // acc = col
        int ans = Integer.MAX_VALUE;

        for(int[] ints : accounts) /*(int person = 0; person < accounts.length; person++) */{
            //when you start a new col , take a new sum for that row
            int sum = 0;
            for(int anInt : ints) /*(int account = 0; account < accounts[person].length; account++) */{ // every col of each row 
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if(sum > ans){
                ans = sum;
            }
            
        }
        return ans;
     }


