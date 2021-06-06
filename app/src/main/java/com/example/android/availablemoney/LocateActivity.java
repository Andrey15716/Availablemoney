package com.example.android.availablemoney;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class LocateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locate_list);



        Uri gmmIntentUri = Uri.parse("geo:53.9259041,27.6144979");
        Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
       if (intent.resolveActivity(getPackageManager()) != null) {
          startActivity(intent);
       }

    }
}