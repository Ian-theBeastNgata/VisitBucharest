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

        //Create array for cardView and for each cardView details.
        final ArrayList<CardObject> card = new ArrayList<CardObject>();

        card.add(new CardObject(R.drawable.casapoporului, getString(R.string.casapoporului_name),
                getString(R.string.casapoporuluui_business), getString(R.string.casapoporului_adress),
                getString(R.string.casapoporului_web), getString(R.string.casapoporului_phone),
                getString(R.string.casapoporului_category), getString(R.string.casapoporului_description),
                getString(R.string.casapoporului_schedule)));
        card.add(new CardObject(R.drawable.ateneulroman, getString(R.string.ateneulroman_name),
                getString(R.string.ateneulroman_business), getString(R.string.ateneulroman_adress),
                getString(R.string.ateneulroman_web), getString(R.string.ateneulroman_phone),
                getString(R.string.ateneulroman_category), getString(R.string.ateneulroman_description),
                getString(R.string.ateneulroman_schedule)));
        card.add(new CardObject(R.drawable.arculdetriumf, getString(R.string.arculdetriumf_name),
                getString(R.string.arculdetriumf_business), getString(R.string.arculdetriumf_adress),
                getString(R.string.arculdetriumf_web), getString(R.string.arculdetriumf_phone),
                getString(R.string.arculdetriumf_category), getString(R.string.arculdetriumf_description),
                getString(R.string.arculdetriumf_schedule)));
        card.add(new CardObject(R.drawable.palatulcotroceni, getString(R.string.cotroceni_name),
                getString(R.string.casapoporuluui_business), getString(R.string.cotroceni_adress),
                getString(R.string.cotroceni_web), getString(R.string.cotroceni_phone),
                getString(R.string.cotroceni_category), getString(R.string.cotroceni_description),
                getString(R.string.cotroceni_schedule)));
        card.add(new CardObject(R.drawable.muzeulgeorgeenescu, getString(R.string.enescu_name),
                getString(R.string.enescu_business), getString(R.string.enescu_adress),
                getString(R.string.enescu_web), getString(R.string.enescu_phone),
                getString(R.string.enescu_category), getString(R.string.enescu_description),
                getString(R.string.enescu_schedule)));

        // Create an {@link CardObjectAdapter}, that has the source the grid view.
        CardObjectAdapter cardAdapter = new CardObjectAdapter(getActivity(), card);

        //Find the grid View  and attach the adapter to the grid view.
        GridView gridView = (GridView) rootView.findViewById(R.id.grid_view);
        gridView.setAdapter(cardAdapter);

        return rootView;
    }

}
