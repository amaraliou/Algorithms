import java.io.*;
import java.util.*;

public class Fibonacci {

    public static int fibonacci(int n) {
        assert (n > 0);
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int linearFibonacci( int n, int current, int previous) {
        assert (n >= 0);
        assert (current >= 1);
        assert (previous >= 0);
        if (n == 0){
            return previous;
        }
        return linearFibonacci(n - 1, current + previous, current);
    }

    public static void main (String[] args){
        int a = 22;
        System.out.println(fibonacci(a));
    }
}