package factory.SimpleFactory;

/**
 * 简单工厂类
 * @author: tsinghui
 * @date: 2019/2/21
 */
public class CarSimpleFactory {

    /**
     * 制造车的方法
     * @param type
     * @return
     */
    public Car createCar(String type){
        Car car = null;
        if("VM".equals(type)){
            car = new VWCar();
        }else if("BMW".equals(type)){
            car = new BMWCar();
        }else{
            throw new RuntimeException("没有该类型的车!!");
        }
        return car;
    }
}
