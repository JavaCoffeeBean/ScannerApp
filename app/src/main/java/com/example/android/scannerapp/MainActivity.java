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

    private ArrayList<String> mBookNames2 = new ArrayList<>();
    private ArrayList<String> mBookAuthors2 = new ArrayList<>();
    private ArrayList<String> mBookImages2 = new ArrayList<>();
    private ArrayList<ImageButton> DeleteButtons2 = new ArrayList<>();
    private ArrayList<ImageButton> AddToReturnedButtons2 = new ArrayList<>();



    




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.returned_fragment);

        Log.d(TAG, "onCreate: started.");




        initImageBitmaps2();


    }



    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps");





//        mImageUrls.add(/*place image url here that you got from api*/);
//        mNames.add(/*place rerecipe name here*/);


//        Example

        mBookImages.add("https://images-na.ssl-images-amazon.com/images/I/51M%2BMu05lCL._SX343_BO1,204,203,200_.jpg");
        mBookNames.add("Their Eyes Were Watching God");
        mBookAuthors.add("Zora Hurston");

        mBookImages.add("https://images-na.ssl-images-amazon.com/images/I/51rqbjzojiL._SX356_BO1,204,203,200_.jpg");
        mBookNames.add("Z for Zachariah");
        mBookAuthors.add("Robert C. O'brien");

        mBookImages.add("https://img.buzzfeed.com/buzzfeed-static/static/2013-10/enhanced/webdr01/10/10/enhanced-buzz-24944-1381414376-1.jpg?downsize=700:*&output-format=auto&output-quality=auto");
        mBookNames.add("Goosebumbs");
        mBookAuthors.add("RL Stein");

        mBookImages.add("https://images-na.ssl-images-amazon.com/images/I/511FGQPR30L._SX302_BO1,204,203,200_.jpg");
        mBookNames.add("When Things Fall Apart");
        mBookAuthors.add("Chinua Achebe");

        mBookImages.add("http://cdn.shopify.com/s/files/1/2697/1746/products/1984-book-cover-art-book-cover-prints-2_1531c558-4ea7-4a8b-95f4-1fa3534f0ee9_1200x1200.jpg?v=1571739186");
        mBookNames.add("1984");
        mBookAuthors.add("George Orwell");

        mBookImages.add("https://prodimage.images-bn.com/pimages/9781610427678_p0_v1_s550x406.jpg");
        mBookNames.add("Julius Cesar");
        mBookAuthors.add("Shakespear");




    }

    private void initImageBitmaps2(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps");





//        mImageUrls.add(/*place image url here that you got from api*/);
//        mNames.add(/*place rerecipe name here*/);


//        Example

        mBookImages2.add("https://images-na.ssl-images-amazon.com/images/I/51M%2BMu05lCL._SX343_BO1,204,203,200_.jpg");
        mBookNames2.add("Their Eyes Were Watching God");
        mBookAuthors2.add("Zora Hurston");

        mBookImages2.add("https://images-na.ssl-images-amazon.com/images/I/51rqbjzojiL._SX356_BO1,204,203,200_.jpg");
        mBookNames2.add("Z for Zachariah");
        mBookAuthors2.add("Robert C. O'brien");

        mBookImages2.add("https://img.buzzfeed.com/buzzfeed-static/static/2013-10/enhanced/webdr01/10/10/enhanced-buzz-24944-1381414376-1.jpg?downsize=700:*&output-format=auto&output-quality=auto");
        mBookNames2.add("Goosebumbs");
        mBookAuthors2.add("RL Stein");

        mBookImages2.add("https://images-na.ssl-images-amazon.com/images/I/511FGQPR30L._SX302_BO1,204,203,200_.jpg");
        mBookNames2.add("When Things Fall Apart");
        mBookAuthors2.add("Chinua Achebe");

        mBookImages2.add("http://cdn.shopify.com/s/files/1/2697/1746/products/1984-book-cover-art-book-cover-prints-2_1531c558-4ea7-4a8b-95f4-1fa3534f0ee9_1200x1200.jpg?v=1571739186");
        mBookNames2.add("1984");
        mBookAuthors2.add("George Orwell");

        mBookImages2.add("https://prodimage.images-bn.com/pimages/9781610427678_p0_v1_s550x406.jpg");
        mBookNames2.add("Julius Cesar");
        mBookAuthors2.add("Shakespear");




    }


    protected void onStart(){
        super.onStart();

        Log.d(TAG, "onStart: this method started");

        initRecyclerView2();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init RecyclerView.");
        RecyclerView recyclerView = findViewById(R.id.notReturned_recyclerview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,  mBookNames, mBookImages, DeleteButtons, AddToReturnedButtons, mBookAuthors);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initRecyclerView2(){
        Log.d(TAG, "initRecyclerView: init RecyclerView.");
        RecyclerView recyclerView = findViewById(R.id.returned_recyclerview2);
        ReturnedAdapter adapter2 = new ReturnedAdapter(this,  mBookNames2, mBookImages2, DeleteButtons2, AddToReturnedButtons2, mBookAuthors2);
        recyclerView.setAdapter(adapter2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }




}