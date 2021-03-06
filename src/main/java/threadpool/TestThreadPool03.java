package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试使用线程池的效率
 * @author Administrator
 *
 */
public class TestThreadPool03 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			
			@Override
			public void run() {
  			  System.out.println("我是一个好人");
			}
		});
	}

}
