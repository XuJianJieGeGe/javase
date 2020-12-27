package juc;

import java.util.concurrent.CopyOnWriteArrayList;

public class TestConcurrent {

    public static void main(String[] args) {
        //�̰߳�ȫ������д�ٵĻ���ʹ��
        CopyOnWriteArrayList<Person> copyOnWriteArrayList = new CopyOnWriteArrayList<Person>();
        copyOnWriteArrayList.add(new Person("xujianjie"));
        copyOnWriteArrayList.add(new Person("hudelin"));
        for(Person p:copyOnWriteArrayList){
            System.out.println(p);
        }
    }

}


class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}