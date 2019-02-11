import java.io.*;
import java.util.*;
import AbstractSort;

public class QuickSortThreeWay implements AbstractSort {

    //Swap function
    public static void swap(int someList[], int a, int b){
        int x = someList[a];
        someList[a] = someList[b];
        someList[b] = x;
    }

    //Partition with two pivots
    public static int[] partition (int a[], int p, int r){
        int lt = p;
        int i = p + 1;
        int gt = r;
        int x = a[p];

        while (i <= gt) {
            if (a[i] < x) {
                swap(a, lt++, i++);
            } else if (a[i] > x) {
                swap(a, i, gt--);
            } else {
                i++;
            }
        }
        return new int[] {lt, gt};
    }

    //Sorting function
    public void sort3params(int a[], int p, int r) {
        if (p < r) {
            int[] part = partition(a, p, r);
            sort3params(a, p, part[0] - 1);
            sort3params(a, part[1] + 1, r);
        }
    }
}