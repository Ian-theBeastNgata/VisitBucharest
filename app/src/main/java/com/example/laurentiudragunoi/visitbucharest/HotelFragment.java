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
public class HotelFragment extends Fragment {

    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page, container, false);

        //Create array for cardView
        final ArrayList<CardObject> card = new ArrayList<CardObject>();
        card.add(new CardObject(R.drawable.ramada, getString(R.string.ramada_name),
                getString(R.string.ramada_business), getString(R.string.ramada_adress),
                getString(R.string.ramada_web), getString(R.string.ramada_phone),
                getString(R.string.ramada_category), getString(R.string.ramada_description),
                getString(R.string.ramada_schedule)));
        card.add(new CardObject(R.drawable.radison, getString(R.string.radisson_name),
                getString(R.string.radisson_business), getString(R.string.radisson_adress),
                getString(R.string.radisson_web), getString(R.string.radisson_phone),
                getString(R.string.radisson_category), getString(R.string.radisson_description),
                getString(R.string.radisson_schedule)));
        card.add(new CardObject(R.drawable.mariott, getString(R.string.mariott_name),
                getString(R.string.mariott_business), getString(R.string.mariott_adress),
                getString(R.string.mariott_web), getString(R.string.mariott_phone),
                getString(R.string.mariott_category), getString(R.string.mariott_description),
                getString(R.string.mariott_schedule)));
        card.add(new CardObject(R.drawable.parkinn, getString(R.string.parkinn_name),
                getString(R.string.parkinn_business), getString(R.string.parkinn_adress),
                getString(R.string.parkinn_web), getString(R.string.parkinn_phone),
                getString(R.string.parkinn_category), getString(R.string.parkinn_description),
                getString(R.string.parkinn_schedule)));
        card.add(new CardObject(R.drawable.hotelroyal, getString(R.string.royal_name),
                getString(R.string.royal_business), getString(R.string.royal_adress),
                getString(R.string.royal_web), getString(R.string.royal_phone),
                getString(R.string.royal_category), getString(R.string.royal_description),
                getString(R.string.royal_schedule)));
        card.add(new CardObject(R.drawable.hotelunique, getString(R.string.unique_name),
                getString(R.string.unique_business), getString(R.string.unique_adress),
                getString(R.string.unique_web), getString(R.string.unique_phone),
                getString(R.string.unique_category), getString(R.string.unique_description),
                getString(R.string.unique_schedule)));

        // Create an {@link CardObjectAdapter}, that has the source the grid view.
        CardObjectAdapter cardAdapter = new CardObjectAdapter(getActivity(), card);

        //Find the grid View  and attach the adapter to the grid view.
        GridView gridView = (GridView) rootView.findViewById(R.id.grid_view);
        gridView.setAdapter(cardAdapter);

        return rootView;
    }

}
