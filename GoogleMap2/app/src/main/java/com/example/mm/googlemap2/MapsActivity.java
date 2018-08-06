package com.example.mm.googlemap2;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.gson.Gson;
import com.google.maps.android.PolyUtil;
import com.google.maps.android.data.geojson.GeoJsonGeometryCollection;
import com.google.maps.android.data.geojson.GeoJsonLayer;

import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
Parsers parse;
EditText source,destination;
Button routebtn;


    Parsers.RoutesBean.LegsBean.StartLocationBean startpoint ;
    Parsers.RoutesBean.LegsBean.EndLocationBean endpoint ;
    Parsers.RoutesBean.LegsBean.StepsBean stepsBean;
    List<Parsers.RoutesBean.LegsBean.StepsBean> beanList;
   Parsers.RoutesBean.LegsBean.StepsBean.PolylineBean polylineBeans ;
   Parsers.RoutesBean.OverviewPolylineBean overviewPolylineBean;


    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        source = (EditText)findViewById(R.id.source);
        destination = (EditText)findViewById(R.id.destination);
        routebtn = (Button)findViewById(R.id.btnroute);







        routebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mMap.clear();

                callApi("https://maps.googleapis.com/maps/api/directions/json?origin="+source.getText().toString()+"&destination="+destination.getText().toString()+"&key=AIzaSyAy5ysI6GhOn-iYc6CJxNhzuPSGNLSZZ0M");

            }
        });




    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;



        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-33.4,150)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

//        Polyline polyline = mMap.addPolyline(new PolylineOptions().add(sydney).add(new LatLng(-33.4,150)).color(Color.RED));




    }



    public void callApi(String url)
    {




        AndroidNetworking.get(url).build().getAsString(new StringRequestListener() {
            @Override
            public void onResponse(String response) {


                parseit(response);
                Log.d("My Url ",""+response);

            }

            @Override
            public void onError(ANError anError) {
                Toast.makeText(MapsActivity.this, "Error", Toast.LENGTH_SHORT).show();

            }
        });


    }


public void parseit(String response)

{
    Gson gson = new Gson();




   parse= gson.fromJson(response,Parsers.class);

   startpoint=parse.getRoutes().get(0).getLegs().get(0).getStart_location();

   endpoint=parse.getRoutes().get(0).getLegs().get(0).getEnd_location();

   beanList = parse.getRoutes().get(0).getLegs().get(0).getSteps();



   polylineBeans = parse.getRoutes().get(0).getLegs().get(0).getSteps().get(0).getPolyline();

   overviewPolylineBean = parse.getRoutes().get(0).getOverview_polyline();





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

    for (int i = 0;i<beanList.size();i++)
    {

      //  polylineBeans = parse.getRoutes().get(0).getLegs().get(0).getSteps().get(i).getPolyline();




        List<LatLng> list1 = PolyUtil.decode(polylineBeans.getPoints());
        LatLng latLng = new LatLng(list1.get(0).latitude,list1.get(0).longitude);
       // for (int j = 0;j<list.size();j++) {



        }


    //}




//    mMap.addMarker(new MarkerOptions().position(new LatLng(beanList.get(0).getStart_location().getLat(),beanList.get(0).getStart_location().getLng())));
//    mMap.addMarker(new MarkerOptions().position(new LatLng(beanList.get(beanList.size()-1).getEnd_location().getLat(),beanList.get(beanList.size()-1).getEnd_location().getLng())));


    BitmapDrawable bitmapDrawable =(BitmapDrawable)getResources().getDrawable(R.mipmap.places);

    Bitmap bitmap1 = bitmapDrawable.getBitmap();

    Bitmap myicon = Bitmap.createScaledBitmap(bitmap1,100,100,false);




    //BitmapDescriptor bitmap =BitmapDescriptorFactory.fromResource(R.drawable.places);

    mMap.addMarker(new MarkerOptions().position(new LatLng(list.get(0).latitude,list.get(0).longitude)).icon(BitmapDescriptorFactory.fromBitmap(myicon)));


     mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(beanList.get(0).getStart_location().getLat(),beanList.get(0).getStart_location().getLng()),10.2f));

}


}
