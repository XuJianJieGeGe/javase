package com.xujj.deadlock;

import java.util.concurrent.TimeUnit;

/**
 * �������϶�λ�Ų飺
 * 1. ��Terminal
 * 2. �������� jps -l �鿴�������Java��  // jps -l
 * 3. �������� jstack ��������̺߳�      // jstack 9368
 * 4. �������� Found 1 deadlock.
 */
public class HoldLockThread  implements Runnable {

    //ģ����
    private String lockA;
    private String lockB;

    public HoldLockThread(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {

        //��һ����
        synchronized (lockA) {
            System.out.println(Thread.currentThread().getName() + "\t �Լ����У�" + lockA + "\t ���Ի�ã�" + lockB);
            //��ͣ2��,��ֿ�������Ч��
            try { TimeUnit.SECONDS.sleep(2); } catch (InterruptedException e) { e.printStackTrace(); }
            //�ڶ�����
            synchronized (lockB) {
                System.out.println(Thread.currentThread().getName() + "\t �Լ����У�" + lockB + "\t ���Ի�ã�" + lockA);
            }
        }
    }

    //��֤
    public static void main(String[] args) {
        //ģ��������
        String lockA = "lockA";
        String lockB = "lockB";

        //�����߳�
        new Thread(new HoldLockThread(lockA, lockB), "ThreadAAA").start();

        new Thread(new HoldLockThread(lockB, lockA), "ThreadBBB").start();
    }
}
