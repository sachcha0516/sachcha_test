package com.example.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    public TextView stName, phNo, Address;
    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        stName=itemView.findViewById(R.id.stName);
        phNo=itemView.findViewById(R.id.phNo);
        Address=itemView.findViewById(R.id.Address);
    }
}
