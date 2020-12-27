package com.xujj.designpattern.singleton.lazy.volatiles;

/**
 * ����ʽ
 */
public class SynchronizeLazySingleton {


    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }


}

class Singleton{

    private Singleton(){}

    public static volatile Singleton instance;

    public static Singleton getInstance(){
        if(instance==null){
            //����Ҳ���̲߳���ȫ��
            synchronized (Singleton.class){
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}

