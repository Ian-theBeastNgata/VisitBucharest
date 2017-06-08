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
        CardObject currentCardView = getItem(position);
        imageView.setImageResource(currentCardView.getImageResourceId());


        //Find the TextView in the list_item.xml layout with the ID name
        TextView name = (TextView) listItemView.findViewById(R.id.name);
        // Get the name from the current CardView object and
        // set this text on the Image view at the current position
        currentCardView = getItem(position);
        name.setText(currentCardView.getName());

        //Find the TextView in the list_item.xml layout with the ID name_business
        TextView nameBusiness = (TextView) listItemView.findViewById(R.id.name_business);
        // Get the  name of the business from the current Card object and
        // set this text on the Image view at the current position
        currentCardView = getItem(position);
        nameBusiness.setText(currentCardView.getNameBusiness());

        //Find the TextView in the list_item.xml layout with the ID category
        TextView category = (TextView) listItemView.findViewById(R.id.category);
        // Get the category name from the current CardView object and
        // set this text on the Image view at the current position
        currentCardView = getItem(position);
        category.setText(currentCardView.getCategory());

        return listItemView;
    }
}
