import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Proof {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        MergeSort merge = new MergeSort();
        InsertionSort insertion = new InsertionSort();
        InsertionMergeSort insertionMerge = new InsertionMergeSort();

        ArrayList<String> resultList1 = new ArrayList<>(); //merge
        ArrayList<String> resultList2 = new ArrayList<>(); //insertion
        ArrayList<String> resultList3 = new ArrayList<>(); //insertionMerge

//        long startTime = System.nanoTime();
//        long endTime = System.nanoTime();
//        long timeElapsed = endTime - startTime;

        for(int i = 0; i < 5000; i++){
            list.add(rand.nextInt(10000)+1);
            Integer[] arr = list.toArray(new Integer[list.size()]);
            Integer[] arr2 = list.toArray(new Integer[list.size()]);
            Integer[] arr3 = list.toArray(new Integer[list.size()]);

            long startTime = System.nanoTime();
            merge.mergeSort(arr, 0, arr.length-1);
            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;
            resultList1.add("" + timeElapsed);

            startTime = System.nanoTime();
            insertion.insertionSort(arr2, 0, arr2.length-1);
            endTime = System.nanoTime();
            timeElapsed = endTime - startTime;
            resultList2.add("" + timeElapsed);

            startTime = System.nanoTime();
            insertionMerge.insertionMergeSort(arr3, 0, arr3.length-1);
            endTime = System.nanoTime();
            timeElapsed = endTime - startTime;
            resultList3.add("" + timeElapsed);
        }


        for(int i = 0; i < 5000; i++){             //merge                      //insert                        //insertion merge
            System.out.println(i+1 + "\t\t\t" + resultList1.get(i) + "\t\t\t" + resultList2.get(i) + "\t\t\t" + resultList3.get(i));
        }

    }

}
