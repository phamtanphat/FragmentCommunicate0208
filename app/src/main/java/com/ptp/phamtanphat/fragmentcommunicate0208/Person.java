package com.ptp.phamtanphat.fragmentcommunicate0208;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by KhoaPhamPC on 3/11/2017.
 */

public class Person implements Parcelable{
    private String ten;

    public Person(String ten) {
        this.ten = ten;
    }

    protected Person(Parcel in) {
        ten = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(ten);
    }
}
