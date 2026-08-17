import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr, 6)));
       
    }
    // Searrch in the row provided between the col provided

    static int[] binarysearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart <= cEnd){
            int mid = cStart+(cEnd-cStart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid+1;
            }else{
                cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix,int target){
        int row = matrix.length;
        int cols = matrix[0].length;// be cautious , matrix may be empty 
        if(row ==1){
            return binarysearch(matrix, 0, 0, cols-1, target);
        }
        // run the loop till 2 rows are remaining
        int rStart = 0;
        int rEnd = row-1;
        int cMid = cols/2;

        while(rStart<(rEnd -1)){// while this is true it will be having more than 2 rows 
            int mid = rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }
        // now we have 2 rows 
       // search in 1st half
if(target <= matrix[rStart][cMid-1]){
    return binarysearch(matrix,rStart,0,cMid-1,target);
}

// search in 2nd half
if(target >= matrix[rStart][cMid+1]){
    return binarysearch(matrix,rStart,cMid+1,cols-1,target);
}

// search in 3rd half
if(target <= matrix[rStart+1][cMid-1]){
    return binarysearch(matrix,rStart+1,0,cMid-1,target);
}

// search in 4th half
else{
    return binarysearch(matrix,rStart+1,cMid+1,cols-1,target); 
}

    }
}
