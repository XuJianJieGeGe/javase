package net;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * ��������ʱ�Ľ������
 *+ģ�������
 * @author Administrator
 *
 */
public class TestSlider2 {
	
	public static void main(String[] args) throws Exception {
		//��ȡURL
		URL url = new URL("https://www.dianping.com");
		
		HttpsURLConnection  connection = (HttpsURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36");
		//������Դ
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
		String msg = null;
		while (null!=(msg=bufferedReader.readLine())) {
		    System.out.println(msg);
		}
		bufferedReader.close();
		//����
		
		//����
		
	}

}
