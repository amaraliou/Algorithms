import java.io.*;
import java.util.*;
import AbstractSort;

public class QuickSortThree implements AbstractSort {

    protected String name = "Median of Three QuickSort";

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

    //Median of three method
    public static int medianOfThree(int[] a, int p, int r){
        int mid = (p + r) / 2;
        if (a[r] < a[p]){
            swap(a, p, r);
        }
        if (a[mid] < a[p]){
            swap(a, mid, p);
        }
        if (a[r] < a[mid]){
            swap(a, r, mid);
        }
        swap(a, mid, r - 1);
        return mid;
    }

    //Sorting function 
    public void sort3params(int[] a, int p, int r){
        if (p < r) {
            int q = medianOfThree(a, p, r);
            partition(a, p, q);
            sort3params(a, p, q - 1);
            sort3params(a, q + 1, r);
        } 
    }
}