package operator;

/**
 * ����������޷����á�>>>����ʾ���ǽ��������ߵĶ��������ƶ�������ұ�ָ����λ����
 *  �����ڸ�λ��0����ʵ����n λ�����൱�ڳ���2 ��n �η�
 */
public class TestMoveRight {

    public static void main(String[] args) {
        int a=16;
        int b=2; //16/2^2=4
        System.out.println("a ��λ�Ľ����"+(a>>>b));
    }
}
