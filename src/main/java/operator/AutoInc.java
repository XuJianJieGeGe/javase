package operator;

/**
 * @description: ����i++��++i,i--,--i
 * @author: xujianjie
 * @create: 2020-07-05 14:44
 **/
public class AutoInc {

    public static void main(String[] args) {
        int i = 1;
        System.out.println("i: " + i);//1
        System.out.println("++i: " + ++i); // ǰ���� 2
        System.out.println("i++: " + i++); // ����� 2
        System.out.println("i: " + i); // 3
        System.out.println("--i: " + --i); // ǰ�ݼ� 2
        System.out.println("i--: " + i--); // ��ݼ� 3
        System.out.println("i: " + i);//1
    }

}
