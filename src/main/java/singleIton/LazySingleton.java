package singleIton;

/**
 *
 * ����ģʽ��������������ص�ʱ��û������ʵ�������ȵ�����getInstance��ʱ�򣬲����ʵ������
 * ����������붼û�е���getInstance����ôʵ�����Ĺ��̾ͱ�ʡ���ˡ�
 *
 */
public class LazySingleton {

    private LazySingleton() {
    }
    private static LazySingleton instance = null;
    public static LazySingleton getInstance() {
        if(instance==null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
