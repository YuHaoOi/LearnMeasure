package com.jlkf.learnmeasure;

import android.content.Context;
import android.media.Image;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import java.lang.ref.ReferenceQueue;

/**
 * Created by DuoNuo on 2017/11/8.
 */

public class MyImageView extends ImageView {


    public MyImageView(Context context) {
        super(context);
    }

    public MyImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        //viewGroup的遍历每个子view，子view的最近一次调用measure()方法测量后得到的，就是View的宽度。
        int measuredWidth = getMeasuredWidth();
        //viewGroup的遍历每个子view，子view的最近一次调用measure()方法测量后得到的，就是View的高度。
        int measureHeight = getMeasuredHeight();

        int smallSide = Math.min(measuredWidth, measureHeight);

        setMeasuredDimension(smallSide,smallSide);
    }




}
