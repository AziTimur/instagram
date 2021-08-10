package com.example.instagram.profile;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram.R;
import com.example.instagram.databinding.FragmentVP1Binding;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;


public class VPFragment1 extends Fragment {
    private ArrayList<ModelGridlayot>list;
    private AdapterRV1 adapter;
    private RecyclerView recyclerView;
    private FragmentVP1Binding binding;

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter=new AdapterRV1();
        getImage();
    }

    private void getImage() {
        list=new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            list.add(new ModelGridlayot(R.drawable.ned,R.drawable.robb1,R.drawable.aria1,R.drawable.jhon));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      binding= FragmentVP1Binding.inflate(inflater,container,false);
      return  binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycle(view);
    }

    private void initRecycle(View view) {
        recyclerView=view.findViewById(R.id.vp1RV);
        recyclerView.setAdapter(adapter);
        adapter.setList(list);

    }
}