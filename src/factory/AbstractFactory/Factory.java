package factory.AbstractFactory;

/**
 * 抽象工厂，生产一系列产品
 * @author: tsinghui
 * @date: 2019/2/21
 */
public abstract class Factory {

    /**
     * 生产汽车
     * @return
     */
    abstract Car createCar();

    /**
     * 生产轮胎
     * @return
     */
    abstract Tyre createTyre();
}
