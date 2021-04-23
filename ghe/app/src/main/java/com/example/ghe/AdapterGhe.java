package com.example.ghe;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterGhe extends RecyclerView.Adapter<AdapterGhe.viewhover> {

    LayoutInflater layoutInflater;
    ArrayList<ghe> gheArrayList;
    Context context;

    public AdapterGhe(Context context, ArrayList<ghe> gheArrayList) {
        layoutInflater=LayoutInflater.from(context);
        this.gheArrayList = gheArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterGhe.viewhover onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=layoutInflater.inflate(R.layout.layout_item,parent,false);

        return new viewhover(view,this);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterGhe.viewhover holder, int position) {
        ghe ghe=gheArrayList.get(position);
        holder.ghe=ghe;
        holder.img1.setImageResource(ghe.getAnh1());
        holder.img2.setImageResource(ghe.getAnh2());
        holder.tvname1.setText(ghe.getName1());
        holder.tvname2.setText(ghe.getName2());
        holder.tvgia1.setText(ghe.getGia1());
        holder.tvgia2.setText(ghe.getGia2());
        holder.img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,newativity.class);
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return gheArrayList.size();
    }

    public class viewhover extends RecyclerView.ViewHolder{
        ghe ghe;
        AdapterGhe adapterGhe;
        TextView tvname1;
        TextView tvname2;
        TextView tvgia1;
        TextView tvgia2;
        ImageView img1;
        ImageView img2;

        public viewhover(@NonNull View itemView,AdapterGhe adapter) {
            super(itemView);
            tvname1=itemView.findViewById(R.id.tvname1);
            tvname2=itemView.findViewById(R.id.tvname2);
            tvgia1=itemView.findViewById(R.id.tvgia1);
            tvgia2=itemView.findViewById(R.id.tvgia2);
            img1=itemView.findViewById(R.id.img1);
            img2=itemView.findViewById(R.id.img2);
            this.adapterGhe=adapter;

        }
    }
}
