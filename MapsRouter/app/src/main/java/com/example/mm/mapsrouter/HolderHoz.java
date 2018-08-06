package com.example.mm.mapsrouter;


import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.mindorks.placeholderview.AnimationResolver;
import com.mindorks.placeholderview.PlaceHolderView;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;

import java.util.ArrayList;

@Layout(R.layout.holderlayout)

public class HolderHoz
{
    @View(R.id.placeholder2)private PlaceHolderView placeholder2;



    Context context;
    ArrayList<String> text;
    ArrayList<Integer> images;
    ArrayList<Boolean> isSelected;

    public HolderHoz(Context context,ArrayList<String> arrayList,ArrayList<Integer> imagelist,  ArrayList<Boolean> isSelected)
    {
      this.context =context;
      this.text =arrayList;
      this.images =imagelist;
      this.isSelected=isSelected;

    }




    @Resolve
    public void onResolve()
    {

//        for (int i=0;i<6;i++) {
//            placeholder2.addView(new Designer(text.get(i), images.get(i)));
//        }
        Toast.makeText(context, "Hellohelo", Toast.LENGTH_SHORT).show();
        placeholder2.getBuilder().setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));


//            for (int i = 0; i <6; i++) {
//
//                placeholder2.addView(new Designer(context,text.get(i), images.get(i),isSelected.get(i)));
//
//            }
//
//
////
//            for (int i =6;i<12;i++)
//            {
//
//                placeholder2.addView(new Designer(context,text.get(i), images.get(i),isSelected.get(i)));
//            }




    }



}
