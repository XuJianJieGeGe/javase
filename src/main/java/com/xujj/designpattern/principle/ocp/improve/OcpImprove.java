package com.xujj.designpattern.principle.ocp.improve;


public class OcpImprove {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.draw(new Rectangle());
        graphicEditor.draw(new Circle());
        graphicEditor.draw(new OtherShape());
    }
}

//����һ����ͼ�ࡾʹ�÷���
class GraphicEditor{
    void draw(Shape s) {
       s.draw();
    }
}

abstract class Shape{
    public abstract void draw();
}

class Rectangle extends Shape{

    @Override
    public void draw() {
        System.out.println("������");
    }
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("��ԭ��");
    }
}

//����������ͼ��
class OtherShape extends Shape{

    @Override
    public void draw() {
        System.out.println("������ͼ��");
    }
}
