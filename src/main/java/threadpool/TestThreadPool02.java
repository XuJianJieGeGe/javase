package threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * ����ʹ���̳߳ص�Ч��
 * @author Administrator
 *
 */
public class TestThreadPool02 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Long start = System.currentTimeMillis();
		final List list = new ArrayList<>();
		ExecutorService executorService = Executors.newFixedThreadPool(1);//�����̶�������
		//Executors.newCachedThreadPool(threadFactory);//��������̳߳�
		for(int i=0;i<100000;i++) {
			final int j = i;
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					list.add(j);
				}
			});
		}
		//��������88��  100000
		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.DAYS);//��仰��join������
		System.out.println(System.currentTimeMillis()-start);
		System.out.println(list.size());
	}

}
