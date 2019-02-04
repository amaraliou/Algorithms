import java.io.*;
import java.util.*;
import AbstactSort;

public class InsertionSort{

    public static void sort(int a[]){
        int n = a.length;
        for (int j = 1; j < n; j++){
            int key = a[j];
            int i = j - 1;
            while((i >= 0) && (a[i] > key)){
            //Difference between ascending and descending is in the while loop
                a[i + 1] = a[i];
                i--;
            }
            a[i+1] = key;
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