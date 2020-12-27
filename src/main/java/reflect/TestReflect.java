package reflect;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflect {
	
	/**
	 * ��λ�ȡClass��ʵ��
	 * @throws ClassNotFoundException 
	*/
	@Test
	public void test3() throws ClassNotFoundException {
		//1.��������ʱ��.class����
		Class class1 = Person.class;
		System.out.println(class1);
		
		Class class2 = String.class;
		System.out.println(class1);
		
		//2.ͨ������ʱ��Ķ����ȡ
		Person person = new Person();
		Class class3 = person.getClass();
		System.out.println(class3.getName());
		
		//3.ͨ��Class�ľ�̬������ȡ,ͨ���˷�ʽ��ᶯ̬�ԣ�����
		String name = "com.xjj.java.reflect.Person";
		Class class4 = Class.forName(name);
		System.out.println(class4.getName());
		
		//4.ͨ����ļ���������
		ClassLoader classLoader = this.getClass().getClassLoader();
		Class<?> loadClass = classLoader.loadClass(name);
		System.out.println(loadClass.getName());
	}
	
	
	
	
	/**
	 * java.lang.Class�����з����Դͷ
	 *  
	  *  ����Class��Ļ�����ִ�����²���:
	  *  1:���ȴ�������ʱ��Ķ���
	  *  2.���Ի�ȡ��Ӧ����ʱ��Ľṹ�����ԡ����������������ڲ��ࡢ���ࡢ�쳣�ࡢע�⡣��������
	  *  3.���ö�Ӧ������ʱ���ָ���ṹ�����ԡ���������������
	  *  4.��������ã���̬����
	 * 
	 */
	@Test
	public void test2() {
		Person person = new Person();
		Class class1 = person.getClass();
		System.out.println(class1);
	}
	
	
	
    @Test
	public void test() throws Exception {
    	
    	Class clazz = Person.class;
    	
    	//1.����clazz��Ӧ������ʱ��Person�Ķ���
    	Person person = (Person)clazz.newInstance();
    	System.out.println(person);
    	
    	//2.ͨ�������ȡ����ʱ�������,ע��private���ԻᱨNoSuchFieldException;
    	Field f1 = clazz.getField("name");
    	f1.set(person,"liudehua");
    	System.out.println(person);
    	
    	//2.1����private��������setAccessibleΪtrue
    	Field f2 = clazz.getDeclaredField("age");//getDeclaredField
    	f2.setAccessible(true);//���òſ��Է���
    	f2.set(person,20);
    	System.out.println(person);
    	
    	//2.2���޲�������
    	Method method = clazz.getMethod("show");
    	method.invoke(person);
    	
    	//2.3���޲�������
    	Method method2 = clazz.getMethod("display",String.class);
    	method2.invoke(person,"CHN");
	}

}
