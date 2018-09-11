package edu.njxzc.tcs.util;

import java.util.Map;

/**
 * Created by Administrator on 15-8-28.
 */
public class ConstantUtils {
    public static ConstantUtils obj;

    public ConstantUtils (String string) {
        obj = this;
    }
    /**
     * 类型键值对 Spring启动的时候注入
     */
    public Map sysEnvironment;
    public Map whiteList;
    public Map getSysEnvironment() {
        return sysEnvironment;
    }
    public void setSysEnvironment(Map sysEnvironment) {
        this.sysEnvironment = sysEnvironment;
    }

    public Map getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(Map whiteList) {
        this.whiteList = whiteList;
    }
}
