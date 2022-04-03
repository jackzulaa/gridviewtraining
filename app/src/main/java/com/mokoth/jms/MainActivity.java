package com.mokoth.jms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView coursesGV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        coursesGV = findViewById(R.id.idGVcourses);

        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();
        courseModelArrayList.add(new CourseModel("C#", R.drawable.ic_launcher_foreground));
        courseModelArrayList.add(new CourseModel("JAVA", R.drawable.ic_launcher_foreground));
        courseModelArrayList.add(new CourseModel("C++", R.drawable.ic_launcher_foreground));
        courseModelArrayList.add(new CourseModel("Python", R.drawable.ic_launcher_foreground));
        courseModelArrayList.add(new CourseModel("Javascript", R.drawable.ic_launcher_foreground));
        courseModelArrayList.add(new CourseModel("DSA", R.drawable.ic_launcher_foreground));

        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }
}