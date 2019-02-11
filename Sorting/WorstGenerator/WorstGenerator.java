import java.io.*;
import java.util.*;

public class WorstGenerator {
    //Class that generates worst cases for sorting algorithms

    public static int[] sortedArray(int n){
        int a = (int) Math.round(Math.random() * 100);
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = a + i;
        }
        return array;
    }

    public static void main(String[] args){
        int[] array = sortedArray(10);
        for (int i: array){
            System.out.println(i);
        }
    }
}