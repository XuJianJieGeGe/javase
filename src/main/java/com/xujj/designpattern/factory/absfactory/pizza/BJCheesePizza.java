package com.xujj.designpattern.factory.absfactory.pizza;

/**
 * @description:������������
 * @author: xujianjie
 * @create: 2020-07-19 10:31
 **/
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("����������pizza");
        System.out.println("��������������׼��ԭ����");
    }
}
