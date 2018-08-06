package com.example.mm.eventbus2;


import android.os.Bundle;
import android.support.annotation.Nullable;
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


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    TextView firstmessage;
    Button firstbtn;
    EditText firstedit;
    public BlankFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_blank, container, false);
        firstmessage=view.findViewById(R.id.firstmessage);
        firstbtn = view.findViewById(R.id.firstbtn);
        firstedit = view.findViewById(R.id.firstedit);

        firstbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = firstedit.getText().toString();
                EventBus.getDefault().post(new MessageEvent1(msg));
            }
        });
        return  view;
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
    public void OnEvent(MessageEvent event){

      firstmessage.setText(event.getValue());


    }

}
