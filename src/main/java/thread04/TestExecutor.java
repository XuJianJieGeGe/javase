package thread04;

import java.util.concurrent.Executor;

/***
 * �����̵߳ĵ����ַ�ʽ
 * @author Administrator
 *
 */
public class TestExecutor implements Executor{
	
	
	public static void main(String[] args) {
		new TestExecutor().execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("����һ������");
			}
		});
	}

	@Override
	public void execute(Runnable command) {
		command.run();
	}

}
