package thread02;

/**
 * join�ϲ��̣߳�����߳�
 * @author Administrator
 *
 */
public class BlockJoin {
      public static void main(String[] args) throws InterruptedException {
    	  Thread thread = new Thread(()->{
  			for(int i=0;i<100;i++) {
  				System.out.println("lambda"+i);
  			}
  		});
    	thread.start();
  		
  		for(int i=0;i<100;i++) {
  			System.out.println("main:"+i);
  			if(i==20) {
  				thread.join();//main�߳�����
  			}
  		}
	}
}
