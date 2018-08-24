package com.strategy;

public class Client {
    
    public static void main(String[] args) {
        Player player = new Player();
        player.buy(5000D);
        System.out.println(player.calLastAmount());
        player.buy(12000d);
        System.out.println(player.calLastAmount());
        player.buy(12000d);
        System.out.println(player.calLastAmount());
        player.buy(12000d);
        System.out.println(player.calLastAmount());
        
    }
}