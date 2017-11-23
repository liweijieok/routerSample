package com.liweijie.router.module2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.liweijie.router.base.cons.Constant;
import com.liweijie.router.base.entity.BunBuilder;
import com.liweijie.router.base.sign.SignRouterManager;

/**
 * 作者：黎伟杰-子然 on 2017/11/23.
 * 邮箱：liweijie@linghit.com
 * description：
 * update by:
 * update day:
 */
public class Module2Activity2 extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2_activity2);
    }

    public void launchM1Act2(View view) {
        BunBuilder bunBuilder = new BunBuilder()
                .put(Constant.DATA, "hello")
                .put(Constant.DATA1, 2);
        SignRouterManager.getRouter().launch(this, "router/module1/page2", bunBuilder, Constant.MODULE2_REQUEST_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Constant.MODULE2_REQUEST_CODE && resultCode == Constant.MODULE1_RESULT_CODE) {
            TextView textView = (TextView) findViewById(R.id.text);
            String hi = data.getStringExtra(Constant.DATA);
            int code = data.getIntExtra(Constant.DATA1, -1);
            textView.setText("接受返回的数据是：" + hi + "," + code);
        }
    }
}
