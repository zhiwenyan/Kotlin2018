package data_structure.linkedList;

/**
 * Description: 单链表
 * Data：2019/4/4
 * Author: Steven
 */

public class LinkedList<T> {

    private Node<T> head;

    private Node<T> last;

    private int size;

    public void add(T value) {
        linkedLast(value);
        size++;
    }

    public void remove(int index) {
        if (index >= 0 && index <= size) {
            unLinked(index);
            size--;
        }
    }

    private void unLinked(int index) {
        if (index == 0) {
            Node<T> h = head;
            head = h.next;
            h = null;
        } else {
            Node<T> prev = node(index - 1);
            Node<T> cur = prev.next;
            prev.next = cur.next;
            cur = null;
        }
    }

    public void insert(int index, T value) {
        if (index == size) {
            linkedLast(value);
        } else {
            linkedBefore(index, value);
        }
        size++;
    }


    public T get(int index) {
        Node<T> node = node(index);
        return node.value;
    }

    public int size() {
        return size;
    }

    private Node<T> node(int index) {
        Node<T> h = head;
        for (int i = 0; i < index; i++) {
            h = h.next;
        }
        return h;
    }

    public void linkedBefore(int index, T value) {
        Node<T> newNode = new Node<>(value, null);
        if (index == 0) {
            Node<T> h = head;
            head = newNode;
            newNode.next = h;
        } else {
            Node<T> prev = node(index - 1);
            Node<T> cur = prev.next;
            prev.next = newNode;
            newNode.next = cur;
        }
    }

    private void linkedLast(T value) {
        Node<T> l = last;
        Node<T> newNode = new Node<>(value, null);
        last = newNode;
        if (head == null) {
            head = newNode;
        } else {
            l.next = newNode;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.remove(3);
        linkedList.insert(linkedList.size, 6);
        linkedList.insert(0, 9);
        linkedList.insert(1, 10);
        System.out.println(linkedList);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
