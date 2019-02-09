import java.io.*;
import java.util.*;
import java.nio.file.*;
import AbstractSort;
import QuickSort;
import MergeSort;
import SelectionSort;
import InsertionSort;

class TimeSortingAlgorithm {

    public static int[] readArray (int a[], String fileName) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        ArrayList<Integer> array = new ArrayList<>();
        while (scan.hasNext()){
            array.add(scan.nextInt());
        }
        scan.close();
        int size = array.size();
        int index = 0;
        int[] b = new int[size];
        for (int i: array){
            b[index++] = i;
        }
        return b;
    }

    public static void timeCalc (AbstractSort sortAlgorithm, String fileName) {
        try {
            System.out.print("\n" + fileName + "\n");
            System.out.print("\nNormal QuickSort: ");
            int[] a = readArray(new int[] {}, fileName);
            long time1 = System.currentTimeMillis();
            //sortAlgorithm.sort(a, 0, a.length - 1);
            long time2 = System.currentTimeMillis();
            long timeTaken = time2 - time1;
            System.out.print(timeTaken + " milliseconds\n");
        } catch (FileNotFoundException e) {
            System.out.println("Bru"); 
        }
    }
}