public class SearchInmountsain {
    public static void main(String[] args) {

    }
    int search(int[] arr, int target){
        int peak=peakIndex(arr);
        int firstTry= orderAgnosticBS(arr, target,0, peak);
        if(firstTry != -1){
            return firstTry;

        }
        return orderAgnosticBS(arr, target, peak+1 ,arr.length-1);
    }

    public int peakIndex(int[] arr) {
        int start=0;
        int end=arr.length -1;

        while(start <end ){
            int mid = start +(end -start)/2;
            if(arr[mid] >arr[mid+1]){
//               your are in decreaaseing aprt of array
//               this may me true but but look at left siide
                end=mid;

            } else {
//               you are in asceding aprt of aray
//               beacause we know that the mid +1 element greater tham mid element
                start =mid+1;

            }

        }
//      in the end start == end and [pointing to the alrgets number becaue of 2 checks
//start and end are always trying to find max element
        return start;
    }

    public int orderAgnosticBS(int[] arr, int target,int start,int end){

        boolean isAsc = arr[start]<arr[end];

        while(start<= end){
//            find middle
//            int mid = (start + end )/2;
            int mid = start + (end - start)/2;
            if(arr[mid]==target) {
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;

                }else {
                    start= mid+1;
                }


            }else{
                if(target > arr[mid]){
                    end = mid-1;

                }else {
                    start= mid+1;
                }


            }


        }
        return -1;
    }
}
