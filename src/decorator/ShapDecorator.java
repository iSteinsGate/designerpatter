package decorator;

/**
 * 形状抽象装饰类
 * @author: tsinghui
 * @date: 2020-07-18 13:32
 **/
public class ShapDecorator implements Shape {
    protected  Shape shapDecorator;
    public ShapDecorator(Shape shapDecorator){
        this.shapDecorator = shapDecorator;
    }
    @Override
    public void draw() {
        shapDecorator.draw();
        System.out.println("Border Color:Red");
    }
}
