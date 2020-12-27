package com.xujj.compare.comparator;

import java.util.Comparator;

/**
 * @description:Comparator �� compare
 * @author: xujianjie
 * @create: 2020-12-12 10:27
 **/
public class Student implements Comparator<Student> {

    private Integer stu_id;

    private String stu_name;

    @Override
    public int compare(Student s1, Student s2) {
        //���ǰ�ߵ�ѧ�Ŵ��ں��ߵ�ѧ�ţ�����ǰ�ߴ��ں��ߣ�����1ϵͳ�ͻ�ʶ����ǰ�ߴ��ں���
        if (s1.stu_id > s2.stu_id) {
            return 1;
        }
        //С��ͬ��
        if(s1.stu_id < s2.stu_id){
            return -1;
        }
        //�������0����Ϊǰ����������
        return 0;
    }

    public Integer getStu_id() {
        return stu_id;
    }

    public void setStu_id(Integer stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public Student(Integer stu_id, String stu_name) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id=" + stu_id +
                ", stu_name='" + stu_name + '\'' +
                '}';
    }
}
