package com.rubahapi.sukapulsa;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.rubahapi.sukapulsa.adapter.DashboardFragmentAdapter;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new DashboardFragmentAdapter(getSupportFragmentManager(), DashboardActivity.this));

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tab);
        tabLayout.setupWithViewPager(viewPager);
    }
}
