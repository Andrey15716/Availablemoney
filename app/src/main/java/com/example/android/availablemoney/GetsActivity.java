package com.example.android.availablemoney;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GetsActivity extends AppCompatActivity {

    EditText city;
    EditText call;
    EditText money;

    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_list);


        city = (EditText) findViewById(R.id.city_view);
        call = (EditText) findViewById(R.id.call_view);
        money = (EditText) findViewById(R.id.money_view);


        Button btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Intent.ACTION_SENDTO);
                intent2.setData(Uri.parse("mailto:" + "eazydengy@mail.ru")); // only email apps should handle this
                intent2.putExtra(Intent.EXTRA_TEXT, city.getText().toString() +"\n" + call.getText() +"\n" + money.getText());
                if (intent2.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent2);
                }
            }});
    }}





