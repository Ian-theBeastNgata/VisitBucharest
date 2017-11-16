package com.example.laurentiudragunoi.visitbucharest;

/**
 * Created by Lavinia Dragunoi on 5/28/2017.
 */

public class CardObject {

    //Int variable for holding the Image Resource ID
    private int mImageResourceId;

    //String variable that will hold the name for each attraction or hotel
    private String mName;

    //String variable that will hold the localization for each attraction or hotel.
    private String mLocalization;

    //String variable that will hold the website for each attraction or hotel.
    private String mWebsite;

    //String variable that will hold the phone for each attraction or hotel.
    private String mPhone;

    //String variable that will hold the business category name for each attraction or hotel
    private String mNameBusiness;

    //String variable that will hold the category(category of price or stars) for each attraction
    // or hotel.
    private String mCategory;

    //String variable that will hold the description for each attraction or hotel.
    private String mDescription;

    //String variable that will hold the business hours for each attraction or hotel.
    private String mBusinessHours;

    /**
     * Create a CardObject
     *
     * @param imageResourceId an int variable that will retain the integer image resource ID
     * @param name            the name of the business that will be detailed in this object
     * @param localization    the localization of the business that will be detailed in this object
     * @param website         the website of the business that will be detailed in this object
     * @param phone           the phone of the business that will be detailed in this object
     * @param category        the category of the business that will be detailed in this object
     * @param description     the description of the business that will be detailed in this object
     * @param businessHours   the business Hours of the business that will be detailed in this object
     */
    public CardObject(int imageResourceId, String name, String nameBusiness, String localization, String website,
                      String phone, String category, String description, String businessHours) {

        mImageResourceId = imageResourceId;
        mName = name;
        mNameBusiness = nameBusiness;
        mLocalization = localization;
        mWebsite = website;
        mPhone = phone;
        mCategory = category;
        mDescription = description;
        mBusinessHours = businessHours;
    }



    //Get the int variable for the image resource ID
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //Get the name of each business

    public String getmLocalization() {
        return mLocalization;
    }

    public String getmWebsite() {
        return mWebsite;
    }

    public String getmPhone() {
        return mPhone;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmBusinessHours() {
        return mBusinessHours;
    }

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
