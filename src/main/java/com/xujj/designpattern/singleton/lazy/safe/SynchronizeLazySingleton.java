package com.xujj.designpattern.singleton.lazy.safe;

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

    public static Singleton instance;



    public static synchronized Singleton getInstance(){
        if(instance==null){
            //���̰߳�ȫ,����Ч�ʵ�
            instance = new Singleton();
        }
        return instance;
    }


//    public static Singleton getInstance(){
//        if(instance==null){
//            //����Ҳ���̲߳���ȫ��
//            synchronized (Singleton.class){
//                instance = new Singleton();
//            }
//        }
//        return instance;
//    }

}

