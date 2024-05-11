package com.example.myapplication.Entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Student_Registry")
public class User {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name= "st_ID")
    private int stID;

    @NonNull
    @ColumnInfo(name = "st_Name")
    private String stName;

    @NonNull
    @ColumnInfo(name = "phn_No")
    private String phn_No;

    @NonNull
    @ColumnInfo(name = "Address")
    private String Address;

    public User() {
    }

    public int getStID() {
        return stID;
    }

    public void setStID(int stID) {
        this.stID = stID;
    }

    @NonNull
    public String getStName() {
        return stName;
    }

    public void setStName(@NonNull String stName) {
        this.stName = stName;
    }

    public String getPhn_No() {
        return phn_No;
    }

    public void setPhn_No(String phn_No) {
        this.phn_No = phn_No;
    }

    @NonNull
    public String getAddress() {
        return Address;
    }

    public void setAddress(@NonNull String address) {
        Address = address;
    }
}
