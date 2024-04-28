package com.example.SaziloCoding;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.programmingViewHolder> {

 private String[] data;
    public AdapterRecycler(String[] data) {this.data =data;}



    @NonNull
    @Override
    public programmingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.javarecycleview_row,parent, false);
        return new programmingViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull programmingViewHolder holder, int position) {
        String title = data[position];
        holder.topic.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public  class  programmingViewHolder extends  RecyclerView.ViewHolder{
        ImageView icon;
        TextView topic;
        public programmingViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.icon);
            topic = itemView.findViewById(R.id.topic);
        }
    }
}
