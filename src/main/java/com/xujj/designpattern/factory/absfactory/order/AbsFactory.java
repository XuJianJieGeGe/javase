package com.xujj.designpattern.factory.absfactory.order;

import com.xujj.designpattern.factory.absfactory.pizza.Pizza;

/**
 * @description:һ������ӿ�ģʽ�ĳ����
 * @author: xujianjie
 * @create: 2020-07-19 11:02
 **/
public interface AbsFactory {

    //������Ĺ��������Լ�ʵ��
    Pizza CreatePizza(String orderType);
}
