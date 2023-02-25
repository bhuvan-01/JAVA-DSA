import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertionSort(int[] arr){
//        i will itrate till arr.length -2 // otherwise condition exceeds
        for (int i = 0; i < arr.length-1 ; i++) {
//            j always greater than 0
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j ,j-1);

                }else{
                    break;
                }

            }

        }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
