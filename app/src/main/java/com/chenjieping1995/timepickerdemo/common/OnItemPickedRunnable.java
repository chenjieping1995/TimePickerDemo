package com.chenjieping1995.timepickerdemo.common;

import com.chenjieping1995.timepickerdemo.widget.WheelView;
import com.chenjieping1995.timepickerdemo.listeners.OnItemPickListener;

/**
 * Created by chenjieping1995 on 2018/11/5.
 *
 * @e-mail: cjp19951126@qq.com
 */

public final class OnItemPickedRunnable implements Runnable {
    private final WheelView wheelView;
    private OnItemPickListener onItemPickListener;

    public OnItemPickedRunnable(WheelView wheelView, OnItemPickListener onItemPickListener) {
        this.wheelView = wheelView;
        this.onItemPickListener = onItemPickListener;
    }

    @Override
    public final void run() {
        onItemPickListener.onItemPicked(wheelView.getCurrentPosition(), wheelView.getCurrentItem());
    }
}
