package com.xujj.blockqueue.block;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * ���Կ����洢���˾ͻ�һֱ�����ȴ���ֱ������Ԫ�ر�ȡ���Ż�ֹͣ�������ɴ˿ɼ��洢���ݵ�put()�����������ܵġ�
 */
public class BlockingQueuePutDemo {

    private int queueSize = 10;
    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(queueSize);

    //������
    class Producer extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < queueSize + 1; i++) {

                try {
                    queue.put(i);
                    System.out.println("����������Ԫ�أ�����ʣ��ռ䣺" + (queueSize - queue.size()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        BlockingQueuePutDemo blockingQueueDemo = new BlockingQueuePutDemo();
        Producer producer = blockingQueueDemo.new Producer();
        producer.start();
    }

}
