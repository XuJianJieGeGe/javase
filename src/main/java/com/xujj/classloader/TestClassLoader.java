package com.xujj.classloader;

/**
 * ����������
 */
public class TestClassLoader {

    public static void main(String[] args) {
        try {
            //ApplicationClassloader--->ExtClassLoader---->Boostrap ClassLoader
            //1.ApplicationClassloader
            System.out.println(ClassLoader.getSystemClassLoader());
            //2.ExtClassLoader
            System.out.println(ClassLoader.getSystemClassLoader().getParent());
            //3.BoostrapClassLoader  null;
            System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());
            Class clazz  = ClassLoader.getSystemClassLoader().loadClass("com.xjj.java.classloader.TestClassLoader");
            Class clazz1  = ClassLoader.getSystemClassLoader().loadClass("com.xjj.java.classloader.TestClassLoader");
            System.out.println(clazz.getClassLoader().getParent());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
