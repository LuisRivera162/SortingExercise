public class InsertionSort {

    static void insertionSort(Integer A[], int p, int q)
    {
        for (int i = p; i < q; i++) {
            int tempVal = A[i + 1];
            int j = i + 1;
            while (j > p && A[j - 1] > tempVal) {
                A[j] = A[j - 1];
                j--;
            }
            A[j] = tempVal;
        }
    }
}
