package com.xujj.designpattern.adapter.objectadapter;

public class Phone {

    //���
    public void charging(Voltage5V voltage5V){
        if(voltage5V.output5V()==5){
            System.out.println("��ѹ5�������Գ����");
        }else if(voltage5V.output5V()>5){
            System.out.println("��ѹ����5���������Գ����");
        }
    }
}
