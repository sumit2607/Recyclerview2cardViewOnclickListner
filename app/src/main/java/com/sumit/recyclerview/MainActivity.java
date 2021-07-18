package com.sumit.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<CourseModel> courseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

courseList = new ArrayList<>();
    courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));
        courseList.add(new CourseModel(R.drawable.s, "java" , "best Course of java"));



        CourseAdapter adapter = new CourseAdapter(courseList, this);
        recyclerView.setAdapter(adapter);

    }
}