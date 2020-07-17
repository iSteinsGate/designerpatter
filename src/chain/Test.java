package chain;

/**
 * 责任链模式
 * @author: tsinghui
 * @date: 2020-06-28 15:34
 **/
public class Test {
    public static void main (String[] args) throws java.lang.Exception{
        AbstractLogger logger = getChainOfLogger();
        logger.logMessage(AbstractLogger.info,"this is an infomation.");
        logger.logMessage(AbstractLogger.debug,"this is an infomation.");
        logger.logMessage(AbstractLogger.error,"this is an infomation.");
    }

    /**
     * 构造责任链
     * @return
     */
    private static AbstractLogger getChainOfLogger(){
        AbstractLogger infoLog = new InfoLogger(null);
        AbstractLogger fileLogger = new DebugLogger(infoLog);
        AbstractLogger errorLog = new ErrorLogger(fileLogger);
        return errorLog;
    }
}
