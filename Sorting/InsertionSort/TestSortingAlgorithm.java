import java.io.*;
import java.util.*;
import InsertionSort;

//Algorithm of complexity O(n)
public class TestSortingAlgorithm{

    public static boolean isSorted(int a[]){
        int n = a.length;
        for (int i = 0; i < n - 1; i++){
            if (a[i] > a[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args){
        int []a = {-2, -3, -4, -1, 2, 1, 5, 3};
        System.out.println(isSorted(a));
        InsertionSort.sort(a);
        System.out.println(isSorted(a));
    }
}