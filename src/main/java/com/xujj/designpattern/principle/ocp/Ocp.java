package com.xujj.designpattern.principle.ocp;


/**
 * ����ԭ��
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}


class GraphicEditor{
    //����Shape����Ȼ�����type�������Ʋ�ͬ��ͼ��
    public void drawShape(Shape s){
        if(s.type==1)
            drawRectangle(s);
        else if(s.type==2)
            drawCircle(s);

    }

    private void drawCircle(Shape s) {
        System.out.println("��Բ��");
    }

    private void drawRectangle(Shape s) {
        System.out.println("������");
    }
}

class Shape{
    int type;
}


class Rectangle extends Shape{
    Rectangle(){
        super.type=1;
    }
}

class Circle extends Shape{
    Circle(){
        super.type=2;
    }
}


