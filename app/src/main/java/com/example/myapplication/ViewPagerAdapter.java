package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<Fragment>  arrayList = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }
    void addFragment(Fragment fragment,String title){
        arrayList.add(fragment);
        name.add(title);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return arrayList.get(position);
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return name.get(position);
    }
}
