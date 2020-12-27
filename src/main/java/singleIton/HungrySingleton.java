package singleIton;

/**
 * 1.����ģʽ��
 * ����ģʽ�Ķ�������ֻҪ�౻���أ��ͻ�����ʵ����Singletonʵ��������������ô������ֻҪ�ϸ�ʹ��getInstance���Ͳ����������ʵ����
 */
public  class HungrySingleton {
    private HungrySingleton() {
    }

    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }
}
