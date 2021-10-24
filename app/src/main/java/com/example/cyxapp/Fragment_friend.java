package com.example.cyxapp;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cyxapp.cyxapp.Myadapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Fragment_friend extends Fragment {
    private RecyclerView recyclerView;
    private Context context;
    private List<String> data;
    private Myadapter myadapter;
    private ImageView imageView;
    public Fragment_friend() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view=inflater.inflate(R.layout.fragment_friend, container, false);
        context=this.getActivity();
        recyclerView=view.findViewById(R.id.recycleView);
        data=new ArrayList<>();

        String[] name={"貂蝉经典","异域舞娘","圣诞恋歌","仲夏夜之梦","猫影幻舞","逐梦之音","遇见胡璇"};
        String[] price={"免费","288点券","788点券","1688点券","1688点券","无价","1788点券"};
        int[] jpg={R.drawable.p5,R.drawable.p6,R.drawable.p7,R.drawable.p8,R.drawable.p9,R.drawable.p10,R.drawable.p11};
        List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();


        for(int i=0;i<name.length;i++){
            Map<String,Object> listitem=new HashMap<String,Object>();
            listitem.put("图片",jpg[i]);
            listitem.put("名字",name[i]);
            listitem.put("价格",price[i]);

            list.add(listitem);
        }


        myadapter=new Myadapter(list,context);
        GridLayoutManager layoutManager=new GridLayoutManager(context,2);
        layoutManager.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myadapter);

        return view;
    }

}