package exception;

/**
 * ��д�쳣�����ʱ��һ��Ҫ���쳣��ΧС�ķ���ǰ�棬��Χ��ķ��ں���
 */
public class TestException {

    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try{
            System.out.println(x / y);
        }catch (ArithmeticException e){
            System.out.println("��������Ϊ0���쳣");
            e.printStackTrace();
        }catch (Exception e){
            //���ﲻ��ִ��
            System.out.println("���������쳣");
            e.printStackTrace();
        }finally {
            System.out.println("һ����ִ�еĲ���");
        }
        System.out.println("�쳣����ɹ�");
    }
}
