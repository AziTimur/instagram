package com.example.instagram.profile;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class PagerAdapter extends FragmentStateAdapter {

    private ArrayList<Fragment> list;
    private String tabTitles[] = new String[] { "Tab1", "Tab2" };

    public PagerAdapter(@NonNull @NotNull Fragment fragment) {
        super(fragment);
    }

    public void setList(ArrayList<Fragment> list){
        this.list = new ArrayList<>();
        this.list.addAll(list);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment createFragment(int position) {
        return list.get(position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
