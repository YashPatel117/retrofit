package com.example.retrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.userHolder>{
    MainActivity mainActivity;
    List<Model> list;
    public Adapter(MainActivity mainActivity, List<Model> list) {
        this.mainActivity = mainActivity ;
        this.list = list ;
    }

    @NonNull
    @Override
    public userHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new userHolder(LayoutInflater.from(mainActivity).inflate(R.layout.items, parent ,false));
    }

    @Override
    public void onBindViewHolder(@NonNull userHolder holder, int position) {
        holder.id.setText(String.valueOf(list.get(position).getId()));
        holder.userid.setText(String.valueOf(list.get(position).getUserId()));
        holder.title.setText(list.get(position).getTitle());
        holder.body.setText(list.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class userHolder extends RecyclerView.ViewHolder{
        TextView id ;
        TextView userid ;
        TextView title ;
        TextView body ;

        public userHolder(@NonNull View itemView) {
            super(itemView);
            id =  itemView.findViewById(R.id.u_id);
            userid = itemView.findViewById(R.id.u_userid);
            title = itemView.findViewById(R.id.u_title);
            body = itemView.findViewById(R.id.u_body);
        }
    }
}

