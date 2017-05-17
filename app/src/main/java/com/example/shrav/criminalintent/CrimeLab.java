package com.example.shrav.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by shrav on 10/30/2016.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;
    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }
    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
        Date d=new Date();
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setDate(d);
            crime.setSolved(i % 2 == 0); // Every other one
            mCrimes.add(crime);
        }
    }
    public void addCrime(Crime c) {
        mCrimes.add(c);
    }
    public List<Crime> getCrimes() {
        return mCrimes;
    }
    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getId().equals(id)) {
                return crime;
            }
        }
        return null;
    }


}
