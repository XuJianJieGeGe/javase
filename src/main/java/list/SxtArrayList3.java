package list;
/**
 * ��д�ײ��ArrayList
 * ���ӷ���
 *�������ݹ���
 * @author Administrator
 *
 */
public class SxtArrayList3<E> {
	
	private Object[] elementData;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	
	public SxtArrayList3() {
		elementData = new Object[DEFAULT_CAPACITY];
	}
	
	public SxtArrayList3(int capacity) {
		elementData = new Object[capacity];
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
	
	public static void main(String[] args) {
		SxtArrayList3<Integer> sxtArrayList = new SxtArrayList3<Integer>();
		for(int i=0;i<40;i++){
			sxtArrayList.add(i);
		}
		System.out.println(sxtArrayList);
	}

	
	

}
