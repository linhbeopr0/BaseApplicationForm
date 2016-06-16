package com.example.ngoclinhtruong.baseapplicationform;

import android.os.Bundle;

import com.example.base.BaseActivity;

import org.androidannotations.annotations.EActivity;

@EActivity
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
