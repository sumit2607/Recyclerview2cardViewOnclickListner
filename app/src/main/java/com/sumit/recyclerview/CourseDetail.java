package com.sumit.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CourseDetail extends AppCompatActivity {
    ImageView courseImg;
    TextView coursename , courseDesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);
        courseImg = findViewById(R.id.imageView);
        coursename = findViewById(R.id.textView);
        courseDesc = findViewById(R.id.tv);
        courseImg.setImageResource(getIntent().getExtras().getInt("image_id"));
      coursename.setText(getIntent().getExtras().getString("course_name"));
        coursename.setText(getIntent().getExtras().getString("course desc"));
    }
}