package com.chenjieping1995.timepickerdemo.listeners;

/**
 * Created by chenjieping1995 on 2018/11/5.
 *
 * 针对地址选择，车牌选择等提供的外部回调接口
 *
 * @e-mail: cjp19951126@qq.com
 */

public interface OnMoreWheelListener {
    public abstract void onFirstWheeled(int index, String item);

    public abstract void onSecondWheeled(int index, String item);

    public abstract void onThirdWheeled(int index, String item);
}