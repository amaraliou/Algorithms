import java.io.*;
import java.util.*;

public class SelectionSort{

    public static void sort(int a[]){
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[index]) {
                    index = j;
                }
            }

            int min = a[index];
            a[index] = a[i];
            a[i] = min;
        }
    }

    public static void main (String[] args){
        int []a = {-2, -3, -4, -1, 2, 1, 5, 3};
        sort(a);
        for(int number: a){
            System.out.println(number);
        }
    }
}