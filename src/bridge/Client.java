package bridge;

import java.sql.Ref;

/**
 * @author: tsinghui
 * @date: 2020-07-17 16:34
 **/
public class Client {
    public static void main(String[] args) {
        RefinedCar car = new BossCar(new HybridEngine());
        car.driver();
        car = new TinyCar(new ElectricEngine());
        car.driver();
    }
}
