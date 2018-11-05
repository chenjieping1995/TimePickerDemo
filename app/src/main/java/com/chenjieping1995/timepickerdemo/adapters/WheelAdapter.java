package com.chenjieping1995.timepickerdemo.adapters;

/**
 * Created by chenjieping1995 on 2018/11/5.
 *
 * @e-mail: cjp19951126@qq.com
 */

public interface WheelAdapter<T> {

    /**
     * Gets items count
     * @return the count of wheel items
     */
    int getItemsCount();

    /**
     * Gets a wheel item by index.
     * @param index the item index
     * @return the wheel item text or null
     */
    T getItem(int index);

    /**
     * Gets maximum item length. It is used to determine the wheel width.
     * If -1 is returned there will be used the default wheel width.
     * @param o
     * @return the maximum item length or -1
     */
    int indexOf(T o);
}
