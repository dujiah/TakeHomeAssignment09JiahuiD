package com.example.du.takehomeassignment09_jiahuid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SecondActivity extends AppCompatActivity {
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference flowerRef = database.getReference("flower");
    private DatabaseReference flowersRef = database.getReference("Multiple flower");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void set(View view) {
        flowerRef.setValue(new Flower("Orchid", 5, false));
    }

    public void add(View view) {
        flowersRef.push().setValue(new Flower("rose", 2, false));
        finish();
    }

}
