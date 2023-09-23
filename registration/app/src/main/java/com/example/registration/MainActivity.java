package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText name,father_name;
    TextView textView,display;
    Button submit;
    AutoCompleteTextView autoCompleteTextViewcity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find view by ids
        name = findViewById(R.id.name);
        father_name = findViewById(R.id.father_name);
        textView = findViewById(R.id.textView);
        textView = findViewById(R.id.display);
        autoCompleteTextViewcity = findViewById(R.id.city);
        submit =(Button) findViewById(R.id.submit_button);


        // create an ArrayList
        ArrayList listOfCity = new ArrayList();
        listOfCity.add("Bengaluru");
        listOfCity.add("Chennai");
        listOfCity.add("Delhi");
        listOfCity.add("Mumbai");

        //create an arrayAdapter
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listOfCity);
        autoCompleteTextViewcity.setAdapter(adapter);

    }



    public void submit(View view) {

        String r_name = name.getText().toString();
        String r_father_name = father_name.getText().toString();
        String r_city = autoCompleteTextViewcity.getText().toString();

        // Using toast displays a small pop up on the screen

        Toast.makeText(this, "Name: " + r_name + "\n" + "Father Name :" + r_father_name + "\n" + "City :" + r_city, Toast.LENGTH_LONG
        ).show();

        //setting the input to display
        textView.setText("Name : "+r_name+"\n" +"Father Name : "+r_father_name+"\n"+"City : "+r_city);

    }

}