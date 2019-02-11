import java.io.*;
import java.util.*;

public class CircularlyLinkedList<E> {

    private static class Node<E> {

        private E element;
        private Node<E> next;

        public Node (E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext (Node<E> n) {
            next = n;
        }
    }

    private Node<E> tail = null;
    public int size = 0;

    public CircularlyLinkedList() {};

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return tail.getNext().getElement();
    }

    public void rotate() {
        if (tail != null) {
            tail = tail.getNext();
        }
    }

    public void addFirst(E e) {
        if (size == 0) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        } else {
            tail.setNext(new Node<>(e, tail.getNext()));
        }
        size++;
    }

    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node<E> head = tail.getNext();
        if (head == tail) {
            tail = null;
        } else {
            tail.setNext(head.getNext());
        }
        size--;
        return head.getElement();
    }

    public boolean equals(Object o) {
        if (o == null){
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        CircularlyLinkedList other = (CircularlyLinkedList) o;
        if (size != other.size) {
            return false;
        }
        Node<E> iterA = tail.getNext();
        Node<E> iterB = other.tail.getNext();
        while (iterA != tail) {
            if (!iterA.getElement().equals(iterB.getElement())) {
                return false;
            }
            iterA = iterA.getNext();
            iterB = iterB.getNext();
        }
        return true;
    }
}