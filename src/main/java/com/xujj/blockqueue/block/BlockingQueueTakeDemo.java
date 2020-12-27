package com.xujj.blockqueue.block;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * ��ǰ����һ��Ԫ��û�У�ȡ���ݵ�ʱ��ͱ�����һֱ�ȴ��ˣ�����һֱû���˳��������ɴ˿ɼ�take()��ȡ������������
 */
public class BlockingQueueTakeDemo {

    private int queueSize = 10;
    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(queueSize);

    class costormer extends Thread {
        @Override
        public void run() {
            try {
                queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("�������ȡ��һ��Ԫ�أ�����ʣ�ࣺ" + queue.size() + "��Ԫ��");
        }
    }

    public static void main(String[] args) {
        BlockingQueueTakeDemo blockingQueueDemo = new BlockingQueueTakeDemo();
        costormer costormer = blockingQueueDemo.new costormer();
        costormer.start();
    }
}
