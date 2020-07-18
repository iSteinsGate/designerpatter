package decorator;

/**
 * 装饰器模式
 * @author: tsinghui
 * @date: 2020-07-18 15:30
 **/
public class Client {
    public static void main(String[] args) {
        Shape redCricle = new RedShapDecorator(new Cricle());
        redCricle.draw();
        Shape redRectangle = new RedShapDecorator(new Rectangle());
        redRectangle.draw();
    }
}
