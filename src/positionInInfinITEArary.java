public class positionInInfinITEArary {
    public static void main(String[] args) {
//        start eith the size ogf two
     int[] arr = {3,4,5,6,7,8,9,12,34,56,78,89,673,678,789};
     int target =89;
     System.out.println(ans(arr, target));
    }
    static int ans(int[] arr , int target){
//        first fidn the range
//        first start with the range of two
        int start= 0;
        int end=1;
        while (target>arr[end]){
            int newStart = end+1;
//            double the vox value=previous end + sizeofbox*2;
            end = end +(end-start +1)*2;
            start = newStart;

        }
        return binarySearch(arr, target, start ,end);
    }
    static int binarySearch(int[] arr , int target, int start , int end){

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
