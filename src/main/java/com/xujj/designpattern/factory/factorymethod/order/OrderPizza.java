package com.xujj.designpattern.factory.factorymethod.order;

import com.xujj.designpattern.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description:
 * @author: xujianjie
 * @create: 2020-07-19 10:39
 **/
public abstract class OrderPizza {

    //����һ�������������ø��������������Լ�ȥʵ�ִ���pizza
    public abstract Pizza createPizza(String orderType);

    public OrderPizza(){
        Pizza pizza = null;
        //Ҫ����pizza������
        String orderType;
        do{
            orderType = getType();
            pizza = createPizza(orderType);
            //���pizza�Ĺ���
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    /**
     * ��ȡpizza������
     */
    public String getType()  {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("������Ҫ������pizza������:");
            String str = reader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
