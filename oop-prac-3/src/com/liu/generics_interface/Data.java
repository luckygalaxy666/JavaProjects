package com.liu.generics_interface;

import java.util.ArrayList;

public interface Data<E> {
    void add(E e);
    String getName(ArrayList<E> arr);

}
