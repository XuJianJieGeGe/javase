package onlinechat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * ���Ͷˣ�ʹ����������װ
 * @author Administrator
 *
 */
public class TalkSend03 implements Runnable{

	private DatagramSocket client; 
	private BufferedReader reader;
	private String toIP;
	private int toPort;
	 
	public TalkSend03(int port,String toIP,int toPort){
		try {
			this.client = new DatagramSocket(port);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.reader = new BufferedReader(new InputStreamReader(System.in));
		this.toIP = toIP;
		this.toPort = toPort;
	}
	
	
	@Override
	public void run() {
		 while(true) {
			  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			  String data;
			try {
			 data = reader.readLine();
		     byte[] datas = data.getBytes();
		     //3.��װ��DatagramPacket���� ��Ҫָ��Ŀ�ĵ�
			  DatagramPacket packet = new DatagramPacket(datas,0,datas.length,
					         new InetSocketAddress(this.toIP,this.toPort));
			 //4.���Ͱ���send(DatagramPacker p)
			  client.send(packet);
			  
			  if(data.equals("bye")) {
				  break;
			  }
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		 }
		 // 5.�ͷ���Դ
		 client.close();
	}

}
