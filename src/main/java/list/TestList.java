package list;

import java.util.ArrayList;
import java.util.List;

/**
 * ����list����֮��Ĳ���
 * @author Administrator
 *
 */
public class TestList {
	
	public static void main(String[] args) {
		
		test02();
	}
	
	//����list�ĳ��õĲ���
	public static void test01() {
		List<String> strList = new ArrayList<>();
		strList.add("aa");
		strList.add("bb");
		
		List<String> list = new ArrayList<>();
		list.add("bb");
		list.add("cc");
		list.add("dd");
		
		//1.������list��Ԫ�طŽ�strList
		//strList.addAll(list);
		//2.strListȥ���ڼ���list�е�Ԫ��
		//strList.removeAll(list);//aa
		//3.ȡ����
		//strList.retainAll(list);//bb
		//4.false
		System.out.println(strList.containsAll(list));
		//5.��ռ���
		strList.clear();
		System.out.println(strList.size());
		System.out.println(strList.isEmpty());
		
		for(String str:strList) {
			System.out.println(str);
		}
	}
	
	//����ArrayList�ĳ��õķ���,�ײ��ʵ�������飬Ĭ��������10������������ʱ,�½�һ�����飬
	//��ԭ�������鿽����ȥ��10+10/2
	public static void test02() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		//��ĳ��λ�����Ԫ��
		list.add(2, "D");
		
		//�޸�ĳ��λ�õ�Ԫ��
		//list.set(3, "�����");
		
		
		list.add("B");
		list.add("C");
		
		System.out.println(list);
		
		//����list������
		System.out.println(list.indexOf("B"));
		System.out.println(list.lastIndexOf("B"));
	}

}
