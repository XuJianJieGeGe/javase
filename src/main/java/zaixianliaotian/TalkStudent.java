package zaixianliaotian;
/**
 * ������߳� ʵ��˫���� ģ�����߽���
 * @author Administrator
 *
 */
public class TalkStudent {
	
	public static void main(String[] args) {
		new Thread(new TalkSend03(7777,"localhost",9999)).start();//����
		
		new Thread(new TalkServer03(8888)).start();//����
	}

}
