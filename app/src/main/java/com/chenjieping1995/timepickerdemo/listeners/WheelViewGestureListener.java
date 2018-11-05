package com.chenjieping1995.timepickerdemo.listeners;

import android.view.GestureDetector;
import android.view.MotionEvent;

import com.chenjieping1995.timepickerdemo.widget.WheelView;

/**
 * Created by chenjieping1995 on 2018/11/5.
 *
 * @e-mail: cjp19951126@qq.com
 */

public final class WheelViewGestureListener extends GestureDetector.SimpleOnGestureListener {

    final WheelView wheelView;

    public WheelViewGestureListener(WheelView wheelView) {
        this.wheelView = wheelView;
    }

    @Override
    public final boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        wheelView.scrollBy(velocityY);
        return true;
    }
}