package com.example.laurentiudragunoi.visitbucharest;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lavinia Dragunoi on 6/8/2017.
 */

public class AudioObjectAdapter extends ArrayAdapter<AudioObject> {
    public AudioObjectAdapter(Activity context, ArrayList<AudioObject> audio) {
        super(context, 0, audio);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Find the textView in the audio_item.xml layout

        View audioListView = convertView;
        if (audioListView == null) {
            audioListView = LayoutInflater.from(getContext()).inflate(R.layout.audio_item, parent, false);
        }
        //Find the TextView in the audio_item.xml layout with the ID english_text_view
        TextView englishTextView = (TextView) audioListView.findViewById(R.id.english_text_view);
        // Get and set text in the current position for each expression.
        AudioObject currentAudio = getItem(position);
        englishTextView.setText(currentAudio.getmEnglishTranslation());

        //Find the TextView in the audio_item.xml layout with the ID romanian_text_view
        TextView romanianTextView = (TextView) audioListView.findViewById(R.id.romanian_text_view);
        // Get and set text in the current position for each expression.
        currentAudio = getItem(position);
        romanianTextView.setText(currentAudio.getmRomanianTranslation());

        return audioListView;
    }
}

