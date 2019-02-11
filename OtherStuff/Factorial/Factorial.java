import java.io.*;
import java.util.*;

public class Factorial {

    public static int factorial(int n){
        assert (n > 0);
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int tailFactorial(int n, int acc) {
        assert (n > 0);
        assert (acc > 0);

        if (n == 1) {
            return acc;
        } else {
            return tailFactorial(n - 1, n * acc);
        }
    }

    public static int iterFactorial(int n) {
        assert (n > 0);
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= j;
        }
        return result;
    }

    public static void main (String[] args){
        int a = 4;
        System.out.println(factorial(a));
    }
}