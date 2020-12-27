package com.xujj.designpattern.principle.Liskov;

public class Liskov {


    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.function1(11,3));
        System.out.println("1-8="+a.function1(1,8));

        System.out.println("=======");
        B b = new B();
        System.out.println("11-3="+b.function1(11,3));//������11-3�����ǽ���� 14
        System.out.println("1-8="+b.function1(1,8));//1-8 ��9
        System.out.println("11+3+9="+b.function2(11,3));
    }
}

class A{
    //�����������Ĳ�
    public int function1(int num1,int num2){
        return num1-num2;
    }
}

class B extends A{

    //������д��A�ķ���
    public int function1(int a,int b){
        return a+b;
    }

    public int function2(int a,int b){
        return function1(a,b)+9;
    }
}

