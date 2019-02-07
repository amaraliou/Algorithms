import java.io.*;
import java.util.*;
import AbstractSort;

public class BubbleSort implements AbstractSort {

    //Swap function
    public static void swap(int someList[], int a, int b){
        int x = someList[a];
        someList[a] = someList[b];
        someList[b] = x;
    }

    //Sorting function
    public void sort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j + 1, j);
                }
            }
        }
    }
}