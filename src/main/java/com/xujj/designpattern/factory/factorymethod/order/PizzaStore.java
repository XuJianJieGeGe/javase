package com.xujj.designpattern.factory.factorymethod.order;

/**
 * @description:
 * @author: xujianjie
 * @create: 2020-07-19 10:49
 **/
public class PizzaStore {

    public static void main(String[] args) {
        //创建北京各个口味的pizza
//        new BJOrderPizza();

        //创建伦敦各种口味pizza
        new LDOrderPizza();
    }

}
