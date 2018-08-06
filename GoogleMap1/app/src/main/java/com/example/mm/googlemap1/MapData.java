package com.example.mm.googlemap1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MapData extends SQLiteOpenHelper {

    public static final String DBNAME = "MAPS";
    public static final String TABLE = "MAP";
    public static final String COLUMN_SERIAL = "SERIAL INTEGER PRIMARY KEY";
    public static final String COLUMN_LOC = "LOCATION TEXT";


    Context context;

    MapData(Context context) {
        super(context, DBNAME, null, 1);
        this.context = context;

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE + " (" + COLUMN_SERIAL + "," + COLUMN_LOC + ")");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(sqLiteDatabase);

    }

    public void writeData(String str) {


        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put("LOCATION", str);


        db.insert(TABLE, null, values);
        db.close();

    }


    public String readData() {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("select "+" LOCATION "+" from "+TABLE,null);
         String mydata  = new String("");


            if (cursor.moveToFirst()) {

                // prepare note object
                do {
                  //  int serial = cursor.getInt(cursor.getColumnIndex(COLUMN_SERIAL));
                     mydata += "\n"+cursor.getString(cursor.getColumnIndex("LOCATION"));

                   // Toast.makeText(context, "" + mydata, Toast.LENGTH_SHORT).show();
                    Log.d("MYDTATa","reading data");
                } while (cursor.moveToNext());

            }

            // close the db connection
            cursor.close();
            db.close();

            return mydata;

        }

    public void clearData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from "+ TABLE);
        db.close();
    }


}

