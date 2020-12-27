package com.xujj.designpattern.decorator;

/**
 * @description:����˼�壬װ��ģʽ���Ǹ�һ����������һЩ�µĹ��ܣ�
 * �����Ƕ�̬�ģ�Ҫ��װ�ζ���ͱ�װ�ζ���ʵ��ͬһ���ӿڣ�װ�ζ�����б�װ�ζ����ʵ��
 * @author: xujianjie
 * @create: 2020-08-09 11:11
 **/
public class Decorator implements Sourceable{

    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}
