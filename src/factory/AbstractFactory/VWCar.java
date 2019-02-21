package factory.AbstractFactory;

/**
 * 大众类
 * @author: tsinghui
 * @date: 2019/2/21
 */
public class VWCar extends Car {
    @Override
    void run() {
        System.out.println("大众行驶");
    }
}
