package com.xujj.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Collection.sort�Ƕ�list��������Arrays.sort�Ƕ������������
 *         Collections.sort�ײ�ʵ��
 *         Collections.sort����������list.sort����
 *         list.sort����������Arrays.sort�ķ���
 *
 * Arrays��sort�����ײ���ǣ�
 * legacyMergeSort(a)���鲢����
 * ComparableTimSort.sort()����Timsort����
 *
 *
 */
public class TestSort {

    //Collections.sort��Arrays.sort��ʵ��ԭ��
    @Test
    public void test(){
        List<Integer> list = Arrays.asList(1, 2, 56, 4);
        Collections.sort(list);
        list.stream().forEach(System.out::println);
    }

}
