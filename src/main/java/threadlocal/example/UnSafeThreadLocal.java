package threadlocal.example;

/**
 *
 *   ���������̣߳���ִ��100�ζԹ������count��1���õ��Ľ�����ܲ�����200������һ���޷�ȷ������
 */
public class UnSafeThreadLocal {

    static int count = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count++;
            }
            System.out.println("count: " + count);
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count++;
            }
            System.out.println("count: " + count);
        }).start();
    }
}
