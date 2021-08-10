package com.example.instagram.likes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;

import java.util.ArrayList;

public class LikeAdapter extends RecyclerView.Adapter<LikeAdapter.ViewHolder> {
    ArrayList<LikeModel> list;

    public void setList(ArrayList<LikeModel> list) {
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_for_like, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LikeAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView avatar, photo;
        private TextView user, time;

        public ViewHolder(View itemView) {
            super(itemView);
            avatar = itemView.findViewById(R.id.avatar_iv);
            photo = itemView.findViewById(R.id.photo_iv);
            user = itemView.findViewById(R.id.user_name_tv);
            time = itemView.findViewById(R.id.time_like);

        }

        public void onBind(LikeModel likeModel) {
            avatar.setImageResource(likeModel.getAvatar());
            photo.setImageResource(likeModel.getPhoto());
            user.setText(likeModel.getUserName());
            time.setText(likeModel.getTime());
        }
    }
}
