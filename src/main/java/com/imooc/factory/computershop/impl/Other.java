package com.imooc.factory.computershop.impl;

import com.imooc.factory.computershop.Computer;

/**
 * @author SongShengLin
 * @date 2022/4/9 19:04
 * @description
 */
public class Other implements Computer {

    @Override
    public String describe() {
        return "其他电脑";
    }
}
