package com.xujj.designpattern.factory.absfactory.pizza;

/**
 * @description:
 * @author: xujianjie
 * @create: 2020-07-19 10:32
 **/
public class BJPepeerPizza extends Pizza {

    @Override
    public void prepare() {
        setName("�����ĺ���pizza");
        System.out.println("������Pepeer����׼��ԭ����");
    }
}
