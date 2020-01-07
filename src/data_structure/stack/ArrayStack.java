package data_structure.stack;

import java.util.Arrays;

/**
 * Description:
 * Data：2019/4/4
 * Author: Steven
 */
public class ArrayStack<E> {
    private static final int DEFAULT_CAPACITY = 5;
    private int top = 0;

    private Object[] elementData = new Object[DEFAULT_CAPACITY];


    //入栈
    public void push(E value) {
        ensureCapacityInternal(top + 1);
        elementData[top++] = value;

    }

    public void pop() {
        if (top >= 0) {
            System.out.println(elementData[top - 1]);
            elementData[top - 1] = null;
        }
    }

    public E getTopElementData(int index) {
        return (E) elementData[index-1];
    }

    public int size() {
        return top;
    }


    private void ensureCapacityInternal(int minCapacity) {
        if (minCapacity - elementData.length > 0) {
            grow(minCapacity);
        }
    }

    private void grow(int minCapacity) {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0) {
            newCapacity = minCapacity;
        }
        System.out.println("newCapacity=" + newCapacity);
        elementData = Arrays.copyOf(elementData, newCapacity);
    }


    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.pop();
        System.out.println(stack.getTopElementData(stack.size()));
    }

}
