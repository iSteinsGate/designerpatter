package factory.AbstractFactory;

/**
 * @author: tsinghui
 * @date: 2019/2/21
 */
public class BMWTyre extends Tyre{
    @Override
    void getType() {
        System.out.println("这是宝马轮胎");
    }
}
