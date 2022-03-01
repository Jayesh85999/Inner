package com.simplilearn.inner;

public class RegularInerClass {
    private int a=10;
    class Inner
    {
        void display()
        {
            System.out.println("Welcome to Inner Class");
            System.out.println("value pf a"+a);

        }

    }
    public static void main(String[] args) {
        RegularInerClass outer=new RegularInerClass();
        RegularInerClass.Inner inner=outer.new Inner();

        inner.display();

    }

}