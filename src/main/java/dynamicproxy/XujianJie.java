package dynamicproxy;

public class XujianJie {
	
	public static void main(String[] args) {
		//�����и�������
		Girl girl = new WangMeiLi();
		//���и��Ӵ�ļ�ͥ����Ҫ����Լ������������ͬ��
		WangMeiLiProxy family = new WangMeiLiProxy(girl);
		//��һ��Լ�ᣬ�����������裬���������������ͬ��
		Girl mother = (Girl) family.getProxyInstance();
		//ͨ�����������������ܺ�������Լ��
		mother.date();
		//�ָ���
		System.out.println("--------");
		mother.watchMovie();
		
	}

}
