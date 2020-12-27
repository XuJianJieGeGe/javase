package map;

/**
 * �ײ����ʵ�֣�Hashmap�ĵײ��ǹ�ϣ��=����+����
 * �Զ���Hashmap
 * @author Administrator
 *
 */
public class SxtHashMap {
	
    Node[] table;//λͰ���� bucket array
    int size;
    
    Node iterList = null;//���ڱ����������һ��Ԫ��
    
    
   public SxtHashMap() {
	   table = new Node[16];//����һ�㶨���2��������
   }
   
   public void put(Object key,Object value) {
	   //�������µĽڵ����
	   Node newNode = new Node();
	   newNode.hash=myHash(key.hashCode(),table.length);
	   newNode.key = key;
	   newNode.value = value;
	   newNode.next = null;
	   
	   Node temp = table[newNode.hash];
	   if(temp==null) {
		   //�˴�����Ԫ��Ϊ�գ���ֱ�Ӵ�Žڵ���
		   table[newNode.hash] = newNode;
	   }else {
		   //�˴�����Ԫ�ز�Ϊ�գ��������Ӧ������
		   while(temp!=null) {
			   //�ж�key����ظ����򸲸�
			   if(temp.key.equals(key)) {
				   System.out.println("key�ظ���");
				   temp.value = value;//ֻ��Ҫ����ֵ�Ϳ����ˣ�hash,next�Ȳ�Ҫ��
				   return;
			   }else {
				   //key���ظ�
				   iterList = temp;
				   temp = temp.next;
			   }
		   }
		   iterList = newNode;
	   }
   }
   
   public static void main(String[] args) {
	SxtHashMap sxtHashMap = new SxtHashMap();
	sxtHashMap.put(10, "aa");
	sxtHashMap.put(20, "bb");
	sxtHashMap.put(30, "cc");
	System.out.println(sxtHashMap);
   }
   
   
   public int myHash(int v,int length) {
	   System.out.println("hash in myHash"+(v&(length-1)));//ֱ��λ������,Ч�ʸ�
	   System.out.println("hash in myHash"+(v%(length-1)));//ȡ�࣬Ч�ʵ�
	   return v&(length-1);
   }
	
	
	

}
