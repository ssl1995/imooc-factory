package com.imooc.factory.computershop.impl;

import com.imooc.factory.computershop.Computer;

/**
 * @author SongShengLin
 * @date 2022/4/9 19:03
 * @description
 */
public class Server implements Computer {
    @Override
    public String describe() {
        return "服务器电脑";
    }
}
