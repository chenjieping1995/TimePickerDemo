package com.chenjieping1995.timepickerdemo.adapters;

import java.util.List;

/**
 * Created by chenjieping1995 on 2018/11/5.
 *
 * the simple array wheel adapter
 *
 * @e-mail: cjp19951126@qq.com
 */

public class ArrayWheelAdapter<T> implements WheelAdapter {

    /** The default items length */
    public static final int DEFAULT_LENGTH = 4;

    // items
    private List<T> items;
    // length
    private int length;

    /**
     * Constructor
     * @param items the items
     * @param length the max items length
     */
    public ArrayWheelAdapter(List<T> items, int length) {
        this.items = items;
        this.length = length;
    }

    /**
     * Constructor
     * @param items the items
     */
    public ArrayWheelAdapter(List<T> items) {
        this(items, DEFAULT_LENGTH);
    }

    @Override
    public Object getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return "";
    }

    @Override
    public int getItemsCount() {
        return items.size();
    }

    @Override
    public int indexOf(Object o){
        return items.indexOf(o);
    }
}
