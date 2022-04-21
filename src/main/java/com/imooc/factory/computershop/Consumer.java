package com.imooc.factory.computershop;

/**
 * @author SongShengLin
 * @date 2022/4/9 19:05
 * @description
 */
public class Consumer {

    public static void main(String[] args) {

        ShopAssistant shopAssistant = new ShopAssistant();
        Computer c = shopAssistant.suggest("办公电脑");
        System.out.println(c.describe());
    }
}
