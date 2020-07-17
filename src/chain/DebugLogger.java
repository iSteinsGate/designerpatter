package chain;

class DebugLogger extends AbstractLogger{
    public DebugLogger(AbstractLogger next){
        super(AbstractLogger.debug,next);
    }
    @Override
    public void write(String message){
        System.out.println("DebugLogger:"+message);
    }
}