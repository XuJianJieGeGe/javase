package thread;
/**
 * �����̵߳ķ�ʽһ��
 * 1.�̳�thread����дrun����
 * 2.����������������󣬵���start����
 * @author Administrator
 *
 */
public class TestThread extends Thread{

	/**
	 * �̵߳���ڵ�
	 */
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
		  System.out.println("һ�����衣����");
		}
	}
	
	public static void main(String[] args) {

		TestThread thread = new TestThread();
		//����
		thread.start();//����֤����ִ�У���cpu����
		//��ͨ�����ĵ���
		//thread.run();
		for(int i=0;i<20;i++) {
			  System.out.println("һ��coding������");
		}
	}

}
