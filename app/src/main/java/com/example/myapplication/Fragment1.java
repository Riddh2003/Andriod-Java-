package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment1 extends Fragment {
    Button btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_1, container, false);
        btn = v.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("name","RiddhModi");
                bundle.putString("email","riddhmodi2003@gmail.com");
                Fragment2 fragment2 = new Fragment2();
                fragment2.setArguments(bundle);
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.frmid,fragment2);
                ft.addToBackStack("back");
                ft.commit();
                Toast.makeText(getActivity(),"Welcome to Fragment2",Toast.LENGTH_LONG).show();
            }
        });
        return v;
    }
}