package com.example.mm.eventbus2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;


public class BlankFragment2 extends Fragment {


    TextView secondmessage;
    Button secondbtn;
    EditText secondedit;

    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        secondmessage=view.findViewById(R.id.secondmessage);
        secondbtn = view.findViewById(R.id.secondbtn);
        secondedit = view.findViewById(R.id.secondedit);


        secondbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ss = secondedit.getText().toString();
                EventBus.getDefault().post(new MessageEvent(ss));
            }
        });




        return view;
    }


    @Override
    public void onResume() {
        super.onResume();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onPause() {
        EventBus.getDefault().unregister(this);
        super.onPause();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void OnEvent(MessageEvent1 event){

        secondmessage.setText(event.getSome());


    }


}
