package bridge;

/**
 * @author: tsinghui
 * @date: 2020-07-17 16:55
 **/
public class TinyCar extends RefinedCar {

    public TinyCar(Engine engine) {
        super(engine);
    }
    @Override
    protected String getBrand() {
        return "Tiny";
    }
}
