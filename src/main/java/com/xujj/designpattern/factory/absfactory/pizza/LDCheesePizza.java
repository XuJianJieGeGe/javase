package com.xujj.designpattern.factory.absfactory.pizza;

/**
 * @description:
 * @author: xujianjie
 * @create: 2020-07-19 10:35
 **/
public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("�׶ص�����pizza");
        System.out.println("�׶ص���������׼��ԭ����");
    }
}
