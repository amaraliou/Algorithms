import java.io.*;
import java.util.*;
import AbstractSort;

public class RecursiveBubbleSort implements AbstractSort {

    //Swap function
    public static void swap(int someList[], int a, int b){
        int x = someList[a];
        someList[a] = someList[b];
        someList[b] = x;
    }

    //Recursive sorting function
    public void sort2params(int[] a, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                swap(a, i + 1, i);
            }
        }

        sort2params(a, n - 1);
    }
}