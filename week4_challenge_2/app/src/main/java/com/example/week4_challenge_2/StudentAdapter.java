package com.example.week4_challenge_2;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    private final List<Student> students;

    public StudentAdapter(List<Student> students) {
        this.students = students;
    }
    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=View.inflate(parent.getContext(),R.layout.student_row,null);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student=students.get(position);
        holder.getFirstNameText().setText("First Name : "+student.getFirstName());
        holder.getLastNameText().setText("Last Name : "+student.getLastName());

        if (position % 2 == 0) {
            holder.itemView.findViewById(R.id.item).setBackgroundColor(Color.LTGRAY);
        }

    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
