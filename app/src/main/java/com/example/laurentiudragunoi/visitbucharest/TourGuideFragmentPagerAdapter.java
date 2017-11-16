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
    private Context mContext;
    public TourGuideFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
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
        } else {
            return new KidsAttractionsFragment();
        }
    }
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return mContext.getString(R.string.hotel_name);
            case 1:
                return mContext.getString(R.string.food_name);
            case 2:
                return mContext.getString(R.string.attraction_name);
            case 3:
                return mContext.getString(R.string.nightlife_name);
            case 4:
                return mContext.getString(R.string.kidsattractions_name);
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
