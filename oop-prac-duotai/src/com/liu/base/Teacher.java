package com.liu.base;

public class Teacher extends  People{
    @Override
    public void run()
    {
        System.out.println("Teacher run");
    }
    public void teach()
    {
        System.out.println("Teacher teach");
    }
}
