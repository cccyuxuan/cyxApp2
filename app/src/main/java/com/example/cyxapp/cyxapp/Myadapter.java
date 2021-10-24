package com.example.cyxapp.cyxapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cyxapp.MainActivity10;
import com.example.cyxapp.MainActivity4;
import com.example.cyxapp.MainActivity5;
import com.example.cyxapp.MainActivity6;
import com.example.cyxapp.MainActivity7;
import com.example.cyxapp.MainActivity8;
import com.example.cyxapp.MainActivity9;
import com.example.cyxapp.R;

import java.util.List;
import java.util.Map;

public class Myadapter extends RecyclerView.Adapter <Myadapter.MyViewHolder>{
    private View itemView;
    private Intent intent;
    private Context context;
    private Myadapter myadapter;
    private List<Map<String,Object>> data;
    public Myadapter(List<Map<String,Object>> data, Context context){
        this.context=context;
        this.data=data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        itemView= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(itemView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView1.setText(data.get(position).get("名字").toString());
        holder.textView2.setText(data.get(position).get("价格").toString());
        holder.imageView.setImageResource(Integer.parseInt(data.get(position).get("图片").toString()));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView1,textView2;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch(getAdapterPosition()){
                        case 0:
                            intent=new Intent(itemView.getContext(), MainActivity4.class);
                            break;
                        case 1:
                            intent=new Intent(itemView.getContext(), MainActivity5.class);
                            break;
                        case 2:
                            intent=new Intent(itemView.getContext(), MainActivity6.class);
                            break;
                        case 3:
                            intent=new Intent(itemView.getContext(), MainActivity7.class);
                            break;
                        case 4:
                            intent=new Intent(itemView.getContext(), MainActivity8.class);
                            break;
                        case 5:
                            intent=new Intent(itemView.getContext(), MainActivity9.class);
                            break;
                        case 6:
                            intent=new Intent(itemView.getContext(), MainActivity10.class);
                            break;
                    }
                    context.startActivity(intent);
                }
            });
            textView1=itemView.findViewById(R.id.textView1);
            textView2=itemView.findViewById(R.id.textView2);
            imageView=itemView.findViewById(R.id.imageView1);
        }
    }
}
