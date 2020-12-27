package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * IP��λһ���ڵ�������·�ɡ�ͨѶ�豸��
 * InetAddress:
 * 1��getLocalHost������
 * 2��getByname��������DNS|IP��ַ--������IP
 * 
 * ������Ա������
 * 1��getHostAddress���ص�ַ
 * 2��getHostName���ؼ������
 * 
 * 
 * @author Administrator
 *
 */
public class TestIP {
	
	public static void main(String[] args) throws UnknownHostException {
		//ʹ��getLocalHost��������InetAddress����
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address.getHostAddress());//����IP��ַ,192.168.3.20
		System.out.println(address.getHostName());//�����������TAPB7VWUC3X0AKJ
		
		//���������õ�InetAddress����
		address = InetAddress.getByName("www.163.com");
		System.out.println(address.getHostAddress());//���ط�������ip:120.198.197.253
		System.out.println(address.getHostName());//���www.163.com
	}

}
