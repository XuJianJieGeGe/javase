package com.xujj.blockqueue.noblock;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * �ɴ˿ɼ�poll()�����Ƕ���û�����ݻ�ȡʱ�������������쳣����null��һ�ַ�ʽ��
 */
public class BlockingQueuePollDemo {

    private int queueSize = 10;
    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(queueSize);

    class costormer extends Thread {
        @Override
        public void run() {
            Object obj = queue.poll();
            if (obj == null) {
                System.out.println("���������ݣ�");
            } else {
                System.out.println("�������ȡ��һ��Ԫ�أ�����ʣ�ࣺ" + queue.size() + "��Ԫ��");
            }
        }
    }

    public static void main(String[] args) {
        BlockingQueuePollDemo blockingQueueDemo = new BlockingQueuePollDemo();
        costormer costormer = blockingQueueDemo.new costormer();
        costormer.start();
    }
}
