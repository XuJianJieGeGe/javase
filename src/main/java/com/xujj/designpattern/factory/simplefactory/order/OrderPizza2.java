package com.xujj.designpattern.factory.simplefactory.order;

import com.xujj.designpattern.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description:ͨ����̬�ķ��������򵥹���
 * @author: xujianjie
 * @create: 2020-07-19 10:20
 **/
public class OrderPizza2 {

    //����һ������
    Pizza pizza = null;
    String orderType = ""; //�û������
    public OrderPizza2(){
        do{
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);
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
            System.out.println("������Ҫ������pizza������");
            String str = reader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
