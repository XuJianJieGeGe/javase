package com.xujj.designpattern.decorator;

/**
 * @description:
 * @author: xujianjie
 * @create: 2020-08-09 11:15
 **/
public class DecoratorTest {

    public static void main(String[] args) {
       /* װ����ģʽ��Ӧ�ó�����
        1����Ҫ��չһ����Ĺ��ܡ�
        2����̬��Ϊһ���������ӹ��ܣ����һ��ܶ�̬���������̳в���������һ�㣬�̳еĹ����Ǿ�̬�ģ����ܶ�̬��ɾ����
        ȱ�㣺�����������ƵĶ��󣬲����Ŵ�*/
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }

}
