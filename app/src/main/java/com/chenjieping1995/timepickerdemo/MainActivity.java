package com.chenjieping1995.timepickerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.chenjieping1995.timepickerdemo.pickers.NumberPicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onNumberPicker(View view) {
        NumberPicker picker = new NumberPicker(this);
        picker.setWidth(picker.getScreenWidthPixels());
        picker.setCanLoop(false);
        picker.setLineVisible(true);
        // 启用iOS的3D滚轮模式
        picker.setWheelModeEnable(true);
        picker.setOffset(2);
        picker.setRange(0, 60, 5);//数字范围
        picker.setSelectedItem(15);
        picker.setLabel("秒");
        picker.setOnNumberPickListener(new NumberPicker.OnNumberPickListener() {
            @Override
            public void onNumberPicked(int index, Number item) {
                showToast("index=" + index + ", item=" + item.intValue());
            }
        });
        picker.show();
    }

    public void onNumberPicker2(View view) {
        NumberPicker picker = new NumberPicker(this);
        picker.setWidth(picker.getScreenWidthPixels());
        picker.setCanLoop(false);
        picker.setLineVisible(false);
        // 启用普通的列表模式
        picker.setWheelModeEnable(false);
        picker.setOffset(3);
        picker.setRange(0, 60, 5);//数字范围
//        picker.setSelectedItem(15);
        picker.setSelectedIndex(3);
        picker.setLabel("秒");
        picker.setOnNumberPickListener(new NumberPicker.OnNumberPickListener() {
            @Override
            public void onNumberPicked(int index, Number item) {
                showToast("index=" + index + ", item=" + item.intValue());
            }
        });
        picker.show();
    }

    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
