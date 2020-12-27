package guava;


import com.google.common.base.Optional;


/**
 * guava��Optional������Java 8������Optional�࣬������������null�ģ�����guava���ǳ����࣬��ʵ����ΪAbsent��Present����java.util����final�ࡣ����һ���ַ���������ͬ�ġ�
 *
 * Guava��Optional��ʾ����Ϊnull��T�������á�һ��Optionalʵ�����ܰ�����null�����ã����ǳ�֮Ϊ���ô��ڣ���Ҳ����ʲôҲ����������֮Ϊ����ȱʧ�������Ӳ�˵��������nullֵ�������ô��ڻ�ȱʧ����ʾ����Optional�Ӳ������nullֵ���á�
 * ��������������������������������
 * ��Ȩ����������ΪCSDN������dgeek����ԭ�����£���ѭCC 4.0 BY-SA��ȨЭ�飬ת���븽��ԭ�ĳ������Ӽ���������
 * ԭ�����ӣ�https://blog.csdn.net/dgeek/article/details/76221746
 */
public class GuavaOptionalDemo {

    public static void main(String[] args) {
        Integer value1=null;
        Integer value2=10;
       /*����ָ�����õ�Optionalʵ����������Ϊnull�����ʧ�ܷ���absent()
         absent()��������ȱʧ��Optionalʵ��
        */
        Optional<Integer> a= Optional.fromNullable(value1);
        Optional<Integer> b=Optional.of(value2); //���ذ��������ķǿ�����Optionalʵ��
        System.out.println(sum(a,b));
    }

    private static Integer sum(Optional<Integer> a, Optional<Integer> b){
        //isPresent():���Optional������null�����ã����ô��ڣ�������true
        System.out.println("First param is present: "+a.isPresent());
        System.out.println("Second param is present: "+b.isPresent());
        Integer value1=a.or(0);  //����Optional������������,������ȱʧ,����ָ����ֵ
        Integer value2=b.get(); //������������ʵ��,���������,ͨ���ڵ��ø÷���ʱ�����isPresent()�ж��Ƿ�Ϊnull
        return value1+value2;
    }
}
