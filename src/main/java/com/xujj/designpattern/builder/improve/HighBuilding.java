package com.xujj.designpattern.builder.improve;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("����¥�ػ�");
    }

    @Override
    public void buildWalls() {
        System.out.println("����¥��ש");
    }

    @Override
    public void roofed() {
        System.out.println("����¥�ⶥ");
    }
}
