package com.sdklogin.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 1006258 on 4/18/2016.
 */
public class FBUser implements Parcelable{
    String name;
    int sno;
    String fbid;

    public FBUser() {
    }

    public FBUser(String fbid, int sno, String name) {
        this.fbid = fbid;
        this.sno = sno;
        this.name = name;
    }

    protected FBUser(Parcel in) {
        name = in.readString();
        sno = in.readInt();
        fbid = in.readString();
    }

    public static final Creator<FBUser> CREATOR = new Creator<FBUser>() {
        @Override
        public FBUser createFromParcel(Parcel in) {
            return new FBUser(in);
        }

        @Override
        public FBUser[] newArray(int size) {
            return new FBUser[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getFbid() {
        return fbid;
    }

    public void setFbid(String fbid) {
        this.fbid = fbid;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(sno);
        dest.writeString(fbid);
    }
}

