import java.io.*;
import java.util.*;

public abstract interface AbstractSort{

    public abstract void sort(int[] a);
    public abstract void sort3params(int[] a, int p, int r);
    public abstract void sort4params(int[] a, int p, int r, int k);
    //Implement this abstract class and the sorting algorithms as subclasses
}