
package com.example.android.availablemoney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView conditions = (TextView) findViewById(R.id.conditions);

        // Set a click listener on that View
        conditions.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent conditionsIntent = new Intent(MainActivity.this, ConditionsActivity.class);

                // Start the new activity
                startActivity(conditionsIntent);
            }
        });

        // Find the View that shows the family category
        TextView contacts = (TextView) findViewById(R.id.contacts);

        // Set a click listener on that View
        contacts.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent contactsIntent = new Intent(MainActivity.this, ContactsActivity.class);

                // Start the new activity
                startActivity(contactsIntent);
            }
        });

        // Find the View that shows the colors category
        TextView locate = (TextView) findViewById(R.id.locate);

        // Set a click listener on that View
        locate.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent locateIntent = new Intent(MainActivity.this, LocateActivity.class);

                // Start the new activity
                startActivity(locateIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView get = (TextView) findViewById(R.id.getmoney);

        // Set a click listener on that View
        get.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent getIntent = new Intent(MainActivity.this, GetsActivity.class);

                // Start the new activity
                startActivity(getIntent);
            }
        });



    }
}
