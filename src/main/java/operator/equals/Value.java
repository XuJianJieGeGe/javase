package operator.equals;

/**
 * @description:
 * @author: xujianjie
 * @create: 2020-07-05 14:52
 **/
class Value {
    int i;
}

class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        // equals() ��Ĭ����Ϊ�ǱȽ϶�������ö��Ǿ������ݡ�
        // ��ˣ��������������и�д equals() �������������ǽ���ȡ������Ҫ�Ľ����
        System.out.println(v1.equals(v2));//false
    }
}
