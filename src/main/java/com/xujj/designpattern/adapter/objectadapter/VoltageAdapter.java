package com.xujj.designpattern.adapter.objectadapter;

//��������
public class VoltageAdapter  implements Voltage5V {


    private Voltage220V voltage220V;//�ۺϹ�ϵ

    //ͨ������������Voltage220V
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if(voltage220V!=null){
            int src = voltage220V.output220V();
            dst = src/44;
            System.out.println("��������ɣ�����ĵ�ѹΪ="+dst);
        }
        return dst;
    }
}
