package synchornize;

/**
 * �̰߳�ȫ:�ڲ���ʱ��֤���ݵ���ȷ�ԣ�Ч�ʾ����ܸ�
 * synchornize
 * 1.ͬ������
 * 2.ͬ����
 * 
 * @author Administrator
 *
 */
public class SynTest01 implements Runnable{

	private int tickNums = 10;
	
	private boolean flag =true;
	
	@Override
	public void run() {
		while(flag) {
		 try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 test();
		}
	}
	
	//�̰߳�ȫ��ͬ����ע�⣬������this������󣬲��Ƿ���
	public synchronized void test() {
		 if(tickNums<=0) {
			  flag = false;
			  return;
		 }
		System.out.println(Thread.currentThread().getName()+"-->"+tickNums--);
	}
	
	public static void main(String[] args) {
		//һ����Դ
		SynTest01 web12306 = new SynTest01();
		//�������
		new Thread(web12306,"xu").start();
		new Thread(web12306,"huang").start();
		new Thread(web12306,"li").start();
	}
	
	

}
