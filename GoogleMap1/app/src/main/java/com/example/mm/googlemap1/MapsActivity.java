package com.example.mm.googlemap1;


import android.Manifest;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CustomCap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.io.IOException;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback,GoogleMap.OnPolylineClickListener {

    private GoogleMap mMap;
    Button btn,btndelete;
    TextView text;
    MapData mapData;


    @Override
    protected void onStart() {
        super.onStart();


    }


    @Override
    protected void onStop() {
        super.onStop();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);

        text = (TextView)findViewById(R.id.text);
        btn = (Button)findViewById(R.id.btn);
        btndelete = (Button)findViewById(R.id.btndelete);

        mapData = new MapData(this);

        // mapData.readData();

        btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cach = mapData.readData();
                text.setText(cach);
            }
        });



        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mapData.clearData();
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

        LatLng latLng1 = new LatLng(28.411202,77.049049);
        LatLng latLng2 = new LatLng(28.470742,77.046372);

        Polyline polyline = mMap.addPolyline(new PolylineOptions().add(latLng1).add(latLng2).width(10f).clickable(true).startCap(new CustomCap(BitmapDescriptorFactory.fromResource(R.drawable.ic_location_on_black_24dp))).endCap(new CustomCap(BitmapDescriptorFactory.fromResource(R.drawable.ic_location_on_black_24dp))));








//        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
//            // TODO: Consider calling
//            //    ActivityCompat#requestPermissions
//            // here to request the missing permissions, and then overriding
//            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//            //                                          int[] grantResults)
//            // to handle the case where the user grants the permission. See the documentation
//            // for ActivityCompat#requestPermissions for more details.
//            return;
//        }
//        googleMap.setMyLocationEnabled(true);
//
//
//
//        // Add a marker in Sydney and move the camera
//     //   LatLng sydney = new LatLng(28.4138, 77.0421);
//       // mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Gurgaon"));
//
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(MapsActivity.this,Manifest.permission.INTERNET)!=PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(MapsActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.INTERNET}, 0);
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
//
//
//        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
//
//
//        LocationManager manager = (LocationManager) getSystemService(LOCATION_SERVICE);
//
//        if (manager.isProviderEnabled(LocationManager.NETWORK_PROVIDER))
//        {
//            manager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 5000, 0, new LocationListener() {
//                @Override
//                public void onLocationChanged(Location location) {
//                    double longitude = location.getLongitude();
//                    double latitude = location.getLatitude();
//
//                    LatLng latLng = new LatLng(latitude,longitude);
//
//                    Geocoder coder = new Geocoder(getApplicationContext());
//                    try {
//                        List<Address> addressList =  coder.getFromLocation(latitude,longitude,1);
//                        String str = addressList.get(0).getLocality();
//                        str += ", "+addressList.get(0).getSubLocality();
//                        str += ", "+addressList.get(0).getAdminArea();
//                        str +=", "+addressList.get(0).getPremises();
//
//                     //   str +=", "+addressList.get(0).getFeatureName();
//
//
//                        str += ", "+addressList.get(0).getCountryName();
//
//                        mMap.addMarker(new MarkerOptions().position(latLng).title(str));
//                        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng,18.2f));
//                        //Toast.makeText(MapsActivity.this, ""+str, Toast.LENGTH_SHORT).show();
//                        mapData.writeData(str);
//                        mapData.readData();
//
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//
//                @Override
//                public void onStatusChanged(String s, int i, Bundle bundle) {
//
//                }
//
//                @Override
//                public void onProviderEnabled(String s) {
//
//                }
//
//                @Override
//                public void onProviderDisabled(String s) {
//
//                }
//            });
//
//        }
//      // else if(manager.isProviderEnabled(LocationManager.GPS_PROVIDER))
//        {
//            manager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 0, new LocationListener() {
//                @Override
//                public void onLocationChanged(Location location) {
//                    double longitude = location.getLongitude();
//                    double latitude = location.getLatitude();
//
//                    LatLng latLng = new LatLng(latitude,longitude);
//
//                    Geocoder coder = new Geocoder(getApplicationContext());
//                    try {
//                        List<Address> addressList =  coder.getFromLocation(latitude,longitude,1);
//                        String str = addressList.get(0).getLocality();
//                        str += " ,"+addressList.get(0).getCountryName();
//                        str += ", "+addressList.get(0).getSubLocality();
//                        str += ", "+addressList.get(0).getAdminArea();
//
//                        mMap.addMarker(new MarkerOptions().position(latLng).title(str));
//                        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng,18.2f));
//                        //Toast.makeText(MapsActivity.this, ""+str, Toast.LENGTH_SHORT).show();
//                        mapData.writeData(str);
//                        mapData.readData();
//
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//
//                @Override
//                public void onStatusChanged(String s, int i, Bundle bundle) {
//
//                }
//
//                @Override
//                public void onProviderEnabled(String s) {
//
//                }
//
//                @Override
//                public void onProviderDisabled(String s) {
//
//                }
//            });
//
//        }
//        else
//        {
//            Toast.makeText(service, "Error", Toast.LENGTH_SHORT).show();
//        }

        // LatLng loc = new LatLng(22,66);
        // mMap.addMarker(new MarkerOptions().position(loc).title("Water Park"));
        //        // mMap.moveCamera(CameraUpdateFactory.newLatLng(loc));


    }


    @Override
    public void onPolylineClick(Polyline polyline) {

        Toast.makeText(this, "Polyline", Toast.LENGTH_SHORT).show();

    }
}



