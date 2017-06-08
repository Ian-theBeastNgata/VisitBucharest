package com.example.laurentiudragunoi.visitbucharest;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static android.media.AudioManager.AUDIOFOCUS_REQUEST_GRANTED;

public class AudioGuideActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private MediaPlayer mMediaPlayer;
    private AudioManager mAudioManager;
    //This is listener gets triggered when the {@link MediaPlayer} has completed the playing the audio file
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };
    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener =
            new AudioManager.OnAudioFocusChangeListener() {

                @Override
                public void onAudioFocusChange(int focusChange) {
                    if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
                            focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK){
                        //Pause playback
                        mMediaPlayer.pause();
                        mMediaPlayer.seekTo(0);
                    }
                    else {if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
                        //The AUDIOFOCUS_GAIN case means we have regained focus can Resume playback
                        mMediaPlayer.start();
                    }
                    else if (focusChange == AudioManager.AUDIOFOCUS_LOSS){
                        //The AUDIOFOCUS_LOSS case means we've lost audio focus and stop playback
                        //and clean up resources
                        releaseMediaPlayer();
                    }
                    }
                }
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_guide);

        //Create and setup the {@link AudioManager} to request audio focus
        mAudioManager = (AudioManager) AudioGuideActivity.this.getSystemService(Context.AUDIO_SERVICE);
        //Create the array list with the romanian expressions.
        final ArrayList<AudioObject> audio = new ArrayList<AudioObject>();
        audio.add(new AudioObject("Good morning!", "Buna dimineata!", R.raw.bunadimineata));
        audio.add(new AudioObject("Hello!", "Buna ziua!", R.raw.bunaziua));
        audio.add(new AudioObject("Hello!", "Salut!", R.raw.salut));
        audio.add(new AudioObject("Good evening!", "Buna seara!", R.raw.bunaseara));
        audio.add(new AudioObject("Good night!", "Noapte buna!", R.raw.noaptebuna));
        audio.add(new AudioObject("Excuse me!", "Ma scuzati!", R.raw.mascuati));
        audio.add(new AudioObject("Thank you!", "Multumesc!", R.raw.multumesc));
        audio.add(new AudioObject("Goodbye", "La revedere!", R.raw.larevedere));

        //Create the itemAdapter for the listView that will display the expression.
        AudioObjectAdapter itemAdapter = new AudioObjectAdapter(AudioGuideActivity.this, audio);

        //Find the listView witch is decared in audio_list.xml.
        ListView audioListView = (ListView) findViewById(R.id.list);

        //This will make the listView to have all the needed items that are set by the Adapter.
        audioListView.setAdapter(itemAdapter);

        //This will put on each list item a click listener to play audio.
        audioListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //get the {@link word} object at the given position the user clicked on
                AudioObject audioObject = audio.get(position);
                //Request audio focus for playback
                int result = mAudioManager.requestAudioFocus(mOnAudioFocusChangeListener,
                        //Use the music stream
                        AudioManager.STREAM_MUSIC,
                        //  Request permanent focus
                        AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
                if (result == AUDIOFOCUS_REQUEST_GRANTED) {
                    //We have audio focus now.

                    //Release the media player if it currently  exists because we are about to
                    //play a different sound file.
                    releaseMediaPlayer();
                    //Create  and setup the {@link MediaPlayer}  for the audio resource associated
                    //with the current word
                    mediaPlayer = MediaPlayer.create(AudioGuideActivity.this, audioObject.getmAudioResourceId());
                    //Start audio file
                    mediaPlayer.start();
                    //Set up a listener on the media player, so that we can stop and release the
                    //media player once the sounds has finished playing.
                    mediaPlayer.setOnCompletionListener(mCompletionListener);
                }
            }
        });
    }
    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
            //Regardless of whether or not we were granted audio focus, abandon it. This is also
            //unregisters the AudioFocusChangeListener so we don't get anymore callbacks.
            mAudioManager.abandonAudioFocus(mOnAudioFocusChangeListener);
        }
    }
}
