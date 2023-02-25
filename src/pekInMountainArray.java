//public class pekInMountainArray {
//
//    https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/901635483/
//    public static void main(String[] args) {
//       int start=0;
//       int end=arr.length -1;
//
//       while(start <end ){
//           int mid = start +(end -start)/2;
//           if(arr[mid] >arr[mid+1]){
////               your are in decreaaseing aprt of array
////               this may me true but but look at left siide
//               end=mid;
//
//           } else {
////               you are in asceding aprt of aray
////               beacause we know that the mid +1 element greater tham mid element
//               start =mid+1;
//
//           }
//
//       }
////      in the end start == end and [pointing to the alrgets number becaue of 2 checks
////start and end are always trying to find max element
//        return start;
//    }
//}
