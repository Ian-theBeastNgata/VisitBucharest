package com.example.laurentiudragunoi.visitbucharest;

/**
 * Created by Lavinia Dragunoi on 6/8/2017.
 */

public class AudioObject {
    //English Translation for the expression.
    private String mEnglishTranslation;

    //Romanian Translation for the expression.
    private String mRomanianTranslation;

    //Int variable for the audio file resource ID to hold.
    private int mAudioResourceId;

    /**Create the new object with
     *
     * @param englishTranslation is the expression written in English
     * @param romanianTranslation is the Romanian version of the expresion
     * @param audioResourceId is the int variable that has the audio resource ID.
     */

    public AudioObject (String englishTranslation, String romanianTranslation, int audioResourceId) {

        mEnglishTranslation = englishTranslation;
        mRomanianTranslation = romanianTranslation;
        mAudioResourceId = audioResourceId;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "mEnglishTranslation='" + mEnglishTranslation + '\'' +
                ", mRomanianTranslation='" + mRomanianTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }

    public String getmEnglishTranslation() {
        return mEnglishTranslation;
    }

    public String getmRomanianTranslation() {
        return mRomanianTranslation;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}
