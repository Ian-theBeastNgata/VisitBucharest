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
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page, container, false);

        //Create array for cardView
        final ArrayList<CardObject> card = new ArrayList<CardObject>();

        card.add(new CardObject(R.drawable.casapoporului, "Palace of the Parliament", "Architectural attraction", "$"));
        card.add(new CardObject(R.drawable.ateneulroman, "Romanian Athenaeum", "Concert hall", "$$"));
        card.add(new CardObject(R.drawable.arculdetriumf, "The Arc of Triomf", "Monument", "$"));
        card.add(new CardObject(R.drawable.palatulcotroceni, "Cotroceni Palace", "Museum", "$$"));
        card.add(new CardObject(R.drawable.muzeulgeorgeenescu, "The National Museum “George Enescu", "Museum", "$"));

        // Create an {@link CardObjectAdapter}, that has the source the grid view.
        CardObjectAdapter cardAdapter = new CardObjectAdapter(getActivity(), card);

        //Find the grid View  and attach the adapter to the grid view.
        GridView gridView = (GridView) rootView.findViewById(R.id.grid_view);
        gridView.setAdapter(cardAdapter);
        return rootView;
    }

}
