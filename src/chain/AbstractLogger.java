package chain;

/**
 * 抽象日志类
 */
abstract class  AbstractLogger{
    public static int info = 1;
    public static int debug = 2;
    public static int error = 3;
    private  int level;
    private  AbstractLogger next;
    public  AbstractLogger(int level,AbstractLogger next){
        this.level = level;
        this.next = next;
        }
    public void logMessage(int level,String message){
        if(this.level<=level){
            write(message);
        } else if(next != null){
            next.logMessage(level,message);

        }else{
            System.out.println("没有下一级日志级别");
        }
        }
    abstract protected void write(String message);

}