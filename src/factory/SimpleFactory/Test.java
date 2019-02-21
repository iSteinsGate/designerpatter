package factory.SimpleFactory;

/**
 * 简单工厂通过传入不同得参数从而产生不同的产品
 * 不便于拓展，如果新增一个商品需要改代码
 * @author: tsinghui
 * @date: 2019/2/21
 */
public class Test {

    public static void main(String[] args) {

        CarSimpleFactory simpleFactory = new CarSimpleFactory();
        Car car;
        car = simpleFactory.createCar("BMW");
        car.run();//输出：宝马行驶
        car = simpleFactory.createCar("VW");
        car.run();//输出：大众行驶
    }
}
