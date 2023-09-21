package com.example.bmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    Button calculate;
    EditText height , weight, results;
    TextView result;
//    EditText h , w , r ;
//int h , w , r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculate = (Button)findViewById(R.id.calculate);// Define the button
        calculate.setOnClickListener(new View.OnClickListener() { // Register the button


            public void onClick(View v) {
                // find input by id
               height = (EditText)findViewById(R.id.height);
               weight = (EditText)findViewById(R.id.weight);
               result = (TextView)findViewById(R.id.result);

//               int = height.int

//                int h = height;
//               int w = weight ;
// get text
               String hei = height.getText().toString();
               String wei = weight.getText().toString();

//               convert text into integer

               int h = Integer.parseInt(hei);
               int w = Integer.parseInt(wei);

//                double r = (w /h)* h;
                double r = w /(h*h);
//int r = h + w;
                // Display Result
                result.setText("Result : "+ r + "Kg/merter Square");


//                results = (weight/height);
//                result.setText("Result :"+(height.getText()+(weight.getText()).toString()));

//                result.setText("Result : "+(result.getText()+(result.getText().toString()).toString()));
//                EditText height = findViewById(R.id.height);
//                EditText weight = findViewById(R.id.weight);
//                float Result = (10 / 10);
//                Toast.makeText(this,"Clicked");
//                height = (EditText)findViewById(R.id.height);

//                Toast.makeText(MainActivity.this, " This is a Result ", Toast.LENGTH_LONG).show();
//            Toast.makeText(this,height,Toast.LENGTH_LONG).show();
            }

        });
    }
}
