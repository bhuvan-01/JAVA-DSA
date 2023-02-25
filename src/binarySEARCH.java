public class binarySEARCH {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,23,34,56,67,89,456};
        int target=56;
        int ans = binarySearch(arr, target);
        System.out.println(ans);


    }
//    return the index
//    return -1 if it dosent exist
    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start<= end){
//            find middle
//            int mid = (start + end )/2;
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid-1;

            }else if(target>arr[mid]){
                start= mid+1;
            }else
                return mid;

        }
        return -1;

    }

}