package com.syj.demo.util;

public class MyException extends Exception {
    public MyException() {
        super("我的异常!");
    }

    public MyException(String msg) {
        super(msg);
    }

    public String toString() {
        return super.toString();
    }
}
