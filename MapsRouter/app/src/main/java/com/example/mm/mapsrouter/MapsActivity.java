package com.example.mm.mapsrouter;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.gson.Gson;
import com.google.maps.android.PolyUtil;
import com.mindorks.placeholderview.PlaceHolderView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback ,  Designer.onCallBack, Designer2.onCallBack2{

    PlaceHolderView placeholder1,Placeholder2;
    private GoogleMap mMap;
    Button btn;


    String ori = "";
    String des = "";
    Integer res =0;
    Integer res2 = 0;
   // ArrayList biglist = new ArrayList();
    ArrayList<String> textlist = new ArrayList<>();
    ArrayList<Integer> imagelist = new ArrayList<>();
    ArrayList<Integer> imagelist2 = new ArrayList<>();
    ArrayList<String> textlist2 = new ArrayList<>();
    ArrayList<Boolean>  isSelected = new ArrayList<>();
    ArrayList<Boolean>  isSelected1 = new ArrayList<>();



    Reasponse reasponse;





    Reasponse.RoutesBean.LegsBean.StartLocationBean startpoint ;
    Reasponse.RoutesBean.LegsBean.EndLocationBean endpoint ;
    Reasponse.RoutesBean.LegsBean.StepsBean stepsBean;
    List<Reasponse.RoutesBean.LegsBean.StepsBean> beanList;
    Reasponse.RoutesBean.LegsBean.StepsBean.PolylineBean polylineBeans ;
    Reasponse.RoutesBean.OverviewPolylineBean overviewPolylineBean;











    @Override
    protected void onResume() {
        super.onResume();
     EventBus.getDefault().register(this);

    }

    @Override
    protected void onPause() {
        super.onPause();
        EventBus.getDefault().unregister(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

          btn = (Button)findViewById(R.id.btn);


          btn.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {


                  mMap.clear();

                callApi("https://maps.googleapis.com/maps/api/directions/json?origin="+ori+"&destination="+des+"&key=AIzaSyDKCKqylnKqfpG6RzZNV2Sabr6wuEuuiO8");


                  Toast.makeText(MapsActivity.this, ""+ori, Toast.LENGTH_SHORT).show();
              }
          });



        placeholder1 = (PlaceHolderView)findViewById(R.id.placeholder1);
        Placeholder2 = (PlaceHolderView)findViewById(R.id.placeholder2);

        placeholder1.getBuilder().setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        Placeholder2.getBuilder().setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));


       // biglist.add(textlist);
      //  biglist.add(imagelist);
        for(int i=0;i<6;i++)
        {
            isSelected.add(false);
            isSelected1.add(false);
        }






        textlist.add("Noida");
        textlist.add("Gurugram");
        textlist.add("Delhi");
        textlist.add("Gaziabad");
        textlist.add("Greater Noida");
        textlist.add("Badarpur");

        imagelist.add(R.mipmap.noida);
        imagelist.add(R.mipmap.gurugram);
        imagelist.add(R.mipmap.delhi);
        imagelist.add(R.mipmap.gaziabad);
        imagelist.add(R.mipmap.greaternoida);
        imagelist.add(R.mipmap.badarpur);



        textlist2.add("Badarpur");
        textlist2.add("Greater Noida");
        textlist2.add("Delhi");
        textlist2.add("Gurugram");
        textlist2.add("Gaziabad");
        textlist2.add("Noida");


        imagelist2.add(R.mipmap.badarpur);
        imagelist2.add(R.mipmap.greaternoida);
        imagelist2.add(R.mipmap.delhi);
        imagelist2.add(R.mipmap.gurugram);
        imagelist2.add(R.mipmap.gaziabad);
        imagelist2.add(R.mipmap.noida);



        for (int i=0;i<imagelist.size();i++) {
            placeholder1.addView(new Designer(this, textlist, imagelist, isSelected, this));
            Placeholder2.addView(new Designer2(this,textlist2,imagelist2,isSelected1,this));

        }
