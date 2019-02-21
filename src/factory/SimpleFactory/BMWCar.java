package factory.SimpleFactory;

/**
 * 宝马汽车类
 * @author: tsinghui
 * @date: 2019/2/21
 */
public class BMWCar extends Car {
    @Override
    void run() {
        System.out.println("宝马行驶");
    }
}
