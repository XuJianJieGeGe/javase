package lambda;
/**
 * lambda���Ƶ�+����+����ֵ
 * @author Administrator
 *
 */
public class LambdaTuiDao2 {
	

	public static void main(String[] args) {
		//��1��ֻ��ע����/����
		IInterest interest = (int a,int b)-> {
	       System.out.println("lambda-->:"+(a+b));	
	       return a+b;
		};
		interest.lambda(1, 1);
		
		//��2��ʡ������
		interest = (a,b)-> {
	       System.out.println("lambda-->:"+(a+b));	
	       return a+b;
		};
		interest.lambda(2, 3);
		
		//��3����������һ�д��룬ֱ��д����ֵ
		interest = (a,b)-> a+b;
	
	}

}

interface IInterest{
	int lambda(int a, int b);
}

//�ⲿ��
class Interest implements IInterest{
	@Override
	public int lambda(int a,int b) {
       System.out.println("lambda-->:"+(a+b));	
       return a+b;
	}
	
}
