package com.codepath.recyclerviewlab;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

/**
 * Created by mcfarkar on 10,October,2020
 */

// this class need to extend the regular VH class first
public class ArticleViewHolder extends RecyclerView.ViewHolder {
    TextView article_pub_date;
    TextView article_headline;
    TextView article_snippet;


    public ArticleViewHolder(@NonNull View itemView) {
        super(itemView);

        article_pub_date = itemView.findViewById(R.id.article_pub_date);
        article_headline = itemView.findViewById(R.id.article_headline);
        article_snippet = itemView.findViewById(R.id.article_snippet);




    }


}
