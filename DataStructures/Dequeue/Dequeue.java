import java.io.*;
import java.util.*;

public interface Dequeue<E> {

    int size();
    boolean isEmpty();
    E first();
    E last();
    void addFirst();
    void addLast();
    E removeFirst();
    E removeLast();
    
}