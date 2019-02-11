import java.io.*;
import java.util.*;
import AbstractSort;
import InsertionSort;

public class HybridMergeSort implements AbstractSort {

    //Merge function
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

    //Sorting function
    public void sort4params(int a[], int p, int r, int k){
        if (p < r) {
            if (r - p < k) {
                InsertionSort insertion = new InsertionSort();
                insertion.sort(a);
            } else {
                int q = (p + r) / 2;
                sort4params(a, p, q, k);
                sort4params(a, q + 1, r, k);
                merge(a, p, q, r);
            }
        }
    }
}