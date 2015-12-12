package com.code.jianzhe.codertool.formater;

/**
 * Created by JianZhe on 15/12/12.
 * <p>
 * 默认格式化器,将内容格式化成HTML格式
 *
 * @author JianZhe
 * @version 1.0
 */
public class DefaultFormater implements IFormater {
    /**
     * 格式化结果字符串,具体格式取决于子类的实现
     *
     * @param result 需要格式化的内容
     * @return 格式后的内容
     */
    @Override
    public String formaterResult(String result) {
        return null;
    }
}
