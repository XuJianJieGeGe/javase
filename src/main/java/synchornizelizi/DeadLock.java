package synchornizelizi;
/**
 * �����������ͬ����������໥���ͷ���Դ
 * 
 * �Ӷ��໥�ȴ���һ�㷢����ͬ���г��ж���������
 * 
 * @author Administrator
 *
 */
public class DeadLock {
  public static void main(String[] args) {
	MarkUp markUp1 = new MarkUp(1, "���»�");
	MarkUp markUp2 = new MarkUp(0, "��ѧ��");
	markUp1.start();
	markUp2.start();
}
}

//�ں�
class Lipstick{
	
}

//����
class Mirror{
	
}

//��ױ
class MarkUp extends Thread{
	
	static Lipstick lipstick = new Lipstick();
	static Mirror mirror = new Mirror();
	
	//ѡ��
	int choice;
	//����
	String girl;	
	public MarkUp(int choice, String girl) {
		super();
		this.choice = choice;
		this.girl = girl;
	}


	@Override
	public void run() {
		//��ױ
		markUp();
	}
	
	//�໥���жԷ��Ķ�����--����������
	public void markUp(){
		if(choice==0) {
			synchronized (lipstick) {//��ÿں����
				System.out.println(this.girl+"��ÿں�");
			}
			//1����þ��ӵ���
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (mirror) {
				System.out.println(this.girl+"�վ���");
			}
		}else {
			synchronized (mirror) {//��þ��ӵ���
				System.out.println(this.girl+"�վ���");
			}
			//2����ÿں����
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (lipstick) {
				System.out.println(this.girl+"�վ���");
			}
			
		}
	}


	public static void main(String[] args) {
		System.out.println("LOCK_STOCK_".concat("123"));
	}
}

