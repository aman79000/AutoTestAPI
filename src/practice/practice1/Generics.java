package com.autobot.practice.practice1;

public class Generics<T> {

    private T test1;

    public Generics(T value) {
        System.out.println(value);

    }

    public void setTest1(T test1) {

        this.test1 = test1;
    }

    public T getTest1() {
        return this.test1;
    }

    public <TT> void GenericMethodTest(TT t1) {
        System.out.println(t1);
    }






    public static void main(String[] args) {

        Generics<Integer> g = new Generics<>(23);
        Generics<String> s = new Generics<>("Age");
        s.setTest1("by");
        // g.setTest1(22.7);// This is not working as we inilizzed the class with
        // Integer if we
        // initilize the class with Double it will start to work If this makes the
        // full class as what we passed

        // Lets see for the method case
        g.GenericMethodTest(254);
        g.GenericMethodTest("Yum");


    }
}


