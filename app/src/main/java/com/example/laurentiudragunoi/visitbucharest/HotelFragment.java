package com.example.laurentiudragunoi.visitbucharest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
        card.add(new CardObject(R.drawable.ramada, "Ramada Majestic Bucharest", "Hotel", "4 - Stars"));
        card.add(new CardObject(R.drawable.radison, "Radisson Blu Hotel Bucharest", "Hotel", "5 - Stars"));
        card.add(new CardObject(R.drawable.mariott, "JW Marriott Bucharest", "Hotel", "5 - Stars"));
        card.add(new CardObject(R.drawable.parkinn, "Park Inn by Radisson Bucharest", "Hotel", "4 - Stars"));
        card.add(new CardObject(R.drawable.hotelroyal, "Royal Hotel Bucharest", "Hotel", "4 - Stars"));
        card.add(new CardObject(R.drawable.hotelunique, "Unique Bucharest", "Hotel", "4 - Stars"));

        // Create an {@link CardObjectAdapter}, that has the source the grid view.
        CardObjectAdapter cardAdapter = new CardObjectAdapter(getActivity(), card);

        //Find the grid View  and attach the adapter to the grid view.
       GridView gridView = (GridView) rootView.findViewById(R.id.grid_view);
        gridView.setAdapter(cardAdapter);

        //Set onClickListener on each CardViewObject, when is clicked on the CardView will open
        // the DetailCard object that will display all business details for each hotel or attraction.
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //get the {@link CardObject} object at the given position the user clicked on
                CardObject cardView = card.get(position);

                //On click it will be detailObject opened with intent.
                

            }

        });
        return rootView;
    }

}
