package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
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
    public void onBindViewHolder(@NonNull Myclass holder, @SuppressLint("RecyclerView") int position) {
        holder.tx1.setText(arrayList.get(position).getFname());
        holder.tx2.setText(arrayList.get(position).getLname());
        holder.tx3.setText(arrayList.get(position).getPassword());
        holder.itemView.setOnCreateContextMenuListener(new View.OnCreateContextMenuListener() {
            @Override
            public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
                MenuItem m1 = menu.add(0,0,0,"Update");
                MenuItem m2 = menu.add(0,1,0,"Delete");
                m1.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(@NonNull MenuItem item) {
                        Intent i = new Intent(context,UpdateData.class);
                        i.putExtra("id",arrayList.get(position).getId());
                        i.putExtra("fname",arrayList.get(position).getFname());
                        i.putExtra("lname",arrayList.get(position).getLname());
                        i.putExtra("pass",arrayList.get(position).getPassword());
                        context.startActivity(i);
                        return false;
                    }
                });
                m2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(@NonNull MenuItem item) {
                        DBHelper dbHelper = new DBHelper(context);
                        dbHelper.delete(arrayList.get(position).getId());
                        return false;
                    }
                });
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class Myclass extends RecyclerView.ViewHolder{
        TextView tx1,tx2,tx3;
        public Myclass(@NonNull View itemView) {
            super(itemView);
            tx1 = itemView.findViewById(R.id.textView1);
            tx2 = itemView.findViewById(R.id.textView2);
            tx3 = itemView.findViewById(R.id.textView3);
        }
    }
}