package com.example.shashank.loginfirebase.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.shashank.loginfirebase.ItemClickListener;
import com.example.shashank.loginfirebase.R;

public class CategoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView txtCategoryName, txtCategoryMeasure;


    private ItemClickListener itemClickListener;
    public CategoryViewHolder(View itemView) {
        super(itemView);

        txtCategoryName = (TextView) itemView.findViewById(R.id.category_name);
        txtCategoryMeasure = (TextView) itemView.findViewById(R.id.category_measure);

        itemView.setOnClickListener(this);

    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {

        itemClickListener.onClick(view,getAdapterPosition(),false);
    }
}
