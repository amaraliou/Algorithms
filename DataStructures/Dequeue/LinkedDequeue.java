import java.io.*;
import java.util.*;
import Dequeue;
import SinglyLinkedList;

public class LinkedDequeue<E> implements Dequeue<E> {

    private SinglyLinkedList<E> list = new SinglyLinkedList<>();

    public LinkedDequeue() {};

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public E first() {
        return list.first();
    }

    public E last() {
        return list.last();
    }

    public void addFirst(E element) {
        list.addFirst(element);
    }

    public void addLast(E element) {
        list.addLast(element);
    }

    public E removeFirst() {
        return list.removeFirst();
    }
}