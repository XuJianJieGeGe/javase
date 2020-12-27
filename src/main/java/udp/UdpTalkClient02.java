package udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * ���Ͷ� ʵ�ֶ�ν���
 * 1.ʹ��DatagramSocket ָ���˿� �������Ͷ�
 * 2.׼��������   һ��ת���ֽ�����
 * 3.��װ��DatagramPacker���� ��Ҫָ��Ŀ�ĵ�
 * 4.���Ͱ���send(DatagramPacker p)
 * 5.�ͷ���Դ
 */
public class UdpTalkClient02 {


	public static void main(String[] args) throws Exception {
		 System.out.println("���Ͷ������С�����");
//		 * 1.ʹ��DatagramSocket ָ���˿� �������Ͷ�
		 DatagramSocket client = new DatagramSocket(8888);
//		 * 2.׼��������   һ��ת���ֽ�����
		 while(true) {
			  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			  String data = reader.readLine();
			  byte[] datas = data.getBytes();
//			 * 3.��װ��DatagramPacket���� ��Ҫָ��Ŀ�ĵ�
			  DatagramPacket packet = new DatagramPacket(datas,0,datas.length,
					         new InetSocketAddress("localhost",9999));
//			 * 4.���Ͱ���send(DatagramPacker p)
			  client.send(packet);
			  
			  if(data.equals("bye")) {
				  break;
			  }
		 }
//		 * 5.�ͷ���Դ
		 client.close();
	}
}
