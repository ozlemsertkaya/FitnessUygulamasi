package com.example.shashank.loginfirebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class GridLayout extends AppCompatActivity {
    ImageButton image1,image2,image3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        image1=(ImageButton)findViewById(R.id.image1);
        image3=(ImageButton)findViewById(R.id.image3);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent food = new Intent(GridLayout.this,FoodLayout.class);
                startActivity(food);
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  bmi = new Intent(GridLayout.this,BMI.class);
                startActivity(bmi);
            }
        });
    }

}
