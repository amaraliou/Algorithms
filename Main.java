import java.io.*;
import java.util.*;
import HybridQuickSort;

public class Main {
    
    public static void main (String[] args) {
        int[] a = {-2, -3, -4, -1, 2, 1, 5, 3};
        AbstractSort sortType = new QuickSort();
        sortType.sort3params(a, 0, a.length -1);
        for(int number: a){
            System.out.println(number);
        }
    }
}