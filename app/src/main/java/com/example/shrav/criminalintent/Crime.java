package com.example.shrav.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by shrav on 10/23/2016.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    public Crime()
    {
        mId=UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}