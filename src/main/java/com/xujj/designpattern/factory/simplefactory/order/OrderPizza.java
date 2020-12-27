package com.xujj.designpattern.factory.simplefactory.order;

import com.xujj.designpattern.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description:
 * @author: xujianjie
 * @create: 2020-07-18 09:26
 **/
public class OrderPizza {

//    public OrderPizza(){
//        Pizza pizza = null;
//        //Ҫ����pizza������
//        String orderType;
//        do{
//            orderType = getType();
//            if(orderType.equals("greek")){
//                pizza = new GreekPizza();
//                pizza.setName("ϣ��pizza");
//            }else if(orderType.equals("cheese")){
//                pizza = new CheesePizza();
//                pizza.setName("����pizza");
//            }else {
//                break;
//            }
//            //���pizza�Ĺ���
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }

    public  OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    //����һ������
    private SimpleFactory simpleFactory;
    Pizza pizza = null;

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = ""; //�û������
        this.simpleFactory = simpleFactory;
        do{
            orderType = getType();
            pizza = simpleFactory.createPizza(orderType);
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
