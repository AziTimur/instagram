package com.example.instagram.likes;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram.R;
import com.example.instagram.databinding.FragmentLikesBinding;

import java.util.ArrayList;


public class LikesFragment extends Fragment {

    FragmentLikesBinding binding;
    private ArrayList<LikeModel> list;
    private RecyclerView recyclerView;
    private LikeAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter=new LikeAdapter();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding=FragmentLikesBinding.inflate(inflater, container , false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getFollow();
        initRecycler(view);
    }

    private void getFollow() {
        list = new ArrayList<>();
        list.add(new LikeModel(R.drawable.user1,R.drawable.aria,"Night_king liked your photo","2h"));
        list.add(new LikeModel(R.drawable.user1,R.drawable.aria2,"Night_king liked your photo","2h"));list.add(new LikeModel(R.drawable.user1,R.drawable.aria,"Night_king liked your photo","2h"));
        list.add(new LikeModel(R.drawable.user1,R.drawable.aria2,"Night_king liked your photo","2h"));list.add(new LikeModel(R.drawable.user1,R.drawable.aria,"Night_king liked your photo","2h"));
        list.add(new LikeModel(R.drawable.user1,R.drawable.aria2,"Night_king liked your photo","2h"));list.add(new LikeModel(R.drawable.user1,R.drawable.aria,"Night_king liked your photo","2h"));
        list.add(new LikeModel(R.drawable.user1,R.drawable.aria2,"Night_king liked your photo","2h"));

    }

    private void initRecycler(View view) {
        recyclerView=view.findViewById(R.id.like_rv);
        recyclerView.setAdapter(adapter);
        adapter.setList(list);
    }
}