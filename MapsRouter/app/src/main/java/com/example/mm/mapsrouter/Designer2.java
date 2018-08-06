package com.example.mm.mapsrouter;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.TextView;

import com.mindorks.placeholderview.annotations.Click;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Position;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

@Layout(R.layout.designlayout)

public class Designer2 {




    Context context;
    ArrayList<String> arrayList;
    ArrayList<Integer> images;
    ArrayList<Boolean> isSelected;
    onCallBack2 mCallack2;

    public Designer2(Context context,ArrayList<String> arrayList,ArrayList<Integer> imagelist,  ArrayList<Boolean> isSelected, onCallBack2 mCallack2)
    {
        this.context =context;
        this.arrayList =arrayList;
        this.images =imagelist;
        this.isSelected=isSelected;
        this.mCallack2=mCallack2;

    }

//    Designer(String text,Integer imagesource)
//    {
//             this.mytext =text;
//             this.imagesource = imagesource;
//    }


    @View(R.id.img) private ImageView image2;
    @View(R.id.text) private TextView text2;




    @Position
    private int mpos;

    @Resolve
    public void Resolve()
    {

       ArrayList<String> selectlist = new ArrayList<>();

        text2.setText(arrayList.get(mpos));
        image2.setImageResource(images.get(mpos));


        if(isSelected.get(mpos)==true)
        {
            selectlist.clear();
            text2.setTextColor(Color.RED);
            selectlist.add(text2.getText().toString());
        }
        else {
            text2.setTextColor(Color.DKGRAY);
        }



    }

    @Click(R.id.img)
    private  void  onClickImage()
    {
        mCallack2.onItemClick1(mpos);

        ArrayList<String> selectlist =new ArrayList<>();
        selectlist.clear();
        selectlist.add(arrayList.get(mpos));

        EventBus.getDefault().post(new EventttwoPojo(selectlist,images.get(mpos)));








    }

    interface  onCallBack2
    {
        void  onItemClick1(int mPos);
    }





}
