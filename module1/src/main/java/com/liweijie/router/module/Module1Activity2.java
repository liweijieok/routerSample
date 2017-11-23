package com.liweijie.router.module;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.liweijie.router.base.cons.Constant;

/**
 * 作者：黎伟杰-子然 on 2017/11/23.
 * 邮箱：liweijie@linghit.com
 * description：
 * update by:
 * update day:
 */
public class Module1Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1_activity2);

        TextView receive = (TextView) findViewById(R.id.receive);
        String hellow = getIntent().getStringExtra("data");
        int code = getIntent().getIntExtra("data1", -1);
        receive.setText("接收到的数据是" + hellow + "，" + code);
    }

    public void launchM2Act2(View view) {
        Intent back = new Intent();
        back.putExtra(Constant.DATA, "hi");
        back.putExtra(Constant.DATA1, 5);
        setResult(Constant.MODULE1_RESULT_CODE, back);
        finish();
    }
}
