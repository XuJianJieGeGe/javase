package com.xujj.designpattern.factory.absfactory.pizza;

/**
 * @description:
 * @author: xujianjie
 * @create: 2020-07-18 09:19
 **/
public abstract class Pizza {

    /**
     * ����������
     */
    private String name;

    /**
     * ׼��ԭ����
     */
    public abstract void prepare();

    public void bake(){
        System.out.println(name+":bake");
    }

    public void cut(){
        System.out.println(name+":cut");
    }


    public void box(){
        System.out.println(name+":box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
