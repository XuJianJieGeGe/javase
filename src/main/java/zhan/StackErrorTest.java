package zhan;

/**
 * ջ���쳣��StackOverflowError
 * Ĭ������£�count��11420
 *
 * ����ջ�Ĵ�С��-Xss256k  :count :2465
 *
 */
public class StackErrorTest {

    private static int count  = 1;

    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
