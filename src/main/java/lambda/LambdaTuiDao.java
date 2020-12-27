package lambda;
/**
 * lambda���Ƶ�
 * @author Administrator
 *
 */
public class LambdaTuiDao {
	
	//��̬�ڲ���
	static class Love2 implements ILove{
		@Override
		public void lambda() {
	      System.out.println("��ϲ��ѧϰlambda2");		
		}
		
	}
	
	public static void main(String[] args) {
		
		ILove love = new Love();
		love.lambda();
		
		love = new Love2();
		love.lambda();
		//�����ڲ���
		love = new ILove() {
			@Override
			public void lambda() {
				  System.out.println("��ϲ��ѧϰlambda3");		
			}
		};
		love.lambda();
		
		//lambda��
		love = ()-> {
		      System.out.println("��ϲ��ѧϰlambda4");		
		};
		love.lambda();
		
	}

}

interface ILove{
	void lambda();
}

//�ⲿ��
class Love implements ILove{
	@Override
	public void lambda() {
      System.out.println("��ϲ��ѧϰlambda");		
	}
	
}
