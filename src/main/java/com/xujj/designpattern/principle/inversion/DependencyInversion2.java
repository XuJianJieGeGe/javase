package com.xujj.designpattern.principle.inversion;

public class DependencyInversion2 {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }

    interface IReceive{
         String getInfo();
    }

    static class Email implements IReceive{
        public String getInfo() {
            return "�����ʼ���Ϣ:�����������ɵ��";
        }
    }

    static class WeiXin implements IReceive{
        public String getInfo() {
            return "΢����Ϣ�������������ɵ��";
        }
    }

    static class Person{
        public void receive(IReceive iReceive){
            System.out.println(iReceive.getInfo());
        }
    }
}
