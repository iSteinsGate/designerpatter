package bridge;

/**
 * 抽象骑车类
 * @author: tsinghui
 * @date: 2020-07-17 16:15
 **/
public abstract class Car {

    //引用引擎接口
    protected Engine engine;

    public Car(Engine engine){
        this.engine = engine;
    }
    public abstract void driver();

}
