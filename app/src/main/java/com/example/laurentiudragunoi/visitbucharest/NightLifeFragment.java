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
public class NightLifeFragment extends Fragment {

    public NightLifeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page, container, false);
        //Create array for cardView
        final ArrayList<CardObject> card = new ArrayList<CardObject>();

        card.add(new CardObject(R.drawable.spiceclub, getString(R.string.spice_name),
                getString(R.string.spice_business), getString(R.string.spice_adress),
                getString(R.string.spice_web), getString(R.string.spice_phone),
                getString(R.string.spice_category), getString(R.string.spice_description),
                getString(R.string.spice_schedule)));
        card.add(new CardObject(R.drawable.oldies, getString(R.string.oldies_name),
                getString(R.string.oldies_business), getString(R.string.oldies_adress),
                getString(R.string.oldies_web), getString(R.string.oldies_phone),
                getString(R.string.oldies_category), getString(R.string.oldies_description),
                getString(R.string.oldies_schedule)));
        card.add(new CardObject(R.drawable.truesocialclub, getString(R.string.truesocial_name),
                getString(R.string.truesocial_business), getString(R.string.truesocial_adress),
                getString(R.string.truesocial_web), getString(R.string.truesocial_phone),
                getString(R.string.truesocial_category), getString(R.string.truesocial_description),
                getString(R.string.truesocial_schedule)));
        card.add(new CardObject(R.drawable.abelswinebar, getString(R.string.abel_name),
                getString(R.string.abel_business), getString(R.string.abel_adress),
                getString(R.string.abel_web), getString(R.string.abel_phone),
                getString(R.string.abel_category), getString(R.string.abel_description),
                getString(R.string.abel_schedule)));
        card.add(new CardObject(R.drawable.hangover, getString(R.string.hangover_name),
                getString(R.string.hangover_business), getString(R.string.hangover_adress),
                getString(R.string.hangover_web), getString(R.string.hangover_phone),
                getString(R.string.hangover_category), getString(R.string.hangover_description),
                getString(R.string.hangover_schedule)));

        // Create an {@link CardObjectAdapter}, that has the source the grid view.
        CardObjectAdapter cardAdapter = new CardObjectAdapter(getActivity(), card);

        //Find the grid View  and attach the adapter to the grid view.
        GridView gridView = (GridView) rootView.findViewById(R.id.grid_view);
        gridView.setAdapter(cardAdapter);

        return rootView;
    }

}
