package com.xujj.designpattern.builder.improve;

public class CommonHouse  extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("��ͨ���Ӵ�ػ�");
    }

    @Override
    public void buildWalls() {
        System.out.println("��ͨ������ǽ");
    }

    @Override
    public void roofed() {
        System.out.println("��ͨ���ӷⶥ");
    }
}
