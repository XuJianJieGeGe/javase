package threadlocal;

/**
 * ÿ���߳�����Ĵ洢���أ��ֲ�����
 * get/set/initalValue
 * @author Administrator
 *
 */
public class TestThreadLocal01 {
	
	//private static ThreadLocal<Integer> threadLocal= new ThreadLocal<>();

	//����һ:���ĳ�ʼֵ
	private static ThreadLocal<Integer> threadLocal1= new ThreadLocal<Integer>() {
		protected Integer initialValue() {
			return 200;
		}; 
	};

	//������:jdk8
	private static ThreadLocal<Integer> threadLocal2= ThreadLocal.withInitial(()->300);
	
	public static void main(String[] args) {
		//��ȡֵ
		System.out.println(Thread.currentThread().getName()+"-->"+threadLocal1.get());
		//����ֵ
		threadLocal1.set(90);
		System.out.println(Thread.currentThread().getName()+"-->"+threadLocal1.get());
	
		//ÿ���̶߳��ж����Ŀռ䣬����Ӱ��
		new Thread(new MyRun()).start();
		new Thread(new MyRun()).start();
	}
	
	public static class MyRun implements Runnable{
		@Override
		public void run() {
			threadLocal1.set((int)(Math.random()*99));
			System.out.println(Thread.currentThread().getName()+"-->"+threadLocal1.get());
		}
	}
	
}

