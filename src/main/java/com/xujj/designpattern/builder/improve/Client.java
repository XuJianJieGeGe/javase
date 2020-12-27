package com.xujj.designpattern.builder.improve;

public class Client {

    public static void main(String[] args) {
        //����ͨ�ķ���
        CommonHouse commonHouse = new CommonHouse();
        //z׼���������ӵ�ָ����
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        //��ɸǷ��ӣ����ط���
        House house = houseDirector.constructHouse();

        System.out.println("================");
        //�Ǹ�¥
        HighBuilding highBuilding = new HighBuilding();
        //���ý�����
        houseDirector.setHouseBuilder(highBuilding);
        //��ɸǷ��ӣ����ز�Ʒ��¥
         house = houseDirector.constructHouse();

    }
}
