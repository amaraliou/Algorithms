import java.io.*;
import java.util.*;
import AbstractSort;

public class QuickSort implements AbstractSort{

    //Swap function
    public static void swap(int someList[], int a, int b){
        int x = someList[a];
        someList[a] = someList[b];
        someList[b] = x;
    }

    //Basic Quick sort
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

    //Sorting function
    public void sort3params(int a[], int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);
            sort3params(a, p, q - 1);
            sort3params(a, q + 1, r);
        }
    }
}