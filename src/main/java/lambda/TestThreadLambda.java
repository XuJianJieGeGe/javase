package lambda;
/**
 * �����̵߳�lambda
 * @author Administrator
 *
 */
public class TestThreadLambda {
	
	//��̬�ڲ���
	static class Test implements Runnable{
		@Override
		public void run() {
		   for(int i=0;i<20;i++) {
			  System.out.println("һ�����衣����");
			}
		}
		
	}
	
	public static void main(String[] args) {
		//new Thread(new Test()).start();
		
		//�ֲ��ڲ���
		class Test2 implements Runnable{
			@Override
			public void run() {
			   for(int i=0;i<20;i++) {
				  System.out.println("һ�����衣����");
				}
			}
		}
		new Thread(new Test2()).start();
		
		//�����ڲ��࣬��������ӿڻ��߸���
		new Thread(new Runnable() {
			@Override
			public void run() {
				 for(int i=0;i<20;i++) {
					  System.out.println("һ�����衣����");
					}
			}
		}).start();
		
		
		//jdk8,��lambda,ֻ��Ҫ��ע�����壬jdk���Զ��Ƶ���ע��ӿڱ�����һ����������
		new Thread(()-> {
				 for(int i=0;i<20;i++) {
					  System.out.println("һ�����衣����");
					}
		}).start();
		
		
    }

}
