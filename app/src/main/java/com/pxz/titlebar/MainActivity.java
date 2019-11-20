package com.pxz.titlebar;

import android.os.Bundle;

import com.pxz.pxztitlebar.TitleBarView;
import com.pxz.pxztoast.ToastUtil;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 类说明：首页
 * 联系：530927342@qq.com
 *
 * @author peixianzhong
 * @date 2019/11/20 10:42
 */
public class MainActivity extends AppCompatActivity {
    private TitleBarView titleBarView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initOnClick();
    }

    private void initView() {
        titleBarView8=findViewById(R.id.titleBarView8);
    }

    private void initData() {
        titleBarView8.setTitleBarTextString("标题8");
        titleBarView8.setRightOneTextString("编辑");
        titleBarView8.setRightTwoTextString("保存");
    }

    private void initOnClick() {
        titleBarView8.setIvLeftOneInterface(() -> ToastUtil.shortShow("点击左边第一个图片按钮",this));
        titleBarView8.setIvLeftTwoInterface(() -> ToastUtil.shortShow("点击左边第二个图片按钮",this));
        titleBarView8.setTvRightOneInterface(() -> ToastUtil.shortShow("点击右边第一个文字按钮",this));
        titleBarView8.setTvRightTwoInterface(() -> ToastUtil.shortShow("点击右边第二个文字按钮",this));
    }
}