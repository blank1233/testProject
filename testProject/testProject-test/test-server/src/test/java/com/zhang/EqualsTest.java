package com.zhang;


import java.util.HashSet;

public class EqualsTest {

    private String name;

    @Override
    public boolean equals(Object obj) {
        return this.equals(obj);
    }

    public static void main(String[] args) {

        EqualsTest test1 = new EqualsTest("张三");
        EqualsTest test2 = new EqualsTest("张三");
        HashSet<Object> objectSet = new HashSet<Object>();
        objectSet.add(test1);
        objectSet.add(test2);
        System.out.println(test1.equals(test2) + "------equals");
        System.out.println(test1.hashCode() + "------ test2 --" + test2.hashCode());
        System.out.println(objectSet);
    }

    public EqualsTest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EqualsTest{" +
                "name='" + name + '\'' +
                '}';
    }
}
