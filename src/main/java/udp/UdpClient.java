package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * ���Ͷ�
 * 1.ʹ��DatagramSocket ָ���˿� �������Ͷ�
 * 2.׼��������   һ��ת���ֽ�����
 * 3.��װ��DatagramPacker���� ��Ҫָ��Ŀ�ĵ�
 * 4.���Ͱ���send(DatagramPacker p)
 * 5.�ͷ���Դ
 */
public class UdpClient {


	public static void main(String[] args) throws Exception {
		 System.out.println("���Ͷ������С�����");
//		 * 1.ʹ��DatagramSocket ָ���˿� �������Ͷ�
		 DatagramSocket client = new DatagramSocket(8888);
//		 * 2.׼��������   һ��ת���ֽ�����
		  String data = "����";
		  byte[] datas = data.getBytes();
//		 * 3.��װ��DatagramPacket���� ��Ҫָ��Ŀ�ĵ�
		  DatagramPacket packet = new DatagramPacket(datas,0,datas.length,
				         new InetSocketAddress("localhost",9999));
//		 * 4.���Ͱ���send(DatagramPacker p)
		  client.send(packet);
//		 * 5.�ͷ���Դ
		  client.close();
	}
}
