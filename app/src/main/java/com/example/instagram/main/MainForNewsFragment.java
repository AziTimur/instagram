package com.example.instagram.main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram.R;
import com.example.instagram.databinding.FragmentMainForNewsBinding;

import java.util.ArrayList;


public class    MainForNewsFragment extends Fragment {
        private ArrayList<PostModel> list;
        private PostRecycleAdapter adapter;
       private RecyclerView recyclerView;
       private FragmentMainForNewsBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter=new PostRecycleAdapter();
        getPost();
    }

    private void getPost() {
        list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new PostModel(R.drawable.img_news
                    ,
                    "joshua_l The game in Japan was amazing and I want to share some photos",
                    "September 12"));
            list.add(new PostModel(R.drawable.tokyo,"Tokyo","September 13"));
            list.add(new PostModel(R.drawable.new_york,"New York","September 14"));

        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentMainForNewsBinding.inflate(inflater, container , false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycle(view);
    }

    private void initRecycle(View view){
        recyclerView=view.findViewById(R.id.post_rv);
        recyclerView.setAdapter(adapter);
        adapter.setList(list);

    }


}