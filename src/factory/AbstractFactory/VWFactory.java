package factory.AbstractFactory;

/**
 * 生产大众产品系列的工厂
 * @author: tsinghui
 * @date: 2019/2/21
 */
public class VWFactory extends Factory {
    @Override
    Car createCar() {
        return new VWCar();
    }

    @Override
    Tyre createTyre() {
        return new VWTyre();
    }
}
