package operator;

/**
 * @description: ���Թ�ϵ�����
 * @author: xujianjie
 * @create: 2020-07-05 14:47
 **/
public class Equivalence {

    public static void main(String[] args) {
        Integer n1 = 47;
        Integer n2 = 47;
        System.out.println(n1 == n2);//true
        System.out.println(n1 != n2);//false

        //�Ƚ϶���������Ƿ���ͬ �����ʹ�����ж��󣨲������������ͣ��ж����ڵ� equals() ����
        System.out.println(n1.equals(n2));


    }

}
