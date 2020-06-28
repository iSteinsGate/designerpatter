package com.hanyan.intelliman.test.ChainOfResponsibility;

class DebugLogger extends AbstractLogger{
    public DebugLogger(AbstractLogger next){
        super(AbstractLogger.debug,next);
    }
    public void write(String message){
        System.out.println("DebugLogger:"+message);
    }
}