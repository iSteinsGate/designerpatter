package chain;

class InfoLogger extends AbstractLogger{
    public InfoLogger(AbstractLogger next){
        super(AbstractLogger.info,next);
    }
    @Override
    protected void write(String message){
        System.out.println("InfoLogger："+message);
    }

}