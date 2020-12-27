package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class WangMeiLiProxy implements InvocationHandler{
	
	private Girl gilr;
	
	public WangMeiLiProxy(Girl girl) {
		this.gilr = girl;
	}

	
	/**
	 * Object invoke(Object proxy, Method method, Object[] args) throws Throwable
       proxy:����ָ��������������Ǹ���ʵ����
       method:����ָ������������Ҫ������ʵ�����ĳ��������Method����
       args:����ָ�����ǵ�����ʵ����ĳ������ʱ���ܵĲ���
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		before();
		//���÷���
		Object ret = method.invoke(gilr, args);
		after();
		return ret;
	}

	private void after() {
		System.out.println("�������ĸ�ĸ˵������û�ж��ֶ���");
	}

	private void before() {
		System.out.println("�������ĸ�ĸ˵���ҵ��ȵ������С���ӵı���");
	}
	
	/***
	 * 
	 *  public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) throws IllegalArgumentException
		loader:����һ��ClassLoader���󣬶��������ĸ�ClassLoader�����������ɵĴ��������м���
		interfaces:����һ��Interface��������飬��ʾ�����ҽ�Ҫ������Ҫ����Ķ����ṩһ��ʲô�ӿڣ�������ṩ��һ��ӿڸ�������ô���������������ʵ���˸ýӿ�(��̬)�������Ҿ��ܵ�������ӿ��еķ�����
		h:����һ��InvocationHandler���󣬱�ʾ���ǵ��������̬��������ڵ��÷�����ʱ�򣬻��������һ��InvocationHandler������
	 * @return
	 */
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(gilr.getClass().getClassLoader(),gilr.getClass().getInterfaces(), this);
	}

}
