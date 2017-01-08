package com.rubahapi.sukapulsa.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.rubahapi.sukapulsa.RecentFragment;

/**
 * Created by junifar on 1/8/2017.
 */

public class DashboardFragmentAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;

    private Context context;
    private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3" };


    public DashboardFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return RecentFragment.newInstance("sample", "sample");
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
