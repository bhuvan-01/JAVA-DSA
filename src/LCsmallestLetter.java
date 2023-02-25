public class LCsmallestLetter {
//    https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public static void main(String[] args) {


        }


        static int binarySearch(int[] letters , int target){



            int start = 0;
            int end = letters.length-1;
            while(start<= end){
//            find middle
//            int mid = (start + end )/2;
                int mid = start + (end - start)/2;
                if(target < letters[mid]){
                    end = mid-1;

                }else {
                    start= mid+1;
                }

            }
            return letters[start % letters.length];

        }

    }

