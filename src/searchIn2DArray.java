import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,5},
                {2,45,66},
                {3,5,56,45},
                {5,7}
                 };
        int target = 45;
        int[] ans = Search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(maximum(arr));
    }

    static int[] Search(int[][]arr , int target){
        for(int row= 0;row<arr.length;row++){
            for(int col =0;col<arr[row].length; col++){
                if(arr[row][col]== target){
                    return new int[]{row,col};
                }
            }

        }
     return new int[]{-1,-1};
    }

    static int maximum(int[][]arr ){
        int max= arr[0][0];
//        int max =Integer.MIN_Value;

        for(int row= 0;row<arr.length;row++){
            for(int col =0;col<arr[row].length; col++){
                if(arr[row][col]> max){
                    max = arr[row][col];
                }

                }
            }
        return max;

        }

}
