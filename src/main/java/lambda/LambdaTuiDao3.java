package lambda;
/**
 * lambda���Ƶ�+����
 * @author Administrator
 *
 */
public class LambdaTuiDao3 {
	

	public static void main(String[] args) {
		//��1��ֻ��ע����/����
		ILike like = (int a)-> {
		       System.out.println("lambda-->"+a);		
		};
		like.lambda(100);
		
		//��2,ȥ������
		like = (a)-> {
		       System.out.println("lambda-->"+a);		
		};
		like.lambda(200);
		
		//��3,1����������ʡ������
		like = a-> {
		       System.out.println("lambda-->"+a);		
		};
		like.lambda(300);
		
		//��4,������һ�仰�Ļ�������ʡ�Ի����ţ�
		like = a->System.out.println("lambda-->"+a);		
		like.lambda(400);
	}

}

interface ILike{
	void lambda(int a);
}

//�ⲿ��
class Like implements ILike{
	@Override
	public void lambda(int a) {
       System.out.println("lambda-->"+a);		
	}
	
}
