package com.tiltedhat.newsfeedapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    TextView text_title, text_source;
    CardView cardView;
    ImageView img_headline;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);


        text_title = itemView.findViewById(R.id.text_title);
        text_source = itemView.findViewById(R.id.text_source);
        cardView = itemView.findViewById(R.id.main_container);
        img_headline = itemView.findViewById(R.id.img_headline);
    }


}
