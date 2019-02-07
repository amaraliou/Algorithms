import java.io.*;
import java.util.*;
import BubbleSort;

public class Main {
    
    public static void main (String[] args) {
        int[] a = {-2, -3, -4, -1, 2, 1, 5, 3};
        AbstractSort sortType = new BubbleSort();
        sortType.sort(a);
        for(int number: a){
            System.out.println(number);
        }
    }
}