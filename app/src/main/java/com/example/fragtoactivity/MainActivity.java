package com.example.fragtoactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1,button2;
    View view;
    TextView activitytext;

    //provide a reference for viewmodel
    private Fragtoactviewmodel viewmodel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        activitytext = findViewById(R.id.activitytext);

        //Logic for saving the data in Viewmodel for display data to activity
        viewmodel = new ViewModelProvider(this).get(Fragtoactviewmodel.class);
        viewmodel.getdata().observe(this,data ->{
            activitytext.setText(data);
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replacefragment(new fragment1());
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replacefragment(new fragment2());
            }
        });



    }

    //main code for fragment changes
    private void replacefragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.relativelayout,fragment);
        ft.commit();

    }

}