package com.example.lihaojuan.letusgodutch;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by lihaojuan on 17/3/6.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private  String[] mTitles = new String[]{"首页","发现","进货单"};

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        if (position == 1){
            return  new Fragment2();
        } else if (position == 2){
            return  new Fragment3();
        }
        return new Fragment1();
    }

    @Override
    public int getCount(){
        return mTitles.length;
    }

    @Override
    public  CharSequence getPageTitle(int position){
        return mTitles[position];
    }
}























