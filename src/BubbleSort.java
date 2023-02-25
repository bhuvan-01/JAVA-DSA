import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//      bubble short
//        compare ADjacent element and swap if grreater or less depend on condition
//       with the first  pass through the array the largest element comes at the end
// also known as Syncing Sort or Exchange sort
//        Space complexity - O(1) constant
//        complexity - BC O(N)  wc- O(N^2)

        int[] arr = {5,-4,3,-2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void bubble(int[] arr){
        boolean swapped;
//        run the steps n-1 times
        for (int i = 0; i <arr.length; i++) {
            swapped=false;

//            for each steps, max item will come at the last respective index
            for (int j = 1; j < arr.length -i; j++) {
//                swap if the item is smaller tha previous item
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] =temp;
                    swapped=true;
                }
                
            }
//            if you did nOT WSAPPED foe the particular value for i , it eans array is sorted hence stop the program
        if(!swapped){
            break;
        }
        }

    }
}
