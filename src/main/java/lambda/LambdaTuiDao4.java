package lambda;
/**
 * lambda���Ƶ������߳�
 * @author Administrator
 *
 */
public class LambdaTuiDao4 {
	

	public static void main(String[] args) {
		new Thread(()->{
		for(int i=0;i<20;i++) {
			  System.out.println("һ�����衣����");
			}
		}) .start();
		
		for(int i=0;i<20;i++) {
			  System.out.println("lambda��ѽ������");
			}
	}

}
