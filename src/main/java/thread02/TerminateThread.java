package thread02;

/**
 * ��ֹ�ֳɵ����ַ�ʽ
 * 1.�߳��������У�ִ�����
 * 2.�ⲿ���棬�����ʶ
 * @author Administrator
 *
 */
public class TerminateThread implements Runnable{
	
	//�����ʶ������߳����Ƿ������
	private boolean flag = true;
	
	private String name;
	
	public TerminateThread(String name) {
		super();
		this.name = name;
	}


	@Override
	public void run() {
		//������ʶ��true-->���У�false-->ֹͣ
		int i= 0;
		while(flag) {
			System.out.println(name+":"+i++);
		}
	}
	
	//�����ṩ�������ı��ʶ
	public void terninate() {
		this.flag = false;
	}
	

	public static void main(String[] args) {
		
		TerminateThread terminateThread = new TerminateThread("xu");
		new Thread(terminateThread).start();
		
		for(int i=0;i<=99;i++) {
			System.out.println("main-->"+i);
			if(i==88) {
				terminateThread.terninate();//�̵߳���ֹ
				System.out.println("terminateThread game over ");
			}
			
		}
	}

}
