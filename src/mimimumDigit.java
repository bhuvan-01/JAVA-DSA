public class mimimumDigit {
    public static void main(String[] args) {

                int[] arr = {3,5,6,7,65,34,56,68,23,234,456,765,23,44};
                System.out.println(minimum(arr));

            }

            static int minimum(int[] arr){
                int ans= arr[0];
                for(int i = 1; i < arr.length; i++){
                    if(arr[i]< ans){
                        ans=arr[i];
                    }

                }
                return ans;
            }
        }

