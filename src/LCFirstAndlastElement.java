//public class LCFirstAndlastElement {
////    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//    public static void main(String[] args) {
//   int[] arr = {5,7,7,7,7,8,9,10};
//   int target =7;
//
//    }
//    static int searchRange(int[] nums , int target){
//        int[] ans ={-1,-1};
//        ans[0] = search(nums, target, true);
//        if(ans[0] != -1) {
//            ans[1] = search(nums, target, false);
//        }
//
//     return ans;
//    }
//    static   int search(int[] nums , int target,  boolean findStartIndex){
//        int ans = -1;
//        int start = 0;
//        int end = nums.length-1;
//        while(start<= end){
////            find middle
////            int mid = (start + end )/2;
//            int mid = start + (end - start)/2;
//            if(target < nums[mid]){
//                end = mid-1;
//
//            }else if(target>nums[mid]){
//                start= mid+1;
//            }else
//                //potential answer
//               ans = mid;
//            if(findStartIndex){
//                end = mid - 1;
//
//            }else{
//                start  = mid +1;
//            }
//
//        }
//return ans;
//    }
//}
