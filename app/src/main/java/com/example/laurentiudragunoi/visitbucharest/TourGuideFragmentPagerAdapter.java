package com.example.laurentiudragunoi.visitbucharest;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Lavinia Dragunoi on 5/28/2017.
 */

public class TourGuideFragmentPagerAdapter extends FragmentPagerAdapter{
    final int PAGE_COUNT = 5;
    private String tabTitles[] = new String[] { "Hotel", "Food", "Attractions", "Night Life", "Kids Attractions"};
    private Context context;
    public TourGuideFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {getPageTitle(position);
            return new HotelFragment();
        } else if (position == 1){
            return new FoodFragment();
        } else if (position == 2){
            return new AttractionsFragment();
        } else if (position == 3){return new NightLifeFragment();
        } else {return new KidsAttractionsFragment();
        }
    }
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
