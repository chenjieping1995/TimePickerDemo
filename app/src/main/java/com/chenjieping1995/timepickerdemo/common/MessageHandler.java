package com.chenjieping1995.timepickerdemo.common;

import android.os.Handler;
import android.os.Message;

import com.chenjieping1995.timepickerdemo.widget.WheelView;

/**
 * Created by chenjieping1995 on 2018/11/5.
 *
 * @e-mail: cjp19951126@qq.com
 */

public final class MessageHandler extends Handler {
    public static final int WHAT_INVALIDATE_LOOP_VIEW = 1000;
    public static final int WHAT_SMOOTH_SCROLL = 2000;
    public static final int WHAT_ITEM_SELECTED = 3000;

    final private WheelView wheelView;

    public MessageHandler(WheelView wheelView) {
        this.wheelView = wheelView;
    }

    @Override
    public final void handleMessage(Message msg) {
        switch (msg.what) {
            case WHAT_INVALIDATE_LOOP_VIEW:
                wheelView.invalidate();
                break;

            case WHAT_SMOOTH_SCROLL:
                wheelView.smoothScroll(WheelView.ACTION.FLING);
                break;

            case WHAT_ITEM_SELECTED:
                wheelView.onItemPicked();
                break;
        }
    }

}