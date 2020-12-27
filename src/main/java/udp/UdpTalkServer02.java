package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * ���ն�  ʵ�ֶ�ν��� ע�⣺ͬһ��Э���¶˿ڲ����ظ�
 * 1.ʹ��DatagramSocket ָ���˿� �������ն�
 * 2.׼������ ��װ��DatagramPacker����
 * 3.����ʽ���ܰ���recevice(DatagramPacker p)
 * 4.��������
 *    byte[] getData()
 *           geyLength()
 * 5.�ͷ���Դ
 * @author Administrator
 *
 */
public class UdpTalkServer02 {
	
	public static void main(String[] args) throws Exception{
		 System.out.println("���շ������С�������");
//		 1.ʹ��DatagramSocket ָ���˿� �������ն�
		 DatagramSocket server = new DatagramSocket(9999);
//		 * 2.׼������ ��װ��DatagramPacker����
		 while(true) {
			 byte[] container = new byte[1024*60];
			 DatagramPacket packet = new DatagramPacket(container,0,container.length);
	//		 * 3.����ʽ���ܰ���recevice(DatagramPacker p)
			 server.receive(packet);
	//		 * 4.��������
	//		 *    byte[] getData()
	//		 *           geyLength()
			 byte[] datas = packet.getData();
			 int len = packet.getLength();
			 String data = new String(datas,0,len);
			 System.out.println(data);
			 if(data.equals("bye")) {
				 break;
			 }
		 }
//		 * 5.�ͷ���Դ
		 server.close();
	}

}
