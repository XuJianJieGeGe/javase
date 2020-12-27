package com.xujj.designpattern.singleton.egger;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getSingletonInstance();
        Singleton instance2 =Singleton.getSingletonInstance();
        System.out.println(instance1 == instance2);
    }
}

//��ģʽ
class Singleton {
    private Singleton() {
    }

    private final static Singleton singleton = new Singleton();

    public static synchronized Singleton getSingletonInstance() {
        return singleton;
    }
}
