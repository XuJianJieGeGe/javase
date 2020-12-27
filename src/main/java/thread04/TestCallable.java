package thread04;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * ʵ���̵߳ĵ����ַ�ʽ
 * @author Administrator
 *
 */
public class TestCallable implements Callable<String>{
	
	public TestCallable(String name) {
		this.name = name;
	}

	//FutureTask�����̵߳ķ���ֵ
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		FutureTask<String> futureTask = new FutureTask<>(new TestCallable("����"));
		new Thread(futureTask).start();
		System.out.println(futureTask.get());
	}
	
	private String name;

	@Override
	public String call() throws Exception {
		return name+"��һ������";
	}

}
