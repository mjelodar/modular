package com.example.module.hello;

public class HelloModules implements HelloInterface{
    public static void doSomething() {
        System.out.println("hello, modules");
    }

    @Override
    public void sayHello() {
        System.out.println("hello!!!");
    }
}
