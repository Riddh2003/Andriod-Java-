package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.Myclass>{
    Context context;
    ArrayList<User> arrayList;
    public RVAdapter(Context context,ArrayList<User> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public Myclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mycustom,parent,false);
        return new Myclass(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Myclass holder, int position) {
        holder.tx1.setText(arrayList.get(position).getFname());
        holder.tx2.setText(arrayList.get(position).getLname());
        holder.tx4.setText(arrayList.get(position).getPassword());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class Myclass extends RecyclerView.ViewHolder{
        TextView tx1,tx2,tx3,tx4;
        public Myclass(@NonNull View itemView) {
            super(itemView);
            tx1 = itemView.findViewById(R.id.textView1);
            tx2 = itemView.findViewById(R.id.textView2);
            tx3 = itemView.findViewById(R.id.textView3);
        }
    }
}