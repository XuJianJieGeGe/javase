package lambda;
/**
 * ����ʽ�ı��
 * @author Administrator
 *
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestLambda {
	
	//������ι�����
	public static void main(String[] args) {
		//1.
		List<String> strList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		strList.stream()
		       .filter(s->s.startsWith("a"))
		       .map(String::toUpperCase)
		       .sorted()
		       .forEach(System.out::println);
		
		System.out.println("2.===========");
		
		//2.�ڼ����ϵ���stream()�����᷵��һ����ͨ�� Stream ����
		//����, ����ɲ��ؿ���ش���һ�����ϣ���ͨ����������ȡ Stream ��
		Stream.of("a1", "a2", "a3")
	    .findFirst()
	    .ifPresent(System.out::println); 
		
		System.out.println("3.===========");
		 //3.IntStreams.range()���������Ա�����ȡ������� for ѭ��, ������ʾ��
	     //�൱�� for (int i = 1; i < 4; i++) {}
		 IntStream.range(1,4).
		   forEach(System.out::println);
		 
		 System.out.println("4.===========");
		 //4.ԭʼ������ʹ������еĺ���ʽ�ӿڣ�����IntFunction����Function��IntPredicate����Predicate��
         //ԭʼ������֧�ֶ�����ն˾ۺϲ�����sum()�Լ�average()��������ʾ��
		 Arrays.stream(new int[] {1, 2, 3})
		    .map(n -> 2 * n + 1) // ����ֵ�е�ÿ������ִ�� 2*n + 1 ����
		    .average() // ��ƽ��ֵ
		    .ifPresent(System.out::println);  // ���ֵ��Ϊ�գ������
		 
		  System.out.println("5.===========");
		 //5.���ǣ�ż������Ҳ������������Ҫ�����������ת��Ϊԭʼ�����������ʱ���м���� mapToInt()��
		 //mapToLong() �Լ�mapToDouble�������ó��ˣ�
		 Stream.of("a1", "a2", "a3")
		    .map(s -> s.substring(1)) // ��ÿ���ַ���Ԫ�ش��±�1λ�ÿ�ʼ��ȡ
		    .mapToInt(Integer::parseInt) // ת�� int ��������������
		    .max() // ȡ���ֵ
		    .ifPresent(System.out::println);  // ��Ϊ�������
		 
		 System.out.println("6.��װ���ɶ�����===========");
		 //6.���˵������Ҫ��ԭʼ������װ���ɶ�������������ʹ�� mapToObj()���ﵽĿ�ģ�
		 IntStream.range(1,4)
		          .mapToObj(i->"a"+i)
		          .forEach(System.out::println);
		 
		 System.out.println("7.��˫����������ת���� int ������===========");
		 //7.������һ�����ʾ�������ǽ�˫����������ת���� int ��������Ȼ���ٽ���װ���ɶ�������
		 Stream.of(1.0,2.0,3.0)
		       .mapToInt(Double::intValue)
		       .mapToObj(i->"a"+i)
		       .forEach(System.out::println);
	         
	}
	

}
