import java.io.*;
import java.util.*;
import InsertionSort;

public class QuickSort{

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

    public static void sort(int a[], int p, int r) {
        if (p < r) {
            int q = partition(a, p, r);
            sort(a, p, q - 1);
            sort(a, q + 1, r);
        }
    }

    //Quick sort with Insertion Sort if the array is almost sorted
    public static void optimizedSort(int a[], int p, int r, int k){
        if (p < r) {
            if (r - p < k) {
                InsertionSort.sort(a);
            } else {
                int q = partition(a, p, r);
                sort(a, p, q - 1);
                sort(a, q + 1, r);  
            }
        }
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
        return mid;
    }

    public static void sort3(int[] a, int p, int r){
        if (p < r) {
            int q = medianOfThree(a, p, r);
            sort(a, p, q - 1);
            sort(a, q + 1, r);
        } 
    }

    //3 way Quick Sort
    public static int[] partition3 (int a[], int p, int r){
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

    public static void sort3way(int a[], int p, int r) {
        if (p < r) {
            int lt = partition3(a, p, r)[0];
            int gt = partition3(a, p, r)[1];
            sort3way(a, p, lt - 1);
            sort3way(a, gt + 1, r);
        }
    }

    public static void main (String[] args){
        int []a = {-2, -3, -4, -1, 2, 1, 5, 3};
        sort3way(a, 0, a.length - 1);
        for(int number: a){
            System.out.println(number);
        }
    }
}