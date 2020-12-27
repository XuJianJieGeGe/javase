package com.xujj.compare.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @description:
 * @author: xujianjie
 * @create: 2020-12-12 10:31
 **/
public class TestComparator {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student = new Student(12,"����");
        students.add(student);
        student = new Student(18,"�ȿ�");
        students.add(student);
        student = new Student(8,"����");
        students.add(student);
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //���ǰ�ߵ�ѧ�Ŵ��ں��ߵ�ѧ�ţ�����ǰ�ߴ��ں��ߣ�����1ϵͳ�ͻ�ʶ����ǰ�ߴ��ں���
                if (s1.getStu_id() > s2.getStu_id()) {
                    return 1;
                }
                //С��ͬ��
                if (s1.getStu_id() < s2.getStu_id()) {
                    return -1;
                }
                //�������0����Ϊǰ����������
                return 0;
            }
        });
        System.out.println(students);
    }

}
