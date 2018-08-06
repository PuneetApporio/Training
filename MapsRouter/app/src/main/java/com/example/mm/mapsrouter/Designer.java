package com.example.mm.mapsrouter;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mindorks.placeholderview.annotations.Click;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Position;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

@Layout(R.layout.designlayout)

public class Designer {




    Context context;
    ArrayList<String> arrayList;
    ArrayList<Integer> images;
    ArrayList<Boolean> isSelected;
    onCallBack mCallack;

    public Designer(Context context,ArrayList<String> arrayList,ArrayList<Integer> imagelist,  ArrayList<Boolean> isSelected, onCallBack mCallack)
    {
        this.context =context;
        this.arrayList =arrayList;
        this.images =imagelist;
        this.isSelected=isSelected;
        this.mCallack=mCallack;

    }

//    Designer(String text,Integer imagesource)
//    {
//             this.mytext =text;
//             this.imagesource = imagesource;
//    }


    @View(R.id.img) private ImageView image;
    @View(R.id.text) private TextView text;




    @Position private int mpos;

    @Resolve public void Resolve()
    {



        text.setText(arrayList.get(mpos));
        image.setImageResource(images.get(mpos));


        if(isSelected.get(mpos)==true)
        {


            text.setTextColor(Color.RED);


        }
        else {
            text.setTextColor(Color.DKGRAY);






        }







    }

    @Click(R.id.img)
    private  void  onClickImage()
    {
        mCallack.onItemClick(mpos);

        ArrayList<String> selectlist =new ArrayList<>();
        selectlist.clear();
        selectlist.add(arrayList.get(mpos));

        EventBus.getDefault().post(new EventOnePojo(selectlist,images.get(mpos)));




    }

    interface  onCallBack
    {
        void  onItemClick(int mPos);
    }





}
