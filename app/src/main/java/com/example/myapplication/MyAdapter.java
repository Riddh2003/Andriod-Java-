package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Myclass> {
    Context context;
    int image[];
    String name[];
    String time[];
    MyAdapter(Context context,int image[],String name[],String time[]){
        this.context = context;
        this.image = image;
        this.name = name;
        this.time = time;
    }
    @NonNull
    @Override
    public Myclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mycustom,parent,false);
        return new Myclass(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Myclass holder, int position) {
        holder.iv.setImageResource(image[position]);
        holder.tv1.setText(name[position]);
        holder.tv2.setText(time[position]);
    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    class Myclass extends RecyclerView.ViewHolder{
        ImageView iv;
        TextView tv1,tv2;
        public Myclass(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.imageView1);
            tv1 = itemView.findViewById(R.id.textView1);
            tv2 = itemView.findViewById(R.id.textView2);
        }
    }
}
