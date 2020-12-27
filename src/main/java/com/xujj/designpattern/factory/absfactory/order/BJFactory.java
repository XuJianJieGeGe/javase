package com.xujj.designpattern.factory.absfactory.order;


import com.xujj.designpattern.factory.absfactory.pizza.BJCheesePizza;
import com.xujj.designpattern.factory.absfactory.pizza.BJPepeerPizza;
import com.xujj.designpattern.factory.absfactory.pizza.Pizza;

/**
 * @description:
 * @author: xujianjie
 * @create: 2020-07-19 11:04
 **/
public class BJFactory implements AbsFactory {

    @Override
    public Pizza CreatePizza(String orderType) {
        System.out.println("ʹ�ó��󹤳�ģʽ");
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepeer")){
            pizza = new BJPepeerPizza();
        }
        return pizza;
    }
}
