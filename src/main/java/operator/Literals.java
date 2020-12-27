package operator;

/**
 * @description: ���Խ��Ƶ�����
 * @author: xujianjie
 * @create: 2020-07-05 14:57
 **/
public class Literals {

    public static void main(String[] args) {
        int i1 = 0x2f; // 16���� (Сд)
        System.out.println(i1);
        //101111(������-10����)=1*2^5+0*2^4+1*2^3+1*2^2+1*2^1+1*2^0=64+32+16+1=113(ʮ����)
        System.out.println(
                "i1: " + Integer.toBinaryString(i1));
        int i2 = 0X2F; // 16���� (��д)
        System.out.println(
                "i2: " + Integer.toBinaryString(i2));
        int i3 = 0177; // 8���� (ǰ��0)
        System.out.println(
                "i3: " + Integer.toBinaryString(i3));
        char c = 0xffff; // ��� char ��16����ֵ
        System.out.println(
                "c: " + Integer.toBinaryString(c));
        byte b = 0x7f; // ��� byte ��16����ֵ  10101111;
        System.out.println(
                "b: " + Integer.toBinaryString(b));
        short s = 0x7fff; // ��� short ��16����ֵ
        System.out.println(
                "s: " + Integer.toBinaryString(s));
        long n1 = 200L; // long �ͺ�׺
        long n2 = 200l; // long �ͺ�׺ (��������ֵ1����)
        long n3 = 200;

        // Java 7 ����������ֵ����:
        byte blb = (byte)0b00110101;
        System.out.println(
                "blb: " + Integer.toBinaryString(blb));
        short bls = (short)0B0010111110101111;
        System.out.println(
                "bls: " + Integer.toBinaryString(bls));
        int bli = 0b00101111101011111010111110101111;
        System.out.println(
                "bli: " + Integer.toBinaryString(bli));
        long bll = 0b00101111101011111010111110101111;
        System.out.println(
                "bll: " + Long.toBinaryString(bll));
        float f1 = 1;
        float f2 = 1F; // float �ͺ�׺
        float f3 = 1f; // float �ͺ�׺
        double d1 = 1d; // double �ͺ�׺
        double d2 = 1D; // double �ͺ�׺
        // (long �͵�����ֵͬ��������ʮ�����ƺ�8���� )

        int i = 012;//(8����-10����)12 = 1*8^1+2*8^0=10
        System.out.println(i);
    }

}
