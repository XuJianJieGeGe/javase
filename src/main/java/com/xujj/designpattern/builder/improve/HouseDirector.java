package com.xujj.designpattern.builder.improve;

//ָ���ߣ�
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    //���������� houseBuilder
    public HouseDirector(HouseBuilder houseBuilder){
        super();
        this.houseBuilder = houseBuilder;
    }

    //ͨ��setter ����houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //��δ����췿�ӵ����̣�����ָ����ȥ��
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }



}
