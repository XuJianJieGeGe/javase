package com.xujj.designpattern.decorator;

/**
 * @description:װ��ģʽ���Ǹ�һ����������һЩ�µĹ��ܣ�
 *  �����Ƕ�̬�ģ�Ҫ��װ�ζ���ͱ�װ�ζ���ʵ��ͬһ���ӿڣ�װ�ζ�����б�װ�ζ����ʵ��
 * @author: xujianjie
 * @create: 2020-08-09 11:10
 **/
public class Source implements Sourceable  {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
