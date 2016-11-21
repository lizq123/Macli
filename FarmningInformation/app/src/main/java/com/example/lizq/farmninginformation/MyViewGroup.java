package com.example.lizq.farmninginformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by lizq on 16-11-8.
 */

public class MyViewGroup extends ViewGroup {


    public MyViewGroup(Context context) {
        super(context);
    }

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int left = 0;
        int top = 0;
        int right = 0;
        int bottom = 0;
        if(changed){
            left= getWidth()-right;
            top = getHeight()-bottom;

        }

    }
}
