package optional;


import org.junit.Test;

import java.util.Optional;

/**
 * guava��Optional������Java 8������Optional�࣬������������null�ģ�
 * ����guava���ǳ����࣬��ʵ����ΪAbsent��Present����java.util����final�ࡣ����һ���ַ���������ͬ�ġ�
 *
 *
 * Guava��Optional��ʾ����Ϊnull��T�������á�һ��Optionalʵ�����ܰ�����null�����ã����ǳ�֮Ϊ���ô��ڣ���
 * Ҳ����ʲôҲ����������֮Ϊ����ȱʧ�������Ӳ�˵��������nullֵ�������ô��ڻ�ȱʧ����ʾ����Optional�Ӳ������nullֵ���á�
 */
public class OptionalDemo {
    public static void main(String[] args) {
        Integer value1=null;
        Integer value2=10;
       /*����ָ�����õ�Optionalʵ����������Ϊnull�����ʧ�ܷ���absent()
         absent()��������ȱʧ��Optionalʵ��
        */
        Optional<Integer> a= Optional.ofNullable(value1);
        Optional<Integer> b= Optional.of(value2); //���ذ��������ķǿ�����Optionalʵ��
        System.out.println(sum(a,b));
    }

    private static Integer sum(Optional<Integer> a,Optional<Integer> b){
        //isPresent():���Optional������null�����ã����ô��ڣ�������true
        System.out.println("First param is present: "+a.isPresent());
        System.out.println("Second param is present: "+b.isPresent());
        Integer value1=a.orElse(0);  //����Optional������������,������ȱʧ,����ָ����ֵ
        Integer value2=b.get(); //������������ʵ��,���������,ͨ���ڵ��ø÷���ʱ�����isPresent()�ж��Ƿ�Ϊnull
        return value1+value2;
    }

    @Test
    public void test(){
        System.out.println(Optional.ofNullable(null).orElse(2));
    }


}

