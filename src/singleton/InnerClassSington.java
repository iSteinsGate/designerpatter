package singleton;

/**
 * 静态内部类懒汉模式(推荐使用)
 * @Author: tsinghui
 * @Date: 2019/2/13
 */
public class InnerClassSington {

    private InnerClassSington(){}

    private static class  InstanceHolder{
        private static final InnerClassSington INSTANCE = new InnerClassSington();
    }

    public InnerClassSington getInstance(){
        return InstanceHolder.INSTANCE;
    }
}

