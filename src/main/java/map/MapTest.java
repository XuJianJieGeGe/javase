package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @author Administrator
 *
 */
public class MapTest {
	
	public static void main(String[] args) {
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("aaa", 111);
		map.put("bbb", 2222);
	    
		//��ʽһ;
		for(String key:map.keySet()) {
			System.out.println("��:"+key+"ֵ:"+map.get(key));
		}
		
//	  //��ʽ����
//	  System.out.println("ͨ��Map.entrySetʹ��iterator����key��value��");
//	  Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
//	  while (it.hasNext()) {
//	   Map.Entry<String, Object> entry = it.next();
//	   System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
//	  }
	 
		
	  //��ʽ��:�Ƽ���������������ʱ
	  System.out.println("ͨ��Map.entrySet����key��value");
	  for (Entry<String, Object> entry : map.entrySet()) {
	   System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
	  }
		  
		
		
	}

	
	
}
