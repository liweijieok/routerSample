package com.liweijie.router.module;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.liweijie.router.base.sign.SignProviderManager;
import com.liweijie.router.base.sign.SignRouterManager;

/**
 * 作者：黎伟杰-子然 on 2017/11/23.
 * 邮箱：liweijie@linghit.com
 * description：
 * update by:
 * update day:
 */
public class Module1Activity1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1_activity1);
    }

    public void launchM2Act1(View view) {
        SignRouterManager.getRouter().launch(this, "router/module2/page1");
    }

    public void getModule2Data(View view) {
        String tip = SignProviderManager.getManager().getModule2Provider().test();
        Toast.makeText(this,tip,Toast.LENGTH_SHORT).show();
    }
}
