package bridge;

/**
 * 修正的抽象类
 * @author: tsinghui
 * @date: 2020-07-17 16:19
 **/
public abstract class RefinedCar extends Car{

    public RefinedCar(Engine engine){
        super(engine);
    }

    @Override
    public void driver() {
        this.engine.start();
        System.out.println("Driver "+getBrand()+" car..");

    }

    protected abstract String getBrand();

}
