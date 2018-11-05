package com.chenjieping1995.timepickerdemo.pickers;

import android.app.Activity;

import com.chenjieping1995.timepickerdemo.listeners.OnItemPickListener;

import java.util.ArrayList;

/**
 * Created by chenjieping1995 on 2018/11/4.
 *
 * 数字选择器
 *
 * @e-mail: cjp19951126@qq.com
 */

public class NumberPicker extends SinglePicker<Number> {

    public NumberPicker(Activity activity) {
        super(activity, new Number[]{});
    }

    /**
     * 设置数字范围，默认递增量为1
     */
    public void setRange(int startNumber, int endNumber) {
        setRange(startNumber, endNumber, 1);
    }

    /**
     * 设置数字范围及递增量
     */
    public void setRange(int startNumber, int endNumber, int step) {
        for (int i = startNumber; i <= endNumber; i = i + step) {
            addItem(i);
        }
    }

    public void setRange(double startNumber, double endNumber, double step) {
        for (double i = startNumber; i <= endNumber; i = i + step) {
            addItem(i);
        }
    }

    /**
     * 设置默认的数字集合
     */
    public void setRange(ArrayList<Integer> numbers) {
        for (int i : numbers) {
            addItem(i);
        }
    }

    /**
     * 设置默认选中的数字
     */
    public void setSelectedItem(int number) {
        super.setSelectedItem(number);
    }

    public void setSelectedItem(double number) {
        super.setSelectedItem(number);
    }

    public void setOnNumberPickListener(OnNumberPickListener listener) {
        super.setOnItemPickListener(listener);
    }

    public static abstract class OnNumberPickListener implements OnItemPickListener<Number> {

        public abstract void onNumberPicked(int index, Number item);

        @Override
        public final void onItemPicked(int index, Number item) {
            onNumberPicked(index, item);
        }

    }

}
