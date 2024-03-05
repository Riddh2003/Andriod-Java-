package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class Fragment5 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_5, container, false);
        Bundle b = getArguments();
        String name = b.getString("name");
        String email = b.getString("email");
        Toast.makeText(getActivity(),"Name : "+name+"\nEmail : "+email,Toast.LENGTH_LONG).show();
        return v;
    }
}