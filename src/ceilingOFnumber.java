public class ceilingOFnumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,23,34,56,67,89,456};
        int target=55;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
//    smallest number greater than equal to target
    static int binarySearch(int[] arr , int target){

//  but what if the target numerbis greater than the greates number in the array
      if (target > arr[arr.length-1]){
       return -1;
        }

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
        return start;

    }
}
