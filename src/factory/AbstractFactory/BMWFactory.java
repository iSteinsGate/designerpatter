package factory.AbstractFactory;

/**
 * 生产宝马系列产品的工厂
 * @author: tsinghui
 * @date: 2019/2/21
 */
public class BMWFactory extends Factory {
    @Override
    Car createCar() {
        return new BMWCar();
    }

    @Override
    Tyre createTyre() {
        return new BMWTyre();
    }
}
