package thread02;

/**
 * ����Yield�����̣߳���ͣ�̣߳������������Ǿ���
 * @author Administrator
 *
 */
public class YieldThread2 {
	
	public static void main(String[] args) {
		MyYield myYield = new MyYield();
		new Thread(myYield,"a").start();
		new Thread(myYield,"b").start();
		
	}

}

class MyYield implements Runnable{

	@Override
	public void run() {
    System.out.println(Thread.currentThread().getName()+"-->start");
    Thread.yield();//����,������ÿ�ζ��ɹ�
    System.out.println(Thread.currentThread().getName()+"-->end");		
	}
	
}
