package com.example.ngoclinhtruong.baseapplicationform.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ngoclinhtruong.baseapplicationform.R;

/**
 * Created by Truong on 9/20/16 - 23:07.
 * Description:
 */
public class PagerFragment extends Fragment {

    public static PagerFragment newInstance(int pos) {

        Bundle args = new Bundle();
        args.putInt("pos", pos);

        PagerFragment fragment = new PagerFragment();
        fragment.setArguments(args);
        return fragment;
    }

    private View mRootView;
    private TextView mTitle;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.pager_fragment, null, false);
        mTitle = (TextView) mRootView.findViewById(R.id.title);

        int pos = getArguments().getInt("pos");

        mTitle.setText(pos + "");

        return mRootView;
    }

}
