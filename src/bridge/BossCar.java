package bridge;

/**
 * @author: tsinghui
 * @date: 2020-07-17 16:30
 **/
public class BossCar extends RefinedCar {

    public BossCar(Engine engine){
        super(engine);
    }
    @Override
    protected String getBrand() {
        return "Boss" ;
    }
}
