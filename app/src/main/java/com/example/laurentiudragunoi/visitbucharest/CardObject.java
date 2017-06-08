package com.example.laurentiudragunoi.visitbucharest;

/**
 * Created by Lavinia Dragunoi on 5/28/2017.
 */

public class CardObject {

    //Int variable for holding the Image Resource ID
    private int mImageResourceId;
    //String variable that will hold the name for each attraction or hotel
    private String mName;

    //String variable that will hold the business category name for each attraction or hotel
    private String mNameBusiness;

    //String variable that will hold the category(category of price or stars) for each attraction or hotel.
    private String mCategory;

    /**
     * Create a new CardObject .
     *
     * @param imageResourceId is the image displayed on each CardView
     * @param name            is the name of each attraction or hotel presented in each Fragment CardViews.
     * @param nameBusiness    is the category name of each attraction (museum/hotel/fastFood/restaurant...)
     * @param category        is the category in which business is in, ticket price or stars for the hotels.
     */
    public CardObject(int imageResourceId, String name, String nameBusiness, String category) {
        mImageResourceId = imageResourceId;
        mName = name;
        mNameBusiness = nameBusiness;
        mCategory = category;
    }

    @Override
    public String toString() {
        return "Card{" +
                "mImageResourceId='" + mImageResourceId + '\'' +
                ", mName='" + mName + '\'' +
                ", mNameBusiness=" + mNameBusiness +
                ", mCategory=" + mCategory +
                '}';
    }

    //Get the int variable for the image resource ID
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //Get the name of each business
    public String getName() {
        return mName;
    }

    //Get the name of the business category for each business
    public String getNameBusiness() {
        return mNameBusiness;
    }

    //Get the category tipe of each business
    public String getCategory() {
        return mCategory;
    }

}
