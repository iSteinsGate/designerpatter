package factory.FactoryMethod;

/**
 * 大众工厂
 * @author: tsinghui
 * @date: 2019/2/21
 */
public class VWCarFactory extends CarFactory {
    @Override
    Car createCar() {
        return new VWCar();
    }
}
