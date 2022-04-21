package com.imooc.factory.computershop;

import com.imooc.factory.computershop.impl.Desktop;
import com.imooc.factory.computershop.impl.NoteBook;
import com.imooc.factory.computershop.impl.Other;
import com.imooc.factory.computershop.impl.Server;

/**
 * @author SongShengLin
 * @date 2022/4/9 19:05
 * @description
 */
public class ShopAssistant {

    public Computer suggest(String purpose) {
        Computer computer = null;
        if ("网站建设".equals(purpose)) {
            return new Server();
        } else if ("办公电脑".equals(purpose)) {
            return new NoteBook();
        } else if ("游戏电脑".equals(purpose)) {
            return new Desktop();
        }

        return new Other();
    }
}
