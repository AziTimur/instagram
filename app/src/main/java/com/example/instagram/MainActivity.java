package com.example.instagram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.instagram.databinding.ActivityMainBinding;
import com.example.instagram.likes.LikesFragment;
import com.example.instagram.main.MainForNewsFragment;
import com.example.instagram.profile.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private BottomNavigationView bottomNavigationView;
    private TextView toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
    ititBottom();
    binding.cameraIc.setOnClickListener(v -> {
            Intent in = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(in);


        });
    }

    private void ititBottom() {
        toolbar=findViewById(R.id.tv_name);
        bottomNavigationView=findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new MainForNewsFragment()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home_nav:
                        toolbar.setText("\uD835\uDD74\uD835\uDD93\uD835\uDD98\uD835\uDD99\uD835\uDD86\uD835\uDD8C\uD835\uDD97\uD835\uDD86\uD835\uDD92");
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new MainForNewsFragment()).commit();
                        break;
                    case  R.id.like_nav:
                   //     binding.cameraIc.setVisibility(View.GONE);
                        toolbar.setText("\uD835\uDD71\uD835\uDD94\uD835\uDD91\uD835\uDD91\uD835\uDD94\uD835\uDD9C\uD835\uDD8E\uD835\uDD93\uD835\uDD8C");
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new LikesFragment()).commit();
                        break;
                    case R.id.profile_nav:
                        toolbar.setText("\uD835\uDD7B\uD835\uDD97\uD835\uDD94\uD835\uDD8B\uD835\uDD8E\uD835\uDD91\uD835\uDD8A");
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_container, new ProfileFragment()).commit();
                        break;
                }
                return false;
            }
        });


    }



}