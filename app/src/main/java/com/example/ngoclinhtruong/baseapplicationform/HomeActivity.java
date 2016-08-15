package com.example.ngoclinhtruong.baseapplicationform;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import com.example.base.BaseActivity;
import com.example.utils.LogUtils;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity
public class HomeActivity extends BaseActivity {

    @ViewById(R.id.add_record)
    Button mAdd;

    @ViewById(R.id.remove_record)
    Button mRecord;

    @ViewById(R.id.update_record)
    Button mUpdate;

    @ViewById(R.id.list_all_record)
    RecyclerView mList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
    }

    @Click(R.id.add_record)
    void add() {
        LogUtils.d("add a record!");
    }

    @Click(R.id.remove_record)
    void remove() {
        LogUtils.d("remove a record!");
    }

    @Click(R.id.update_record)
    void update() {
        LogUtils.d("update a record!");
    }


}
