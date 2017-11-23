package com.liweijie.module.routersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.liweijie.router.base.sign.SignRouterManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchM1Act1(View view) {
        SignRouterManager.getRouter().launch(this, "router/module1/page1");
    }
}
