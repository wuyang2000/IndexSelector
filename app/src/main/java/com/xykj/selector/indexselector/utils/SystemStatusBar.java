package com.xykj.selector.indexselector.utils;

import android.app.Activity;
import android.support.annotation.ColorRes;

import com.gyf.barlibrary.ImmersionBar;
import com.xykj.selector.indexselector.R;

/**
 * @author YangWu
 * @description
 * @data 2017/12/24 21:54
 */

public class SystemStatusBar {

    public static void setStatusBarStyle(Activity activity, @ColorRes int color) {
        ImmersionBar.with(activity)
                .statusBarColor(color)                    //状态栏颜色，不写默认透明色
                .statusBarAlpha(0.0f)                     //状态栏透明度，不写默认0.0f
                .navigationBarAlpha(0.0f)                 //导航栏透明度，不写默认0.0F
                .barAlpha(0.0f)                           //状态栏和导航栏透明度，不写默认0.0f
                .statusBarDarkFont(true)                  //状态栏字体是深色，不写默认为亮色
                .flymeOSStatusBarFontColor(R.color.black) //修改flyme OS状态栏字体颜色
                .init();                                  //必须调用方可沉浸式
    }
}
