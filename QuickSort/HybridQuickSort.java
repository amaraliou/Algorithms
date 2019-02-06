import java.io.*;
import java.util.*;
import AbstractSort;
import InsertionSort;

public class HybridQuickSort implements AbstractSort {

    protected String name = "Hybrid QuickSort-InsertionSort";

    public String getName() {
        return name;
    }

    //Swap function
    public static void swap(int someList[], int a, int b){
        int x = someList[a];
        someList[a] = someList[b];
        someList[b] = x;
    }

    //Partition function
    public static int partition (int a[], int p, int r){
        int x = a[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (a[j] <= x) {
                i = i + 1;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, r);
        return i + 1;
    }

    //Quick sort with Insertion Sort if the array is almost sorted
    public void sort4params(int a[], int lowerBound, int upperBound, int cutOff){
        if (lowerBound < upperBound) {
            if (upperBound - lowerBound < cutOff) {
                InsertionSort insertion = new InsertionSort();
                insertion.sort(a);
                ;
            } else {
                int pivot = partition(a, lowerBound, upperBound);
                sort4params(a, lowerBound, pivot - 1, cutOff);
                sort4params(a, pivot + 1, upperBound, cutOff);  
            }
        }
    }
}