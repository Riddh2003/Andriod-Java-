package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment3 extends Fragment {
    Button btn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_3, container, false);
        Bundle b = getArguments();
        String name = b.getString("name");
        String email = b.getString("email");
        Toast.makeText(getActivity(),"Name : "+name+"\nEmail : "+email,Toast.LENGTH_LONG).show();
        btn = v.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("name","RiddhModi");
                bundle.putString("email","riddhmodi2003@gmail.com");
                Fragment4 fragment4 = new Fragment4();
                fragment4.setArguments(bundle);
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.frmid,fragment4);
                ft.addToBackStack("back");
                ft.commit();
                Toast.makeText(getActivity(),"Welcome to Fragment4",Toast.LENGTH_LONG).show();
            }
        });
        return v;
    }
}