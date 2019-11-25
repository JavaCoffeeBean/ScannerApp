package com.example.android.scannerapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ReturnedAdapter extends RecyclerView.Adapter<ReturnedAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";
    private ArrayList<String> mBookNames2 = new ArrayList<>();
    private ArrayList<String> mBookAuthors2 = new ArrayList<>();
    private ArrayList<String> mBookImages2 = new ArrayList<>();
    private ArrayList<ImageButton> mDeleteButton2 = new ArrayList<>();
    private ArrayList<ImageButton> mAddToReturnedButton2 = new ArrayList<>();
    private Context mContext2;

    public ReturnedAdapter(Context context, ArrayList<String> bookNames, ArrayList<String> bookImages, ArrayList<ImageButton> deleteButtons, ArrayList<ImageButton> addToReturnedButtons, ArrayList<String> bookAuthors) {
        mBookNames2 = bookNames;
        mBookImages2 = bookImages;
        mBookAuthors2 = bookAuthors;
        mDeleteButton2 = deleteButtons;
        mAddToReturnedButton2 = addToReturnedButtons;
        mContext2 = context;

    }



    @NonNull
    @Override
    public ReturnedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.returned_listitem, parent, false);
        ReturnedAdapter.ViewHolder holder = new ReturnedAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ReturnedAdapter.ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");
        System.out.println(mBookImages2.size());
        Glide.with(mContext2)
                .asBitmap()
                .load(mBookImages2.get(position))
                .into(holder.bookImage2);


        holder.bookName2.setText(mBookNames2.get(position));
        Log.d(TAG, "onBindViewHolder: this method has finished");

        holder.parentLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + mBookNames2.get(position));

                Toast.makeText(mContext2, mBookNames2.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mBookNames2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        RelativeLayout parentLayout2;
        TextView bookName2;
        TextView author2;
        ImageButton deleteButton2;
        ImageButton addToNotReturnedButton2;
        ImageView bookImage2;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parentLayout2 = itemView.findViewById(R.id.returned_parent_layout2);
            bookName2 = itemView.findViewById(R.id.bookname_listview2);
            author2 = itemView.findViewById(R.id.bookauthor_listview2);
            deleteButton2 = itemView.findViewById(R.id.delete_button2);
            addToNotReturnedButton2 = itemView.findViewById(R.id.add_to_notreturned_button2);
            bookImage2 = itemView.findViewById(R.id.bookcover_listview2);
        }
    }
}
