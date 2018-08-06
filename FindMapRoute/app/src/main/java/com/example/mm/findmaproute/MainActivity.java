package com.example.mm.findmaproute;

import android.graphics.Color;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback{
GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapRoute);

        mapFragment.getMapAsync(MainActivity.this);


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap =googleMap;

        LatLng latLng1 = new LatLng(28.411202,77.049049);
        LatLng latLng2 = new LatLng(28.470742,77.046372);

        PolylineOptions options = new PolylineOptions().add(latLng1).add(latLng2).color(Color.RED).width(10.2f).geodesic(true);
        mMap.addPolyline(options);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng1,14.2f));








    }
}
