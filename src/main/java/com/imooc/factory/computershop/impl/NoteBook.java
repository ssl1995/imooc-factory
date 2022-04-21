package com.imooc.factory.computershop.impl;

import com.imooc.factory.computershop.Computer;

/**
 * @author SongShengLin
 * @date 2022/4/9 19:03
 * @description
 */
public class NoteBook implements Computer {
    @Override
    public String describe() {
        return "笔记本";
    }
}
