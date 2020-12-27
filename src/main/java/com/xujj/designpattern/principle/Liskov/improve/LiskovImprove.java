package com.xujj.designpattern.principle.Liskov.improve;

public class LiskovImprove {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.function1(11,3));
        System.out.println("1-8="+a.function1(1,8));

        System.out.println("=======");
        B b = new B();
        System.out.println("11+3="+b.function1(11,3));
        System.out.println("1+8="+b.function1(1,8));
        System.out.println("11+3+9="+b.function2(11,3));

        //ʹ����ϵ���A����صķ���
        System.out.println("11-3="+b.function3(11,3));
    }


}

class Base{
    //�Ѹ������Ķ���д������

}

class A extends Base{
    //�����������Ĳ�
    public int function1(int num1,int num2){
        return num1-num2;
    }
}

class B extends Base{
    //���B��Ҫ��A��ķ����Ļ���ʹ����Ϲ�ϵ
   private A a = new A();
    //������д��A�ķ���
    public int function1(int a,int b){
        return a+b;
    }

    public int function2(int a,int b){
        return function1(a,b)+9;
    }

    //�����������Ĳ�
    public int function3(int num1,int num2){
        return num1-num2;
    }
}

