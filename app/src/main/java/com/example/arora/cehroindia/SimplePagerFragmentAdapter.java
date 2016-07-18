package com.example.arora.cehroindia;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by arora on 18/7/16.
 */

public class SimplePagerFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public SimplePagerFragmentAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new overViewFragment();
        } else if (position == 1){
            return new OurVisionFragment();
        } else {
            return new OurTeamFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Over);
        } else if (position == 1) {
            return mContext.getString(R.string.vision);
        } else {
            return mContext.getString(R.string.Team);
        }
    }
}