//
//        for (int i=0;i<imagelist.size();i++) {
//            placeholder1.addView(new Designer(this, textlist, imagelist, isSelected, this));
//
//
//        }
//        Toast.makeText(this, "HelloToast", Toast.LENGTH_SHORT).show();







    }



    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(EventOnePojo eventOnePojo)
    {
        ori = eventOnePojo.getText().get(0);
        res = eventOnePojo.getRes();
        //Toast.makeText(this, ""+ori, Toast.LENGTH_SHORT).show();
    }





    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(EventttwoPojo eventttwoPojo)
    {
        des =eventttwoPojo.getText().get(0);
        res2 = eventttwoPojo.getRes();


    }












    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    @Override
    public void onItemClick(int mPos) {
        for(int i=0;i<isSelected.size();i++)
        {
            if(i==mPos)
            {
                ((Designer)placeholder1.getAllViewResolvers().get(0)).isSelected.set(mPos,true);




            }
            else {
                ((Designer)placeholder1.getAllViewResolvers().get(0)).isSelected.set(i,false);

            }
        }

        placeholder1.refresh();

//        for (int i=0;i<imagelist.size();i++) {
//            placeholder1.addView(new Designer(this, textlist, imagelist, isSelected, this));
//
//        }





    }

    @Override
    public void onItemClick1(int mPos) {


        for(int i=0;i<isSelected1.size();i++)
        {
            if(i==mPos)
            {


                ((Designer2)Placeholder2.getAllViewResolvers().get(0)).isSelected.set(mPos,true);




            }
            else {
                ((Designer2)Placeholder2.getAllViewResolvers().get(0)).isSelected.set(i,false);

            }
        }


        Placeholder2.refresh();

    }






















    public void callApi(String url)
    {


        AndroidNetworking.get("https://maps.googleapis.com/maps/api/directions/json?origin="+ori+"&destination="+des+"&key=AIzaSyDKCKqylnKqfpG6RzZNV2Sabr6wuEuuiO8").build().getAsString(new StringRequestListener() {
            @Override
            public void onResponse(String response) {

                parseit(response);
            }

            @Override
            public void onError(ANError anError) {

                Toast.makeText(MapsActivity.this, "Error : Something Wrong", Toast.LENGTH_SHORT).show();
            }
        });

    }


    public void parseit(String response)

    {
        Gson gson = new Gson();





        reasponse= gson.fromJson(response,Reasponse.class);

//        startpoint=reasponse.getRoutes().get(0).getLegs().get(0).getStart_location();
//
//        endpoint=reasponse.getRoutes().get(0).getLegs().get(0).getEnd_location();
//
      // beanList = reasponse.getRoutes().get(0).getLegs().get(0).getSteps();



       // polylineBeans = reasponse.getRoutes().get(0).getLegs().get(0).getSteps().get(0).getPolyline();

        overviewPolylineBean = reasponse.getRoutes().get(0).getOverview_polyline();





        //Toast.makeText(this, "Steps "+beanList.size(), Toast.LENGTH_SHORT).show();

        addPoly();








    }


    public void addPoly()
    {



        // legsBean.getSteps().get(0);



        // Toast.makeText(this, "Start lat long :"+" "+startpoint.getLng()+" "+startpoint.getLat(), Toast.LENGTH_SHORT).show();

        //Toast.makeText(this, "End lat long :"+endpoint.getLat()+", "+endpoint.getLng(), Toast.LENGTH_SHORT).show();

        Polyline polyline;


        List<LatLng> list = PolyUtil.decode(overviewPolylineBean.getPoints());
        mMap.addPolyline(new PolylineOptions().addAll(list).color(Color.RED));

//        for (int i = 0;i<beanList.size();i++)
//        {
//
//            //  polylineBeans = parse.getRoutes().get(0).getLegs().get(0).getSteps().get(i).getPolyline();
//
//
//
//
//            List<LatLng> list1 = PolyUtil.decode(polylineBeans.getPoints());
//            LatLng latLng = new LatLng(list1.get(0).latitude,list1.get(0).longitude);
//            // for (int j = 0;j<list.size();j++) {
//
//
//
//        }
//

        //}




//    mMap.addMarker(new MarkerOptions().position(new LatLng(beanList.get(0).getStart_location().getLat(),beanList.get(0).getStart_location().getLng())));
//    mMap.addMarker(new MarkerOptions().position(new LatLng(beanList.get(beanList.size()-1).getEnd_location().getLat(),beanList.get(beanList.size()-1).getEnd_location().getLng())));

        BitmapDrawable bitmapDrawable;

            bitmapDrawable = (BitmapDrawable) getResources().getDrawable(res);

            Bitmap bitmap1 = bitmapDrawable.getBitmap();


            Bitmap myicon = Bitmap.createScaledBitmap(bitmap1, 100, 100, false);


        BitmapDrawable bitmapDrawable2;

        bitmapDrawable2 = (BitmapDrawable) getResources().getDrawable(res2);

        Bitmap bitmap2 = bitmapDrawable2.getBitmap();


        Bitmap myicon2 = Bitmap.createScaledBitmap(bitmap2, 100, 100, false);




        //BitmapDescriptor bitmap =BitmapDescriptorFactory.fromResource(R.drawable.places);

        mMap.addMarker(new MarkerOptions().position(new LatLng(list.get(0).latitude,list.get(0).longitude)).icon(BitmapDescriptorFactory.fromBitmap(myicon)));

        mMap.addMarker(new MarkerOptions().position(new LatLng(list.get(list.size()-1).latitude,list.get(list.size()-1).longitude)).icon(BitmapDescriptorFactory.fromBitmap(myicon2)));



        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(list.get(0).latitude,list.get(0).longitude),10.2f));

    }































}
