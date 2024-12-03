package com.liu.generics_class;

public class MyArrayList<E> {
    private Object[] arr = new Object[10];
    private int size = 0;

    public boolean add(E e)
    {
        arr[size++] = e;
        return true;
    }

    public E get(int index)
    {
        return (E) arr[index];
    }

}
