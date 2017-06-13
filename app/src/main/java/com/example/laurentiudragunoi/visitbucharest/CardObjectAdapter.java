package com.example.laurentiudragunoi.visitbucharest;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lavinia Dragunoi on 5/28/2017.
 */

public class CardObjectAdapter extends ArrayAdapter<CardObject> {

    public CardObjectAdapter(Activity context, ArrayList<CardObject> card) {
        super(context, 0, card);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Find the image in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        final CardObject currentCardView = getItem(position);
        imageView.setImageResource(currentCardView.getImageResourceId());

        //Find the TextView in the list_item.xml layout with the ID name
        TextView name = (TextView) listItemView.findViewById(R.id.name);
        // Get the name from the current CardView object and
        // set this text on the Image view at the current position
        name.setText(currentCardView.getName());

        //Find the TextView in the list_item.xml layout with the ID name_business
        TextView nameBusiness = (TextView) listItemView.findViewById(R.id.name_business);
        // Get the  name of the business from the current Card object and
        // set this text on the Image view at the current position
        nameBusiness.setText(currentCardView.getNameBusiness());

        //Find the TextView in the list_item.xml layout with the ID category
        TextView category = (TextView) listItemView.findViewById(R.id.category);
        // Get the category name from the current CardView object and
        // set this text on the Image view at the current position
        category.setText(currentCardView.getCategory());

        // * Set a click listener on the card to open the details activity
        // * Pass the data that you need as string extras
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DetailsActivity.class);
                intent.putExtra("name", currentCardView.getName());
                intent.putExtra("image", currentCardView.getImageResourceId());
                intent.putExtra("localization", currentCardView.getmLocalization());
                intent.putExtra("website", currentCardView.getmWebsite());
                intent.putExtra("phone", currentCardView.getmPhone());
                intent.putExtra("category", currentCardView.getCategory());
                intent.putExtra("businessHours", currentCardView.getmBusinessHours());
                intent.putExtra("description", currentCardView.getmDescription());
                //On click it will be detailObject opened with intent.
                getContext().startActivity(intent);
            }
        });

        return listItemView;
    }
}
