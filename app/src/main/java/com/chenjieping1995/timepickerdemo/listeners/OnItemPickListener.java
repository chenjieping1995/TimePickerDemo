package com.chenjieping1995.timepickerdemo.listeners;

/**
 * Created by chenjieping1995 on 2018/11/5.
 *
 * 点击确认按钮选中item的回调
 *
 * @e-mail: cjp19951126@qq.com
 */

public interface OnItemPickListener<T> {

    void onItemPicked(int index, T item);
}
