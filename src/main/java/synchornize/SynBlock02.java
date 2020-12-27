package synchornize;
/**
 * �̰߳�ȫ,ͬ����
 * @author Administrator
 *
 */
public class SynBlock02 {
	
	public static void main(String[] args) {
		
		//�˻�
		SynAccount account = new SynAccount(1000, "���");
	    SynDrawing you = new SynDrawing(account, 80, "�ɱ�����");
	    SynDrawing wife = new SynDrawing(account, 90, "���ĵ���");
	    you.start();
	    wife.start();
	}

}

class SynAccount {
	int money;//���
	String name;//����
	public SynAccount(int money, String name) {
		super();
		this.money = money;
		this.name = name;
	}
}

class SynDrawing extends Thread{
	
	SynAccount account;//ȡǮ���˻�
	int drawingMoney;//ȡ��Ǯ��
	int packetTotal;//Ǯ��������
	
	public SynDrawing(SynAccount account, int drawingMoney, String name) {
		super(name);
		this.account = account;
		this.drawingMoney = drawingMoney;
	}

	@Override
	public void run() {
		test();
	}
	
	public void test() {
		//ע����߳�ʱ����仰����Ҫ ���������
		if(account.money<=0) {
			return;
		}
		synchronized (account) {
			if(account.money-drawingMoney<0) {
				return;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			account.money-=drawingMoney;
			packetTotal+=drawingMoney;
			System.out.println(this.getName()+"-->�˻����"+account.money);
			System.out.println(this.getName()+"-->�ڴ���Ǯ"+packetTotal);
		}
	}
}
