package org.seckill.exception;

/*
    @author kiki
    @date  2020/4/13
    // 秒杀关闭异常
*/
public class SeckillCloseException extends SeckillException {
    public SeckillCloseException() {
    }

    public SeckillCloseException(String message) {
        super(message);
    }
}
