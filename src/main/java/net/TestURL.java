package net;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * ͳһ��Դ��λ��
 * 1.Э��
 * 2.����/�����
 * 3.�˿ڡ�Ĭ��80
 * 4.������Դ
 * http://www.baidu.com:80/index.html
 * @author Administrator
 *
 */
public class TestURL {
	
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.baidu.com:80/index.html?username=123#a");
		//��ȡ�ĸ�ֵ
		System.out.println("Э��:"+url.getProtocol());
		System.out.println("����|IP:"+url.getHost());
		System.out.println("�˿�"+url.getPort());
		System.out.println("������Դ:"+url.getFile());
		System.out.println("������Դ:"+url.getPath());
		
		//����
		System.out.println("������"+url.getQuery());
		//ê��
		System.out.println("ê��:"+url.getRef());
		
	}

}
