package synchornize;

/**
 * �̲߳���ȫ�����ָ���
 * @author Administrator
 *
 */
public class Web12306 implements Runnable{

	private int tickNums = 99;
	
	@Override
	public void run() {
		while(true) {
		 if(tickNums<0) {
			  break;
		 }
	    try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"-->"+tickNums--);
		}
	}
	
	public static void main(String[] args) {
		//һ����Դ
		Web12306 web12306 = new Web12306();
		//�������
		new Thread(web12306,"xu").start();
		new Thread(web12306,"huang").start();
		new Thread(web12306,"li").start();
	}
	
	

}
