package com.imooc.factory.i18n;

/**
 * @author SongShengLin
 * @date 2022/4/9 19:15
 * @description
 */
public class App {

    public static void main(String[] args) {
        Language chinese = I18NFactory.getI18NObject("chinese");
        System.out.println(chinese.getTitle());
    }
}
