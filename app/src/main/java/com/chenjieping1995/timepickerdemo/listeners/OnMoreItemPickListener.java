package com.chenjieping1995.timepickerdemo.listeners;

/**
 * Created by chenjieping1995 on 2018/11/5.
 *
 * 点击确认按钮选中item的回调
 *
 * @e-mail: cjp19951126@qq.com
 */

public interface OnMoreItemPickListener<T> {
    void onItemPicked(T t1, T t2,T t3);
}