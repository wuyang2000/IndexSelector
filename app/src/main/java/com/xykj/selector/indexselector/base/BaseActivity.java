package com.xykj.selector.indexselector.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/**
 * @author YangWu
 * @description Activity基类
 * @data 2017/12/24 13:31
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    protected void setRefreshViewOverScroll(SmartRefreshLayout refreshLayout) {
        refreshLayout.setEnableRefresh(false);//是否启用下拉刷新功能
        refreshLayout.setEnableLoadMore(false);//是否启用上拉加载功能
        refreshLayout.setEnablePureScrollMode(true);//是否启用纯滚动模式
        refreshLayout.setEnableOverScrollBounce(true);//是否启用越界回弹
        refreshLayout.setEnableOverScrollDrag(true);//是否启用越界拖动（仿苹果效果）1.0.4
        refreshLayout.setDragRate(0.3f);//显示下拉高度/手指真实下拉高度=阻尼效果
    }

    public Context getContext() {
        return this;
    }
}
