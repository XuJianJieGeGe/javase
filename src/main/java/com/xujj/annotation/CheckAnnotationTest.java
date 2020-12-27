package com.xujj.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Ҫ�󴴽�cat����ִ��������eat����
 */
public class CheckAnnotationTest {
    public static void main(String[] args) throws Exception {
        //��ȡ����������
        Class<User> userClass = User.class;
        //4����ȡ���ϵ�����ע�� ?
        Annotation[] classAnnotation = userClass.getAnnotations();
        for (Annotation cAnnotation : classAnnotation) {
            Class annotationType = cAnnotation.annotationType();
            System.out.println("User���ϵ�ע����: " + annotationType);
        }
        //��ȡ�����ϵ�����ע��
//        Annotation[] methodAnnotations = method.getAnnotations();
//        for (Annotation me : methodAnnotations) {
//            Class annotationType = me.annotationType();
//            System.out.println("��ȡ�����ϵ�����ע��: " + annotationType);
//          }
        //��ȡ�෽���е�ע����󣬵õ��Ƿ�Ҫ��¼����
        Method method = userClass.getMethod("findUserInfo", Integer.class);
        Check annotationCheck = method.getAnnotation(Check.class);
        boolean login = annotationCheck.login();
        if (login) {
            //�ж��û��Ƿ��¼�����õ�ǰ����
            System.out.println("�û���Ҫ��¼");
        } else {
            System.out.println("�û�����Ҫ��¼");
        }
        User user = userClass.newInstance();
        user.findUserInfo(10);

        //��ȡǩ������
        boolean sign = annotationCheck.sign();
        System.out.println("�費��Ҫǩ����" + sign);

    }
}