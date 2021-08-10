package com.example.instagram.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;
import com.example.instagram.likes.LikeAdapter;
import com.example.instagram.likes.LikeModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class AdapterRV1 extends RecyclerView.Adapter<AdapterRV1.ViewHolder> {
    ArrayList<ModelGridlayot> list;

    public void setList(ArrayList<ModelGridlayot> list) {
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_for_vp1, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AdapterRV1.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView,imageView2,imageView3,imageView4;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.gridImg);
            imageView2=itemView.findViewById(R.id.gridImg2);
            imageView3=itemView.findViewById(R.id.gridImg3);
            imageView4=itemView.findViewById(R.id.gridImg4);

        }

        public void onBind(ModelGridlayot modelGridlayot) {
            imageView.setImageResource(modelGridlayot.getImage());
            imageView2.setImageResource(modelGridlayot.getImage2());
            imageView3.setImageResource(modelGridlayot.getImage3());
            imageView4.setImageResource(modelGridlayot.getImage4());

        }
    }



}
