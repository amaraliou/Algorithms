import java.io.*;
import java.util.*;
import AbstractSort;

public class MergeSort implements AbstractSort{

    //Basic MergeSort
    public static void merge(int[] a, int p, int q, int r){
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        for (int i = 0; i < n1; i++){
            L[i] = a[p + i];
        }

        for (int j = 0; j < n2; j++){
            R[j] = a[q + j + 1];
        }

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for (int k = p; k <= r; k++){
            if(L[i] <= R[j]){
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
        }
    }

    public void sort3params(int a[], int p, int r){
        if (p < r) {
            int q = (p + r) / 2;
            sort3params(a, p, q);
            sort3params(a, q + 1, r);
            merge(a, p, q, r);
        }
    }

    /*
    //Optimized Merge Sort with Insertion Sort
    public static void optimizedSort(int a[], int p, int r, int k){
        if (p < r) {
            if (r - p < k) {
                InsertionSort.sort(a);
            } else {
                int q = (p + r) / 2;
                sort(a, p, q);
                sort(a, q + 1, r);
                merge(a, p, q, r);
            }
        }
    }

    //Bottom up sort
    public static void bottomUpSort(int a[], int p, int r) {
        int n = r - p;
        for (int sz = 1; sz < n; sz = sz + sz) {
            for (int x = 0; x < n - sz; x += sz + sz) {
                merge(a, x, x + sz - 1, Math.min(x + sz + sz -1, n - 1));
            }
        }
    }
    */
}