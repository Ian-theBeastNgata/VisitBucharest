package com.example.laurentiudragunoi.visitbucharest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        final String detailName = intent.getStringExtra("name");
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        int imageId = extras.getInt("image");

        ImageView imageBig = (ImageView) findViewById(R.id.big_image);

        imageBig.setImageResource(imageId);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(detailName);

        final String localization = intent.getStringExtra("localization");
        final TextView localizationDetail = (TextView) findViewById(R.id.localization);
        localizationDetail.setText(localization);

        final String website = intent.getStringExtra("website");
        TextView webDetail = (TextView) findViewById(R.id.website);
        webDetail.setText(website);

        webDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //open web page
                Uri webpage = Uri.parse(website);
                Intent webintent = new Intent(Intent.ACTION_VIEW, webpage);
                if (webintent.resolveActivity(getPackageManager()) != null) {
                    startActivity(webintent);
                }
            }
        });
        String phone = intent.getStringExtra("phone");
        TextView phoneDetail = (TextView) findViewById(R.id.phone);
        phoneDetail.setText(phone);

        String category = intent.getStringExtra("category");
        TextView categoryDetail = (TextView) findViewById(R.id.category_business);
        categoryDetail.setText(category);

        String schedule = intent.getStringExtra("businessHours");
        TextView scheduleDetail = (TextView) findViewById(R.id.business_hours);
        scheduleDetail.setText(schedule);

        final String description = intent.getStringExtra("description");
        TextView descriptionDetail = (TextView) findViewById(R.id.description);
        descriptionDetail.setText(description);

        // Find the  FloatingButton that shows the Share button.
        FloatingActionButton share = (FloatingActionButton) findViewById(R.id.share_button);

        //Set a click listener on the button if the share is not null.
        if (share != null) {
            share.setOnClickListener(new View.OnClickListener() {
                //The cod will be executed when the search button will be clicked on.
                @Override
                public void onClick(View view) {
                    Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                    sharingIntent.setType("text/plain");
                    String shareBody = detailName + " " + website + " " + " " + localization;
                    sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
                    sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                    startActivity(Intent.createChooser(sharingIntent, "Share"));
                }

            });

        }

    }

}
