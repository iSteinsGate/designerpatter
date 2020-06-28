package chain;

class InfoLogger extends AbstractLogger{
    public InfoLogger(AbstractLogger next){
        super(AbstractLogger.info,next);
    }
    protected void write(String message){
        System.out.println("InfoLogger："+message);
    }

}