import java.io.*;
import java.util.*;

public abstract interface AbstractSort{

    //Sorting with 1 parameter (Insertion/Selection Sort)
    public abstract void sort(int[] a);
    //Sorting with 2 parameters (Recursive Bubble Sort)
    public abstract void sort2params(int[] a, int n);
    //Sorting with 3 parameters (Merge/Quick Sort)
    public abstract void sort3params(int[] a, int p, int r);
    //Sorting with 4 parameters (Hybrid Merge/Quick Sort)
    public abstract void sort4params(int[] a, int p, int r, int k);

}