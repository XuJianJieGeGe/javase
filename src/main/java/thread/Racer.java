package thread;
/**
 * ��������
 * @author Administrator
 *
 */
public class Racer implements Runnable{

	private static String winner;//ʤ����
	
	@Override
	public void run() {
      for(int step=1;step<=100;step++) {
    	  
    	  //ģ����Ϣ
    	  if(Thread.currentThread().getName().equals("rabbit")&&step%100==0) {
    		  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	  }
    	  System.out.println(Thread.currentThread().getName()+"-->"+step);
          boolean flag = gameOver(step);
          if(flag) {
        	  break;
          }
      }
	}
	
	private boolean gameOver(int steps) {
		if(winner!=null) {//����ʤ����
			return true;
		}else {
			if(steps==100) {
				winner= Thread.currentThread().getName();
			    System.out.println("winner==>"+winner);
			    return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Racer racer = new Racer();
		new Thread(racer,"tortoise").start();
		new Thread(racer,"rabbit").start();
	}

}
