package com.example.laurentiudragunoi.visitbucharest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page, container, false);

        //Create array for cardView
        final ArrayList<CardObject> card = new ArrayList<CardObject>();

        card.add(new CardObject(R.drawable.fitocafefloreasca, getString(R.string.fitofloreasca_name),
                getString(R.string.fitofloreasca_business), getString(R.string.fitofloreasca_adress),
                getString(R.string.fitofloreasca_web), getString(R.string.fitofloreasca_phone),
                getString(R.string.fitofloreasca_category), getString(R.string.fitofloreasca_description),
                getString(R.string.fitofloreasca_schedule)));
        card.add(new CardObject(R.drawable.fitocafevictoriei, getString(R.string.fitovictoriei_name),
                getString(R.string.fitovictoriei_business), getString(R.string.fitovictoriei_adress),
                getString(R.string.fitovictoriei_web), getString(R.string.fitovictoriei_phone),
                getString(R.string.fitovictoriei_category), getString(R.string.fitovictoriei_description),
                getString(R.string.fitovictoriei_schedule)));
        card.add(new CardObject(R.drawable.chefsfloreasca, getString(R.string.chefs_name),
                getString(R.string.chefs_business), getString(R.string.chefs_adress),
                getString(R.string.chefs_web), getString(R.string.chefs_phone),
                getString(R.string.chefs_category), getString(R.string.chefs_description),
                getString(R.string.chefs_schedule)));
        card.add(new CardObject(R.drawable.victoriei18, getString(R.string.victoriei_name),
                getString(R.string.victoriei_business), getString(R.string.victoriei_adress),
                getString(R.string.victoriei_web), getString(R.string.victoriei_phone),
                getString(R.string.victoriei_category), getString(R.string.victoriei_description),
                getString(R.string.victoriei_schedule)));
        card.add(new CardObject(R.drawable.boccalupo, getString(R.string.boccalupo_name),
                getString(R.string.boccalupo_business), getString(R.string.boccalupo_adress),
                getString(R.string.boccalupo_web), getString(R.string.boccalupo_phone),
                getString(R.string.boccalupo_category), getString(R.string.boccalupo_description),
                getString(R.string.boccalupo_schedule)));

        // Create an {@link CardObjectAdapter}, that has the source the grid view.
        CardObjectAdapter cardAdapter = new CardObjectAdapter(getActivity(), card);

        //Find the grid View  and attach the adapter to the grid view.
        GridView gridView = (GridView) rootView.findViewById(R.id.grid_view);
        gridView.setAdapter(cardAdapter);

        return rootView;
    }

}
