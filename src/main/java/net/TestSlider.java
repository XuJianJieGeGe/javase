package net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * ���������ԭ��+ģ�������
 * @author Administrator
 *
 */
public class TestSlider {
	
	public static void main(String[] args) throws Exception {
		//��ȡURL
		URL url = new URL("https://www.jd.com");
		//������Դ
		InputStream iStream = url.openStream();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(iStream, "UTF-8"));
		String msg = null;
		while (null!=(msg=bufferedReader.readLine())) {
		    System.out.println(msg);
		}
		bufferedReader.close();
		//����
		
		//����
		
	}

}
