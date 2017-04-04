package com.AE;

/**
 * Created by Angel on 1/13/17.
 */
public class TestClass implements TestInterface {
    String hello;
    int input;

    public TestClass(String hello, int input ) {
        this.hello = hello;
        this.input = input;
    }


    @Override
    public void hello() {
        System.out.println("Hello " + hello);
    }

    @Override
    public int result(int input) {
        return this.input;
    }
}
