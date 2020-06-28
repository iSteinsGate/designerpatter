package com.hanyan.intelliman.test.ChainOfResponsibility;

class ErrorLogger extends AbstractLogger{
    public ErrorLogger(AbstractLogger next){
        super(AbstractLogger.error,next);
    }
    public void write(String message){
        System.out.println("ErrorLogger:"+message);
        }
}