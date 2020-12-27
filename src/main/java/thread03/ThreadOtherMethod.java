package thread03;
/**
 * ��������
 * @author Administrator
 *
 */
public class ThreadOtherMethod {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isAlive());
	   
		//�������ƣ���ʵ��ɫ+�����ɫ
		MyInfo myInfo = new MyInfo("ս����");
	    Thread thread = new Thread(myInfo);
	    thread.setName("����");//�����̵߳�����
	
	    thread.start();
	    System.out.println(thread.isAlive());
	    
	}

}

class MyInfo implements Runnable{

	private String name;
	
	public MyInfo(String name) {
		super();
		this.name = name;
	}


	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"-->"+name);
	}
	
}
