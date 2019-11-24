package com.example.android.scannerapp;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<String> mBookNames = new ArrayList<>();
    private ArrayList<String> mBookAuthors = new ArrayList<>();
    private ArrayList<String> mBookImages = new ArrayList<>();
    private ArrayList<ImageButton> DeleteButtons = new ArrayList<>();
    private ArrayList<ImageButton> AddToReturnedButtons = new ArrayList<>();



    




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.not_returned_fragment);

        Log.d(TAG, "onCreate: started.");




        initImageBitmaps();


    }



    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps");





//        mImageUrls.add(/*place image url here that you got from api*/);
//        mNames.add(/*place rerecipe name here*/);


//        Example

        mBookImages.add("https://i.pinimg.com/474x/51/f2/25/51f225cc7735e271da581e71e1d42041.jpg");
        mBookNames.add("Their Eyes Were Watching God");
       /* mBookAuthors.add("Zora Hurston");*/

        mBookImages.add("https://pbs.twimg.com/profile_images/430129632310878209/Wiu5QAFe.jpeg");
        mBookNames.add("Sloppy Joe");
      /*  mBookAuthors.add("Zora Hurston");*/

        mBookImages.add("https://www.yummyhealthyeasy.com/wp-content/uploads/2018/04/california-sushi-rolls-4.jpg");
        mBookNames.add("Sushi");
        /*mBookAuthors.add("Zora Hurston");*/

        mBookImages.add("https://www.sprinklesomesugar.com/wp-content/uploads/2017/02/IMG_6846.jpg");
        mBookNames.add("Red Velvet Cookies");
    /*    mBookAuthors.add("Zora Hurston");*/

        mBookImages.add("https://www.jessicagavin.com/wp-content/uploads/2015/03/shrimp-spring-rolls-with-dipping-sauce-1200.jpg");
        mBookNames.add("Spring Rolls");
       /* mBookAuthors.add("Zora Hurston");*/

        mBookImages.add("http://blog.williams-sonoma.com/wp-content/uploads/2018/03/bouchon-bakery-macarons-smaller-800px.jpg");
        mBookNames.add("Macarons");
       /* mBookAuthors.add("Zora Hurston");*/




    }

    protected void onStart(){
        super.onStart();

        Log.d(TAG, "onStart: this method started");

        initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init RecyclerView.");
        RecyclerView recyclerView = findViewById(R.id.notReturned_recyclerview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,  mBookNames, mBookImages, DeleteButtons, AddToReturnedButtons, mBookAuthors);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }




}