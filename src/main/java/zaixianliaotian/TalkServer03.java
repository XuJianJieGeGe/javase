package zaixianliaotian;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * ���ܶˣ�ʹ����������װ
 * @author Administrator
 *
 */
public class TalkServer03 implements Runnable{
	
	private DatagramSocket server; 
	public TalkServer03(int port) {
		try {
			this.server = new DatagramSocket(port);
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
	}

	@Override
	public void run() {
		 while(true) {
			 byte[] container = new byte[1024*60];
			 DatagramPacket packet = new DatagramPacket(container,0,container.length);
			 try {
				//3.����ʽ���ܰ���recevice(DatagramPacker p)
				 server.receive(packet);
				//4.��������
				//byte[] getData()
				//geyLength()
				 byte[] datas = packet.getData();
				 int len = packet.getLength();
				 String data = new String(datas,0,len);
				 System.out.println(data);
				 if(data.equals("bye")) {
					 break;
				 }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 }
		 //5.�ͷ���Դ
		 server.close();		
	}

}
