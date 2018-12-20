package com.concurrent;

/**
 * 管理员发令开跑
 */
public class Admin implements Runnable{
    @Override
    public void run() {
        System.out.println("选手已来齐，跑");
    }
}
