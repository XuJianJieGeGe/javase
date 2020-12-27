package com.xujj.designpattern.prototype.deepclone;


import java.io.*;

/**
 * @description:
 * @author: xujianjie
 * @create: 2020-07-19 14:56
 **/
public class DeepPrototype implements Serializable,Cloneable {

    public String name;

    public DeepCloneTarget deepCloneTarget;

    public DeepPrototype() {
    }

    //�������ʽһ��ʹ��clone����

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = null;
        //������ɶԻ����������ͺ�String�Ŀ�¡
        object = super.clone();
        //���������͵�������
        DeepPrototype deepPrototype = (DeepPrototype) object;
        deepPrototype.deepCloneTarget = (DeepCloneTarget) deepCloneTarget.clone();
        return object;
    }

    //��ʽ�����������л��ķ�ʽ���Ƽ�ʹ�ã�
    public Object deepClone() {
        //��������
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //���л�
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //�����л�
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype deepPrototype = (DeepPrototype) ois.readObject();
            return deepPrototype;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                bis.close();
                ois.close();
                oos.close();
                bos.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
