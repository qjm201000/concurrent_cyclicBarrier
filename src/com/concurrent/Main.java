package com.concurrent;

import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {
        int player_count = 10;//10个参赛选手

        Admin admin = new Admin();//发令枪管理员
        CyclicBarrier cyclicBarrier = new CyclicBarrier(player_count,admin);
        for(int i = 0;i < 10;i++){
            Player player = new Player(cyclicBarrier);
            new Thread(player).start();
        }
    }
}
