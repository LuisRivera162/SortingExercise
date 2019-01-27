import java.util.Random;

public class InsertionMergeSort {

    public static InsertionSort insertionsort;
    public static MergeSort mergesort;
    public static Random rand = new Random();

    public InsertionMergeSort(){
        insertionsort = new InsertionSort();
        mergesort = new MergeSort();
    }

    // Main function that sorts arr[l..r] using merge()
    static void insertionMergeSort(Integer arr[], int l, int r) {
        if(l - r <= 43)
            insertionsort.insertionSort(arr, l, r);

        else {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            insertionMergeSort(arr, l, m);
            insertionMergeSort(arr, m + 1, r);

            // Merge the sorted halves
            mergesort.merge(arr, l, m, r);
        }
    }

    public static void main(String[] args){
        Integer[] arr = new Integer[500];

        for(int i = 0; i < 500; i++){
            arr[i] = rand.nextInt(500)+1;
        }

        insertionMergeSort(arr, 0, arr.length-1);

        for(Integer n : arr)
            System.out.print(n + " ");

        System.out.println();
        System.out.println(isSorted(arr));

    }

    public static boolean isSorted(Integer[] arr){
        for(int i = 0; i < arr.length-1; i++)
            if(arr[i] > arr[i+1])
                return false;

        return true;
    }

}
