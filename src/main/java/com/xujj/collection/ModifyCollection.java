package com.xujj.collection;

import java.util.HashMap;
import java.util.Map;

/**
 *  ��ôȷ��һ�����ϲ��ܱ��޸ģ�
 *
 *  �ܶ����Ѻܿ����뵽��final�ؼ��ֽ������Σ�final���ε������Ա����������ǻ����������ͣ���ʾ���������ֵ�ǲ��ɸı�ģ�
 *  ������������ͣ����ʾ������õĵ�ֵַ�ǲ��ܸı�ģ��������������ָ��Ķ�����������ݻ��ǿ��Ըı��~��֤һ�£�
 */
public class ModifyCollection {

    //final ����
    private static final Map<Integer, String> map = new HashMap<Integer, String>();
    {
        map.put(1, "jay");
        map.put(2, "tianluo");
    }

    public static void main(String[] args) {
        map.put(1, "boy");
        System.out.println(map.get(1));
    }

}
