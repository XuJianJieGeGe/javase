package threadpool02;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        //����ִ�е�ǰ Callable ���߳�����
        return Thread.currentThread().getName();
    }
}
