package factory.AbstractFactory;

/**
 *  抽象工厂方法：宝马工厂生产宝马系列的产品，大众工厂生产大众系列的产品
 *  如需要扩展，则写出系列产品和系列产品的工厂即可
 * @author: tsinghui
 * @date: 2019/2/21
 */
public class Test {
    public static void main(String[] args) {
        Factory factory;
        Car car;
        Tyre tyre;
        //宝马系列的产品
        factory = new BMWFactory();
        car = factory.createCar();
        car.run();
        tyre = factory.createTyre();
        tyre.getType();
        //大众系列的产品
        factory = new VWFactory();
        car = factory.createCar();
        car.run();
        tyre = factory.createTyre();
        tyre.getType();

    }
}
