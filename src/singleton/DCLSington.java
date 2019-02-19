package singleton;

/**
 * volatile double check 懒汉模式
 * @Author: tsinghui
 * @Date: 2019/2/13
 */
public class DCLSington {
    /**通过volatile修饰保证可见性，提供内存屏障（不能保证原子性，例如i++）*/
    private static volatile DCLSington mySingleton = null;

    private DCLSington(){}

    public DCLSington getInstance(){
        //避免每次都加锁，提高性能
        if(mySingleton==null){
            synchronized(DCLSington.class){
                //多线程保证只创建一个对象
                if(mySingleton==null){
                    mySingleton = new DCLSington();
                }
            }
        }
        return mySingleton;
    }
}
