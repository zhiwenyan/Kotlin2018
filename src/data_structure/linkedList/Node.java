package data_structure.linkedList;

/**
 * Description:
 * Data：2019/4/4
 * Author: Steven
 */
public class Node<T> {

    public T value;


    public Node<T> prev;

    public Node<T> next;


    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public Node(T value, Node<T> prev, Node<T> next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
}
