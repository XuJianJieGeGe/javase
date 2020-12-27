package juc;

import java.util.concurrent.CountDownLatch;

/**
 * ��ʱ��������������󣬶���߳�ͬʱ������Ȼ�����м����������Ⲣ��ִ�У�����һ���߳���Ҫ�������̹߳��������󣬲��ܿ�ʼ���ٸ����ӣ�
 * ��������̷ֿ߳�����һ�����ļ���ÿ���߳�ֻ���ع̶���һ�أ����������һ���߳���ƴ�����еķֶΣ���ô��ʱ�����ǿ��Կ���ʹ��CountDownLatch�����Ʋ�����
 */
public class TestCountDownLatch {

    /**
     * �����������������߳�
     * �������2����ʾ����������Ϊ2
     */
    private final static CountDownLatch mCountDownLatch = new CountDownLatch(2);

    /**
     * ʾ�������߳���
     */
    private static class WorkingThread extends Thread {
        private final String mThreadName;
        private final int mSleepTime;
        public WorkingThread(String name, int sleepTime) {
            mThreadName = name;
            mSleepTime = sleepTime;
        }

        @Override
        public void run() {
            System.out.println("[" + mThreadName + "] started!");
            try {
                Thread.sleep(mSleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //��countDown()����release���Ӷ����¼�����ֵ�ݼ������Ҽ�����ֵΪ��ʱ��������еȴ��̵߳�������
            // await()����accquie����������ֵΪ��ʱ��acquire���������أ�����������
            mCountDownLatch.countDown();
            System.out.println("[" + mThreadName + "] end!");
        }
    }

    /**
     * ʾ���߳���
     */
    private static class SampleThread extends Thread {

        @Override
        public void run() {
            System.out.println("[SampleThread] started!");
            try {
                // ������������ȴ� mCountDownLatch ���count��Ϊ0��
                // Ҳ���ǵȴ������WorkingThread����countDown()
                mCountDownLatch.await();
            } catch (InterruptedException e) {

            }
            System.out.println("[SampleThread] end!");
        }
    }

    public static void main(String[] args) throws Exception {
        // ����run SampleThread
        new SampleThread().start();
        // �������������߳�
        // �����߳�1����5��
        new WorkingThread("WorkingThread1", 5000).start();
        // �����߳�2����2��
        new WorkingThread("WorkingThread2", 2000).start();
    }

}
