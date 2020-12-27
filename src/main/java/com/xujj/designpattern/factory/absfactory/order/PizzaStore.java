package com.xujj.designpattern.factory.absfactory.order;

/**
 * @description:
 * @author: xujianjie
 * @create: 2020-07-19 11:13
 **/
public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }

}
