package com.example.module.main;

import com.example.module.hello.HelloInterface;
import com.example.module.hello.HelloModules;

import java.util.ServiceLoader;

public class MainApp {
    public static void main(String[] args) {
        HelloModules.doSomething();
        Iterable<HelloInterface> service = ServiceLoader.load(HelloInterface.class);
        HelloInterface helloInterface = service.iterator().next();
        helloInterface.sayHello();
    }
}
