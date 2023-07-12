package com.example.bottom_nav_with_tabs;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Adapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;
    public Adapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        // you can define tabs as per your choice
        switch (position) {
            case 0:
                Tab1 tab_one = new Tab1();
                return tab_one;
            case 1:
                Tab2 tab_two = new Tab2();
                return tab_two;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
