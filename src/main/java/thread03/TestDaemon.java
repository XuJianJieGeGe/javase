package thread03;
/**
 * �ػ��̣߳���Ϊ�û��̷߳���ģ�jvmֹͣ�ǲ���Ҫ�ػ��߳�ִ�����
 * Ĭ�϶����û��̣߳�jvm�ȵ��û��߳�ֹͣ�Ż�ֹͣ
 * @author Administrator
 *
 */
public class TestDaemon {
	
     public static void main(String[] args) {
		 God god = new God();
		 You you = new You();
//		 new Thread(god).start();
//		 new Thread(you).start();
		 
		Thread thread = new Thread(god);
		thread.setDaemon(true);//����Ϊ�ػ��߳�
		thread.start();
		
		new Thread(you).start();
	 }

}

class You extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=365*100;i++) {
			System.out.println("happy life");
		}
		System.out.println("oooo....");
	}
	
}

class God extends Thread{

	@Override
	public void run() {
		for(;true;) {
			System.out.println("bless you");
		}
	}
}
