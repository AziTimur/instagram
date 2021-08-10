package com.example.instagram.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.R;
import com.example.instagram.databinding.ItemForNewsRvBinding;

import java.util.ArrayList;

public class PostRecycleAdapter extends RecyclerView.Adapter<PostRecycleAdapter.ViewHolder> {
    ArrayList<PostModel> list;
    private TextView commentPostTv, dataPostTv;
    private ImageView imgPostTv;

    public void setList(ArrayList<PostModel> list) {
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_for_news_rv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostRecycleAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
            commentPostTv = itemView.findViewById(R.id.commentPost_tv);
            dataPostTv=itemView.findViewById(R.id.dataPost_tv);
            imgPostTv=itemView.findViewById(R.id.img_post_tv);
        }

        public void onBind(PostModel postModel) {
            imgPostTv.setImageResource(postModel.getImg());
            commentPostTv.setText(postModel.getComment());
            dataPostTv.setText(postModel.getData());
        }
    }
}
