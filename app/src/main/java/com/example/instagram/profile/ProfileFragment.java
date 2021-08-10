package com.example.instagram.profile;

import android.os.Bundle;


import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


import java.util.ArrayList;


public class ProfileFragment extends Fragment {

    private ViewPager2 viewPager;
    private PagerAdapter adapter;
    private ArrayList<Fragment> list;
    private TabLayout tabLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();

        initVP(view);

        setupTabIcons();
    }


    private void createList() {
        list = new ArrayList<>();
        list.add(new VPFragment1());
        list.add(new VPFragment2());
    }


    private void initVP(View view) {
        viewPager = view.findViewById(R.id.viewPagerProf);
        adapter = new PagerAdapter(this);
        adapter.setList(list);
        viewPager.setAdapter(adapter);
        tabLayout = view.findViewById(R.id.tabProf);


    }

    private void setupTabIcons() {
        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            if (position == 0) {
                tab.setIcon(R.drawable.ic_baseline_grid_on_24);

            } else {
                tab.setIcon(R.drawable.ic_shape);
            }

        }).attach();
    }
}