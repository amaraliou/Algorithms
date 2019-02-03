import java.io.*;
import java.util.*;
import java.nio.file.*;
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

    public static void main (String[] args){
        try {
            String[] files = new String[] {"int10.txt", "int50.txt", "int100.txt", "int1000.txt", "int500k.txt", "intBig.txt", "dutch.txt"};

            for (String file: files) {
                System.out.print("\n" + file + "\n");
                System.out.print("\nNormal QuickSort: ");
                int[] a = readArray(new int[] {}, file);
                long time1 = System.currentTimeMillis();
                QuickSort.sort(a, 0, a.length - 1);
                long time2 = System.currentTimeMillis();
                long timeTaken = time2 - time1;
                System.out.print(timeTaken + " milliseconds\n");

                System.out.print("\nMedian of Three QuickSort: ");
                a = readArray(new int[] {}, file);
                time1 = System.currentTimeMillis();
                QuickSort.sort3(a, 0, a.length - 1);
                time2 = System.currentTimeMillis();
                timeTaken = time2 - time1;
                System.out.print(timeTaken + " milliseconds\n");

                System.out.print("\n3-Way QuickSort: ");
                a = readArray(new int[] {}, file);
                time1 = System.currentTimeMillis();
                QuickSort.sort3way(a, 0, a.length - 1);
                time2 = System.currentTimeMillis();
                timeTaken = time2 - time1;
                System.out.print(timeTaken + " milliseconds\n");

                System.out.print("\nHybrid QuickSort-InsertionSort: ");
                a = readArray(new int[] {}, file);
                time1 = System.currentTimeMillis();
                QuickSort.optimizedSort(a, 0, a.length - 1, 10);
                time2 = System.currentTimeMillis();
                timeTaken = time2 - time1;
                System.out.print(timeTaken + " milliseconds\n");

                System.out.print("\nMerge Sort: ");
                a = readArray(new int[] {}, file);
                time1 = System.currentTimeMillis();
                MergeSort.sort(a, 0, a.length - 1);
                time2 = System.currentTimeMillis();
                timeTaken = time2 - time1;
                System.out.print(timeTaken + " milliseconds\n");

                System.out.print("\nInsertion Sort: ");
                a = readArray(new int[] {}, file);
                time1 = System.currentTimeMillis();
                InsertionSort.sort(a);
                time2 = System.currentTimeMillis();
                timeTaken = time2 - time1;
                System.out.print(timeTaken + " milliseconds\n");

                System.out.print("\nSelection Sort: ");
                a = readArray(new int[] {}, file);
                time1 = System.currentTimeMillis();
                SelectionSort.sort(a);
                time2 = System.currentTimeMillis();
                timeTaken = time2 - time1;
                System.out.print(timeTaken + " milliseconds\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Bru");
        }
    }
}