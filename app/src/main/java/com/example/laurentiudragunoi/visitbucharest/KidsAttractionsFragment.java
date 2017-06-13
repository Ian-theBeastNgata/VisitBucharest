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

        card.add(new CardObject(R.drawable.zoo, getString(R.string.zoo_name),
                getString(R.string.zoo_business), getString(R.string.zoo_adress),
                getString(R.string.zoo_web), getString(R.string.zoo_phone), getString(R.string.zoo_category),
                getString(R.string.zoo_description), getString(R.string.zoo_schedule)));
        card.add(new CardObject(R.drawable.oraselulcunoasterii, getString(R.string.knowledgecity_name),
                getString(R.string.knowledgecity_business), getString(R.string.knowledgecity_adress),
                getString(R.string.knowledgecity_web), getString(R.string.knowledgecity_phone),
                getString(R.string.knowledgecity_category), getString(R.string.knowledgecity_description),
                getString(R.string.knowledgecity_schedule)));
        card.add(new CardObject(R.drawable.observator, getString(R.string.observatory_name),
                getString(R.string.observatory_business), getString(R.string.observatory_adress),
                getString(R.string.observatory_web), getString(R.string.observatory_phone),
                getString(R.string.observatory_category), getString(R.string.observatory_description),
                getString(R.string.observatory_schedule)));
        card.add(new CardObject(R.drawable.cfr, getString(R.string.cfr_name), getString(R.string.cfr_business),
                getString(R.string.cfr_adress), getString(R.string.cfr_web), getString(R.string.cfr_phone),
                getString(R.string.cfr_category), getString(R.string.cfr_description),
                getString(R.string.cfr_schedule)));
        card.add(new CardObject(R.drawable.antipa, getString(R.string.antipa_name),
                getString(R.string.antipa_business), getString(R.string.antipa_adress),
                getString(R.string.antipa_web), getString(R.string.antipa_phone),
                getString(R.string.antipa_category), getString(R.string.antipa_description),
                getString(R.string.antipa_schedule)));
        card.add(new CardObject(R.drawable.kiseleff, getString(R.string.kiseleff_name),
                getString(R.string.kiseleff_business), getString(R.string.kiseleff_adress),
                getString(R.string.kiseleff_web), getString(R.string.kiseleff_phone),
                getString(R.string.kiseleff_category), getString(R.string.kiseleff_description),
                getString(R.string.kiseleff_schedule)));

        // Create an {@link CardObjectAdapter}, that has the source the grid view.
        CardObjectAdapter cardAdapter = new CardObjectAdapter(getActivity(), card);

        //Find the grid View  and attach the adapter to the grid view.
        GridView gridView = (GridView) rootView.findViewById(R.id.grid_view);
        gridView.setAdapter(cardAdapter);

        return rootView;
    }

}
