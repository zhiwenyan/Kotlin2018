package data_structure.linkedList;

/**
 * Description:
 * Data：2019/4/4
 * Author: Steven
 */
public class DoubleLinkedList<T> {
    private int size;

    private Node<T> head;


    private Node<T> last;

    public void add(T value) {
        linkedLast(value);
        size++;

    }

    public void remove(int index) {
        if (index >= 0 && index <= size) {
            unLinked(node(index));
            size--;

        }
    }

    public void insert(int index, T value) {
        if (index == size) {
            linkedLast(value);
        } else {
            linkedBefore(value, node(index));
        }
    }

    public T get(int index) {
        return node(index).value;

    }

    public int size() {
        return size;
    }

    private void linkedBefore(T value, Node<T> cur) {
        Node<T> prev = cur.prev;
        Node<T> newNode = new Node<>(value, prev, cur);
        cur.prev = newNode;
        if (prev == null) {
            head = newNode;
        } else {
            prev.next = newNode;
        }
    }

    private void unLinked(Node<T> cur) {
        Node<T> prev = cur.prev;
        Node<T> next = cur.next;
        if (prev == null) {
            head = next;
        } else {
            prev.next = next;
        }
        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
        }
        cur = null;
    }

    public Node<T> node(int index) {
        if (index < size >> 1) {
            Node<T> cur = head;
            //从前往后遍历
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            return cur;
        } else {
            Node<T> cur = last;
            //从后往前遍历
            for (int i = size-1; i > index; i--) {
                cur = cur.prev;
            }
            return cur;
        }
    }


    private void linkedLast(T value) {
        Node<T> l = last;
        Node<T> newNode = new Node<>(value, l, null);
        last = newNode;
        if (head == null) {
            head = newNode;
        } else {
            l.next = newNode;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> linkedList = new DoubleLinkedList<>();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);

        linkedList.insert(1, 8);
        linkedList.remove(3);
        linkedList.remove(0);
        linkedList.remove(linkedList.size - 1);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
