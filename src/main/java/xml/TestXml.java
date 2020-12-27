package xml;
/**
 * ��ϤSAX����xml������
 * @author Administrator
 *
 */

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class TestXml {
	
	public static void main(String[] args) throws Exception {
		//SAX����
		//1.��ȡ��������
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//2.�ӽ���������ȡ������
		SAXParser parser = factory.newSAXParser();
		//3.�����ĵ���ע�ᴦ����
		
		//4.��д������
		PHandler pHandler = new PHandler();
		//5.����
		parser.parse(Thread.currentThread().getContextClassLoader()
	          .getResourceAsStream("com/xjj/java/xml/web.xml"),pHandler);
		
	}
}

class PHandler extends DefaultHandler{
	
	@Override
	public void startDocument() throws SAXException {
	 System.out.println("�����ĵ���ʼ");
	}
	
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	   System.out.println(qName+"-->������ʼ");
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String content = new String(ch, start, length).trim(); 
		if(content.length()>0) {
			System.out.println("����Ϊ:"+content);
		}else {
			System.out.println("����Ϊ:"+"��");
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		 System.out.println(qName+"-->��������");
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("�����ĵ�����");
	}
	
}
