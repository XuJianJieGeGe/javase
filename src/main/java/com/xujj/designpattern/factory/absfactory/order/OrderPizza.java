package com.xujj.designpattern.factory.absfactory.order;

import com.xujj.designpattern.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description:
 * @author: xujianjie
 * @create: 2020-07-19 11:07
 **/
public class OrderPizza {

    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory){
        setAbsFactory(absFactory);
    }

    private void setAbsFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        String orderType = "";
        this.absFactory = absFactory;
        do {
            orderType = getType();
            pizza = absFactory.CreatePizza(orderType);
            if(pizza!=null){
                //���pizza�Ĺ���
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("����pizzaʧ��");
                break;
            }
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
