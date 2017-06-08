package com.example.laurentiudragunoi.visitbucharest;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lavinia Dragunoi on 6/8/2017.
 */

public class DetailCardAdapter extends ArrayAdapter<DetailCard> {

    public DetailCardAdapter(Activity context, ArrayList<DetailCard> details) {
        super(context, 0, details);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View detailsListItemView = convertView;

        if (detailsListItemView == null) {
            detailsListItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_details, parent, false);
        }
        //Find the view where the image will be displayed
        ImageView imageView = (ImageView) detailsListItemView.findViewById(R.id.big_image);
        DetailCard currentDetailsCard = getItem(position);
        imageView.setImageResource(currentDetailsCard.getmImageResourceId());


        //Find the TextView in the activity_details.xml layout with the ID name
        TextView name = (TextView) detailsListItemView.findViewById(R.id.name);
        // Get the name from the current DetailCard object and
        // set this text on the Image view at the current position
        currentDetailsCard = getItem(position);
        name.setText(currentDetailsCard.getmName());

        //Find the TextView in the activity_details.xml layout with the ID localization
        TextView map = (TextView) detailsListItemView.findViewById(R.id.localization);
        // Get the name from the current DetailCard object and
        // set this text on the Image and text View name at the current position
        currentDetailsCard = getItem(position);
        map.setText(currentDetailsCard.getmLocalization());

        //Find the TextView in the activity_details.xml layout with the ID website
        TextView web = (TextView) detailsListItemView.findViewById(R.id.website);
        // Get the name from the current DetailCard object and
        // set this text on the Image view, name and localization at the current position
        currentDetailsCard = getItem(position);
        web.setText(currentDetailsCard.getmWebsite());

        //Find the TextView in the activity_details.xml layout with the ID phone
        TextView phoneNumber = (TextView) detailsListItemView.findViewById(R.id.phone);
        // Get the name from the current DetailCard object and
        // set this text on the Image view, name, localization and website at the current position
        currentDetailsCard = getItem(position);
        phoneNumber.setText(currentDetailsCard.getmPhone());

        //Find the TextView in the activity_details.xml layout with the ID category_business
        TextView category = (TextView) detailsListItemView.findViewById(R.id.category_business);
        // Get the name from the current DetailCard object and
        // set this text on the Image view, name, localization, website and phone at the current position
        currentDetailsCard = getItem(position);
        category.setText(currentDetailsCard.getmCategory());

        //Find the TextView in the activity_details.xml layout with the ID description
        TextView description = (TextView) detailsListItemView.findViewById(R.id.description);
        // Get the name from the current DetailCard object and
        // set this text on the Image view, name, localization, website, phone and category at the current position
        currentDetailsCard = getItem(position);
        description.setText(currentDetailsCard.getmDescription());

        //Find the TextView in the activity_details.xml layout with the ID business_hours
        TextView schedule = (TextView) detailsListItemView.findViewById(R.id.business_hours);
        // Get the name from the current DetailCard object and
        // set this text on the Image view, name, localization, website, phone, category and description at the current position
        currentDetailsCard = getItem(position);
        schedule.setText(currentDetailsCard.getmBusinessHours());

            return super.getView(position, convertView, parent);

    }
}
