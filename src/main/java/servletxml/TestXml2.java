package servletxml;

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
		WebHandler pHandler = new WebHandler();
		//5.����
		parser.parse(Thread.currentThread().getContextClassLoader()
	          .getResourceAsStream("com/xjj/java/servletxml/web.xml"),pHandler);
		
		//��ȡ����
		List<Entity> entities = pHandler.getEntities();
		for(Entity e:entities) {
			System.out.println(e.getName()+":"+e.getClz());
		}
		List<Mapping> mappings = pHandler.getMappings();
		System.out.println(entities.size());
		System.out.println(mappings.size());
	}
}

class WebHandler extends DefaultHandler{
	private List<Entity> entities;
	private List<Mapping> mappings;

	private Entity entity;
	private Mapping mapping;
	private String tag;//�洢�����ı�ǩ
	private boolean isMapping = false;
	
	@Override
	public void startDocument() throws SAXException {
		entities = new ArrayList<>();
		mappings = new ArrayList<>();
	}
	
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	   if(null!=qName) {
			   tag = qName;//�洢��ǩ
		   if(qName.equals("servlet")) {
			   entity = new Entity();
			   isMapping = false;
		   }else if(qName.equals("servlet-mapping")){
			   mapping = new Mapping();
			   isMapping = true;
		   }
	    }
	  }
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String content = new String(ch, start, length).trim(); 
		if(null!=tag) {//�����
			if(isMapping) {//����servlet-mapping
				if(tag.equals("servlet-name")) {
					mapping.setName(content);
				}else if(tag.equals("servlet-class")) {
					mapping.addPattern(content);
				}
			}else {//����servlet
				if(tag.equals("servlet-name")) {
					entity.setName(content);
				}else if(tag.equals("servlet-class")) {
					entity.setClz(content);
				}
			}
			
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		 System.out.println(qName+"-->��������");
		 if(null!=qName) {
			 if(qName.equals("servlet")) {
				   entities.add(entity);
			   }else if(qName.equals("servlet-mapping")) {
				   mappings.add(mapping);
			   }
		 }
		 tag = null;//��tag�ÿգ���ֹ�´ν�����ֵΪ��
	}
	
	@Override
	public void endDocument() throws SAXException {
		
	}


	public List<Entity> getEntities() {
		return entities;
	}

	public List<Mapping> getMappings() {
		return mappings;
	}


	
}
