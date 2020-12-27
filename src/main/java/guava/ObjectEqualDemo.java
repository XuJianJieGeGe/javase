package guava;

import com.google.common.base.Objects;

/**
 * ��һ�������е��ֶο���Ϊnullʱ��ʵ��Object.equals�������ʹ�࣬
 * ��Ϊ���ò��ֱ�����ǽ���null��顣ʹ��Objects.equal������ִ��null���е�equals�жϣ��Ӷ������׳�
 */
public class ObjectEqualDemo {

    public static void main(String[] args) {
        System.out.println(Objects.equal("a", "a"));
        System.out.println(Objects.equal(null, "a"));
        System.out.println(Objects.equal("a", null));
        System.out.println(Objects.equal(null, null));
    }
}
