package com.sumit.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder>{
    List<CourseModel> course_List;
    private Context context;


    public CourseAdapter(List<CourseModel> courselist , Context context) {
        course_List =courselist;
        this.context = context;

    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent , false);
        CourseViewHolder  courseViewHolder = new CourseViewHolder(view);
        return courseViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull CourseAdapter.CourseViewHolder holder, int position) {
     holder.courseImg.setImageResource(course_List.get(position).imageid);
     holder.cursename.setText(course_List.get(position).name);
        holder.cursedesc.setText(course_List.get(position).Desc);
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context.getApplicationContext(), CourseDetail.class);
                intent.putExtra("image_id", course_List.get(position).imageid);
                intent.putExtra("course_name", course_List.get(position).name);
                intent.putExtra("course desc", course_List.get(position).Desc);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.getApplicationContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return course_List.size();
    }

    public class CourseViewHolder extends RecyclerView.ViewHolder {
        TextView cursename , cursedesc;
        ImageView courseImg;
        RelativeLayout relativeLayout;
        public CourseViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            cursename = itemView.findViewById(R.id.cursename);
            cursedesc = itemView.findViewById(R.id.cursedesc);
            courseImg = itemView.findViewById(R.id.courseImg);
            relativeLayout = itemView.findViewById(R.id.layout_id);
        }
    }
}
