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
public class KidsAttractionsFragment extends Fragment {


    public KidsAttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page, container, false);
        //Create array for cardView
        final ArrayList<CardObject> card = new ArrayList<CardObject>();

        card.add(new CardObject(R.drawable.zoo, "Bucharest ZOO", "ZOO", "$"));
        card.add(new CardObject(R.drawable.oraselulcunoasterii, "The city of knowledge", "Interactive museum", "$$$"));
        card.add(new CardObject(R.drawable.observator, "The Astronomical Observatory", "Astronomical observer", "$"));
        card.add(new CardObject(R.drawable.cfr, "C.F.R. Museum", "Museum", "$"));
        card.add(new CardObject(R.drawable.antipa, "The Antipa Museum", "Museum", "$"));
        card.add(new CardObject(R.drawable.kiseleff, "Kiseleff Park", "Park", "Free"));

        // Create an {@link CardObjectAdapter}, that has the source the grid view.
        CardObjectAdapter cardAdapter = new CardObjectAdapter(getActivity(), card);

        //Find the grid View  and attach the adapter to the grid view.
        GridView gridView = (GridView) rootView.findViewById(R.id.grid_view);
        gridView.setAdapter(cardAdapter);
        return rootView;
    }

}
