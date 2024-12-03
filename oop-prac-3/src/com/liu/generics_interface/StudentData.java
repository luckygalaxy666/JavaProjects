package com.liu.generics_interface;

import java.util.ArrayList;

public class StudentData implements Data<Student>{
    @Override
    public void add(Student student) {

    }

    @Override
    public String getName(ArrayList<Student> arr) {
        String name = arr.get(0).getName();
        return name;
    }
}
