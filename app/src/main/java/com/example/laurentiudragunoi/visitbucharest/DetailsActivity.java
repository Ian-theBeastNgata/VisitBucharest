package com.example.laurentiudragunoi.visitbucharest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //Declaration for the Arraylist of details for each cardView.
        final ArrayList<DetailCard> details = new ArrayList<DetailCard>();
        details.add(new DetailCard(R.drawable.ramada,"Ramada Majestic Bucharest",
                "Calea Victoriei 38-40, Sector 1, Bucharest", "http://www.ramadamajestic.ro",
                "40 21 310 2335", "4 - Stars", "Ramada Majestic Bucharest Hotel is located at " +
                "the “0” Km of Bucharest, in the business, financial, cultural and shopping centre " +
                "of Bucharest, closely to “Universitatii Square”, considered “the heart of " +
                "Bucharest”, on Calea Victoriei, one of the oldest main street in Bucharest, the" +
                " site of many monuments and important institutions. ", "Non stop"));
        details.add(new DetailCard(R.drawable.radison,"Radisson Blu Hotel Bucharest",
                "Calea Victoriei 63 - 81, Sector 1, Bucharest", "https://www.radissonblu.com",
                "40 21 311 9000", "5 - Stars", "Rest well in sumptuous  5-star accommodation in" +
                " an enviable site by Cismigiu Park. Our hotel features 487 well-appointed rooms" +
                " and suites featuring the creativity of architect Uri Blumenthal and designer " +
                "Buki Zuker. Guests benefit from aesthetic appeal as well as modern amenities " +
                "such as a SMART LED TV and Free high-speed, wireless Internet. ", "Non stop"));

    }
}
