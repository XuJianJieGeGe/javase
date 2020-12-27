package com.xujj.blockqueue.exception;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * ����һ��ȡԪ�أ�Ԫ��û���ˣ����쳣�Ĵ������
 */
public class BlockingQueueRemoveDemo {

    private int queueSize = 10;
    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(queueSize);

    class costormer extends Thread {
        @Override
        public void run() {
            queue.remove();
            System.out.println("�������ȡ��һ��Ԫ�أ�����ʣ�ࣺ" + queue.size() + "��Ԫ��");
        }
    }


    public static void main(String[] args) {
        BlockingQueueRemoveDemo blockingQueueDemo = new BlockingQueueRemoveDemo();
        costormer costormer = blockingQueueDemo.new costormer();
        costormer.start();
    }
}


