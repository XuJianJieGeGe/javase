package thread;
/**
 * �����̵߳ķ�ʽ����
 * 1.ʵ��runnable����дrun����
 * 2.����������ʵ�������+Thread����+����start����
 * @author Administrator
 *����̳еľ����ԣ�����ʹ�ýӿ�
 *������Դ�Ĺ���
 */
public class TestRunnable implements Runnable{
	
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
//		//����ʵ�������
//		TestRunnable testRunnable = new TestRunnable();
//		//�����������
//		Thread t = new Thread(testRunnable);
//		//����
//		t.start();//����֤����ִ�У���cpu����
		
		//���һ������ֻʹ��һ�Σ���ô����ʹ������
		new Thread(new TestRunnable()).start();
		
		for(int i=0;i<20;i++) {
			  System.out.println("һ��coding������");
		}
	}

}
