package list;
/**
 * ��д�ײ��ArrayList
 * ����remove����
 *
 * @author Administrator
 *
 */
public class SxtArrayList5<E> {
	
	private Object[] elementData;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	
	public SxtArrayList5() {
		elementData = new Object[DEFAULT_CAPACITY];
	}
	
	public SxtArrayList5(int capacity) {
		if(capacity<0) {
			throw new RuntimeException("��������������Ϊ����"+capacity);
		}else if(capacity==0){
			elementData = new Object[DEFAULT_CAPACITY];
		}else {
			elementData = new Object[capacity];
		}
		
	}
	
	public void add(E e) {
		//ʲôʱ������
		if(elementData.length==size) {
			//��ô����
			Object[] newArray = new Object[elementData.length+(elementData.length>>1)];//10+10/2
		    System.arraycopy(elementData, 0, newArray, 0, elementData.length);
		    elementData = newArray;
		}
		elementData[size++] = e;
	}
	
	//��ȡ��Ӧ���±��ֵ
	public E get(int index) {
		checkRange(index);
		return (E)elementData[index];
	}
	
	//Ϊ��Ӧ���±���ֵ
	public void set(E element,int index) {
		checkRange(index);
		elementData[index]=element;
	}
	
	//remove�Ƴ�����
	public void remove(E element) {
		
		for(int i=0;i<size;i++) {
			if(element.equals(get(i))) {//���������õ����бȽϲ����õĶ���equals������==
				//�Ƴ���Ԫ��
				
			}
		}
		
	}
	
	public void remove(int index) {
		//ɾ��c,abcdef-->adbef
		//��һ������������������;�ڶ��������������Ŀ�ʼλ�ã���������������ŵĵط������ĸ���������ŵĿ�ʼλ�ã������ĸ���
		int moveNum = elementData.length-index-1;
		if(moveNum>0) {
			System.arraycopy(elementData, index+1, elementData, index, moveNum);
		}
		elementData[--size] = null;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size==0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("[");
		for(int i=0;i<size;i++) {
			stringBuffer.append(elementData[i]+",");
		}
		stringBuffer.setCharAt(stringBuffer.length()-1, ']');
		return stringBuffer.toString();
	}
	
	public void checkRange(int index) {
		//�ж������Ƿ�Խ��
		if(index<0||index>size-1) {
			throw new RuntimeException("�������Ϸ�!"+index);
		}
	}
	
	public static void main(String[] args) {
		SxtArrayList5<Integer> sxtArrayList = new SxtArrayList5<Integer>();
		for(int i=0;i<40;i++){
			sxtArrayList.add(i);
		}
		System.out.println(sxtArrayList);
		//System.out.println(sxtArrayList.get(10));
		
		sxtArrayList.remove(3);
		sxtArrayList.remove(10);
		System.out.println(sxtArrayList);
		System.out.println(sxtArrayList.isEmpty());
	}

	
	

}
