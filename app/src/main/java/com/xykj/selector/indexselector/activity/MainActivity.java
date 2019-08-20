package com.xykj.selector.indexselector.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.xykj.selector.index_selector.ToastUtils;
import com.xykj.selector.indexselector.R;
import com.xykj.selector.indexselector.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private SmartRefreshLayout mRefreshLaoyout;
    private LinearLayout mActivityLl;
    private LinearLayout mBottomSheetLl;
    private TextView mResultTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        mRefreshLaoyout = findViewById(R.id.refresh_layout);
        setRefreshViewOverScroll(mRefreshLaoyout);

        mActivityLl = findViewById(R.id.ll_main_activity);
        mBottomSheetLl = findViewById(R.id.ll_main_BottomSheet);
        mResultTv = findViewById(R.id.tv_main_result);
        mActivityLl.setOnClickListener(onClickListener);
        mBottomSheetLl.setOnClickListener(onClickListener);
    }

    private void initData() {
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.ll_main_activity:
                    ToastUtils.show(getContext(), "Activity模式");
                    break;
                case R.id.ll_main_BottomSheet:
                    ToastUtils.show(getContext(), "BottomSheet模式");
                    break;
            }
        }
    };
}
