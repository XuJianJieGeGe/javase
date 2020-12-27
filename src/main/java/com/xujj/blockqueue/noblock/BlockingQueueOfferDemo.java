package com.xujj.blockqueue.noblock;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * ���˵���������׳��쳣��Ҳ�������������־��ǳɹ��洢�ͷ���true���������˲��ܴ洢�ͷ���false��
 */
public class BlockingQueueOfferDemo {

    private int queueSize = 10;
    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(queueSize);

    //������
    class Producer extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < queueSize + 1; i++) {
                Boolean issuccess = queue.offer(i);
                if (issuccess) {
                    System.out.println("����������Ԫ�أ�����ʣ��ռ䣺" + (queueSize - queue.size()));
                } else {
                    System.out.println("����������");
                }
            }
        }
    }

    public static void main(String[] args) {
        BlockingQueueOfferDemo blockingQueueDemo = new BlockingQueueOfferDemo();
        Producer producer = blockingQueueDemo.new Producer();
        producer.start();
    }
}
