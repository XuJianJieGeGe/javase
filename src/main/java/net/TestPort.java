package net;

import java.net.InetSocketAddress;

/**
 * �˿ڣ�
 * 1.���������
 * 2��2���ֽ�0-65535 Udo Tcp
 * 3��ͬһ��Э��˿ڲ��ܳ�ͻ
 * 4������Ķ˿�Խ��Խ��
 * InetSocketAddress
 * new InetSocketAddress(��ַ|����,�˿�)
 * @author Administrator
 *
 */
public class TestPort {
	
	public static void main(String[] args) {
		//�����˿�
		InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1",8080);
		InetSocketAddress inetSocketAddress2 = new InetSocketAddress("localhost",9000);
		System.out.println(inetSocketAddress.getHostName());
		System.out.println(inetSocketAddress2.getAddress());
		System.out.println(inetSocketAddress2.getPort());
	}

}
