package com.example.laurentiudragunoi.visitbucharest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            // Find the  FloatingButton that shows the Audio Activity.
            FloatingActionButton audioActivity = (FloatingActionButton) findViewById(R.id.audio_guide);

            //Set a click listener on the button if the audioActivity is not null.
            if (audioActivity != null) {
                audioActivity.setOnClickListener(new View.OnClickListener() {
                    //The cod will be executed when the search button will be clicked on.
                    @Override
                    public void onClick(View view) {
                        Intent audioGuideIntent = new Intent(MainActivity.this, AudioGuideActivity.class);
                        //Start the AudioGuideActivity.
                        startActivity(audioGuideIntent);
                    }

                });

                // Find the view pager that will allow the user to swipe between fragments
                ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

                // Create an adapter that knows which fragment should be shown on each page
                TourGuideFragmentPagerAdapter adapter = new TourGuideFragmentPagerAdapter(getBaseContext(),getSupportFragmentManager());

                // Set the adapter onto the view pager
                viewPager.setAdapter(adapter);

                // Give the TabLayout the ViewPager
                TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
                tabLayout.setupWithViewPager(viewPager);

            }
        }
    }


