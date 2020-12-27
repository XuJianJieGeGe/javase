package com.xujj.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListAndArrayExchange {


    @Test
    public void testListToArray() {
        //List תArray������ʹ�ü��ϵ� toArray(T[] array)
        List<String> list = new ArrayList<String>();
        list.add("jay");
        list.add("tianluo");

        // ʹ�÷��ͣ�������ʽ����ת��
        String[] array = list.toArray(new String[list.size()]);
        System.out.println(array[0]);

       //���ֱ��ʹ�� toArray �޲η���������ֵֻ���� Object[] �࣬ǿת�������Ϳ���������(����ʾ��)
        List<String> list2 = new ArrayList<String>();
        list2.add("jay");
        list2.add("tianluo");

        String[] array2 = (String[]) list.toArray();
        System.out.println(array2[0]);
    }

    @Test
    public void testArrayToList() {
        List<Integer> integers = Arrays.asList(1,2,3);
        integers.stream().forEach(System.out::println);
    }








}
