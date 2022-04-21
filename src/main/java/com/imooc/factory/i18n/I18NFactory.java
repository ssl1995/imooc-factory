package com.imooc.factory.i18n;

import com.imooc.factory.i18n.impl.Chinnese;
import com.imooc.factory.i18n.impl.English;
import com.imooc.factory.i18n.impl.Other;

/**
 * @author SongShengLin
 * @date 2022/4/9 19:13
 * @description
 */
public class I18NFactory {

    public static Language getI18NObject(String area) {
        if ("chinese".equals(area)) {
            return new Chinnese();
        } else if ("English".equals(area)) {
            return new English();
        }
        return new Other();
    }
}
