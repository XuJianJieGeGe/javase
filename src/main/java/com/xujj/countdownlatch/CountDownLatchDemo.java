package com.xujj.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 *
 * CountDownLatch��java.util.concurrent���е�һ��ͬ�������࣬�����һ�����������߳���ִ�еĲ���֮ǰ��
 * ������һ�������߳�һֱ�ȴ�������Ҫ����Э������߳�֮���ͬ������һ��ͬ���������á�
 * �ܵ���˵��CountDownLatch��һ�������߳������й����е�ĳ��ʱ�����ͣ�����ȴ�������һЩ�߳����ĳЩ������ټ������С�
 *
 *
 * countDown
 * �ݼ��������ļ�����������������㣬���ͷ����еȴ����̡߳�
 * �����ǰ���������㣬����ݼ���
 * ����¼���Ϊ�㣬�������������еȴ��߳��Խ����̵߳��ȡ�
 * �����ǰ���������㣬�򲻷����κβ�����
 *
 * await
 * ���ڵ��� countDown()���������������㣻����
 * ����ĳ���߳��жϵ�ǰ�̣߳�����
 * �ѳ���ָ���ĵȴ�ʱ�䡣
 *
 */
public class CountDownLatchDemo {

        public static void main(String[] args) throws InterruptedException {
            CountDownLatch count = new CountDownLatch(10);
            for (int i = 0; i < 10; i++) {
                new Thread(() -> {
                    System.out.println(Thread.currentThread().getName() + "���극�ˣ��뿪��");
                    count.countDown();
                },String.valueOf(i) ).start();
            }
            count.await();
            System.out.println(Thread.currentThread().getName() + "��Ҫȥϴ����");
        }

}
