package xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.ArrayList;
import java.util.List;

/**
 * ��ϤSAX����xml������,���ҷ�װ����
 *
 * @author Administrator
 */

public class TestXml2 {
	
	public static void main(String[] args) throws Exception {
		//SAX����
		//1.��ȡ��������
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//2.�ӽ���������ȡ������
		SAXParser parser = factory.newSAXParser();
		//3.�����ĵ���ע�ᴦ����
		
		//4.��д������
		PersonHandler pHandler = new PersonHandler();
		//5.����
		parser.parse(Thread.currentThread().getContextClassLoader()
	          .getResourceAsStream("com/xjj/java/xml/web.xml"),pHandler);
		
		//��ȡ����
		List<Person> person = pHandler.getPersons();
		for(Person p:person) {
			System.out.println(p.getName()+":"+p.getAge());
		}
	}
}

class PersonHandler extends DefaultHandler{
	private List<Person> persons;

	private Person person;
	private String tag;//�洢�����ı�ǩ
	@Override
	public void startDocument() throws SAXException {
		persons = new ArrayList<>();
	}
	
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	   if(null!=qName) {
		   tag = qName;//�洢��ǩ
	   }
	   if(qName.equals("person")) {
		   person = new Person();
	   }
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String content = new String(ch, start, length).trim(); 
		if(null!=tag) {
			if(tag.equals("name")) {
				person.setName(content);
			}else if(tag.equals("age")) {
				if(content.length()>0) {
					person.setAge(Integer.valueOf(content));
				}
			}
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		 System.out.println(qName+"-->��������");
		 if(null!=qName) {
			 if(qName.equals("person")) {
				   persons.add(person);
			   }
		 }
		 tag = null;//��tag�ÿգ���ֹ�´ν�����ֵΪ��
	}
	
	@Override
	public void endDocument() throws SAXException {
		
	}
	
	public List<Person> getPersons() {
		return persons;
	}
	
}
