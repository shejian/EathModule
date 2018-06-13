package com.avengers.mylibrary;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.ImageView;

public class CommonUtil {

    public void print() {

        Log.d("shejian", "I'm eathmodule 000000");

        Log.d("shejian", "I'm eathmodule 12123");

    }

    public int plus(int num1, int num2) {

        return num1 + num2;
    }

    public int plus2(int num1, int num2) {

        return num1 + num2;
    }

    public Drawable loadImg(String url) {

        return new Drawable() {
            @Override
            public void draw(@NonNull Canvas canvas) {

            }

            @Override
            public void setAlpha(int alpha) {

            }

            @Override
            public void setColorFilter(@Nullable ColorFilter colorFilter) {

            }

            @Override
            public int getOpacity() {
                return 0;
            }
        };
    }

    public void showImg(ImageView view, Drawable drawable) {

        Log.d("shejian", "加载完成");
    }

}
