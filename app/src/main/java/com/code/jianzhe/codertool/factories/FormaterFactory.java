package com.code.jianzhe.codertool.factories;

import com.code.jianzhe.codertool.formater.DefaultFormater;
import com.code.jianzhe.codertool.formater.IFormater;

/**
 * Created by JianZhe on 15/12/12.
 * <p>
 * 格式化器生成工厂
 * 根据XML配置分成对应的格式化器
 *
 * @author JianZhe
 * @version 1.0
 */
public class FormaterFactory {
    /**
     * 根据XML的配置生成对应的Formater
     *
     * @return 生成后的Formater
     */
    public static final IFormater getInstance() {
        return new DefaultFormater();
    }
}
