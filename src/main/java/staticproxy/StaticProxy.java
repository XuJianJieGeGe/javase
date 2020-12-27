package staticproxy;

/**
 * ��̬����
 * �ӿڣ�
 *   ��ʵ��ɫ
 *   �����ɫ
 * 
 * @author Administrator
 *
 */
public class StaticProxy {
	public static void main(String[] args) {
		//�Ա�new Thread(�������).start()
		new MerryCompany(new You()).happyMerry();
		
	}

}

interface Merry{
	void happyMerry();
}

class You implements Merry{

	@Override
	public void happyMerry() {
		System.out.println("����϶�����");
	}
	
}


class MerryCompany implements Merry{

	//��ʵ��ɫ
	private Merry target;
	
	public MerryCompany(Merry target) {
		this.target = target;
	}
	

	@Override
	public void happyMerry() {
		ready();
		this.target.happyMerry();
		after();
	}

	private void after() {
		System.out.println("����������");
	}

	private void ready() {
		System.out.println("׼��������");
	}
	
}


