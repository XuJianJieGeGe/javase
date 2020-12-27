package com.xujj.designpattern.principle.inversion;

/**
 * ��������ԭ��
 */
public class DependencyInversion1 {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

//�����ʼ�
class Email{
    public String getInfo(){
        return "�����ʼ���Ϣ";
    }
}

//������Ϣ
//��ʽһ����
//1.�򵥣��Ƚ����׵õ�
//2.������ǻ�ȡ�Ķ�����΢�ţ����ŵȵȣ��������࣬ͬʱPersonҲҪ�¼ӽ��ܷ���
//3.���˼·������һ��������Ľӿ�IReceiver,��ʾ�����ߣ���Person����ӿ�IReceiver��������
//��ΪEmail,WeiXin�ȵ����ڽ��շ�Χ�����Ǹ���ʵ��IReceiver�ӿھ�ok,�������Ǿͷ�����������ԭ���˼��
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }


}