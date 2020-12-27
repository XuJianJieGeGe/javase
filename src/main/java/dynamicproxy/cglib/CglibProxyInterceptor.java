package dynamicproxy.cglib;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        playStart();
        Object object = methodProxy.invokeSuper(o, objects);
        playEnd();
        return object;
    }

    public void playStart() {
        System.out.println("��Ӱ��ʼǰ���ڲ��Ź��");
    }

    public void playEnd() {
        System.out.println("��Ӱ�����ˣ��������Ź��");
    }
}
