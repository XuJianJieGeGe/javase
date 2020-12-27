package threadpool;

import java.util.ArrayList;
import java.util.List;

/**
 * ���Բ�ʹ���̳߳ص�Ч��
 * @author Administrator
 *
 */
public class TestThreadPool01 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Long start = System.currentTimeMillis();
		final List list = new ArrayList<>();
		for(int i=0;i<100000;i++) {
			final int j = i;
			Thread thread = new Thread() {
				@Override
				public void run() {
					list.add(j);
				}
			};
			thread.start();
			//Thread���е�join��������Ҫ���þ���ͬ����������ʹ���߳�֮��Ĳ���ִ�б�Ϊ����ִ�С�

			/**join����˼��ʹ�÷�����ǰ�̵߳�ִ�У������ض�Ӧ���̣߳���������������˼���ǣ�
			 ������main�߳��е���t1�̵߳�join��������main�̷߳���cpu����Ȩ��������t1�̼߳���ִ��ֱ���߳�t1ִ�����
			 ���Խ����t1�߳�ִ����󣬲ŵ����߳�ִ�У��൱����main�߳���ͬ��t1�̣߳�t1ִ�����ˣ�main�̲߳���ִ�еĻ���
			 */
			thread.join();
		}
		//��������28782��  100000
		System.out.println(System.currentTimeMillis()-start);
		System.out.println(list.size());
	}

}
