package factory.FactoryMethod;

/**
 * 宝马工厂
 * @author: tsinghui
 * @date: 2019/2/21
 */
public class BMWCarFactory extends CarFactory{
    @Override
    Car createCar() {
        return new BMWCar();
    }
}
