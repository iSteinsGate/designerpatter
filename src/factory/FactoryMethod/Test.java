package factory.FactoryMethod;

/**
 * 工厂方法模式：通过创建不同的工厂从而生产出不同的产品，便于扩展，
 * 如果新增一门产品，只需要分别实现产品的抽象工厂以及该产品的抽象类
 * @author: tsinghui
 * @date: 2019/2/21
 */
public class Test {

    public static void main(String[] args) {

        CarFactory carFactory;
        Car car;
        //宝马工厂生产宝马车
        carFactory = new BMWCarFactory();
        car = carFactory.createCar();
        car.run();//输出：宝马行驶
        //大众工厂生产大众车
        carFactory = new VWCarFactory();
        car = carFactory.createCar();
        car.run();//输出：大众行驶
    }
}
