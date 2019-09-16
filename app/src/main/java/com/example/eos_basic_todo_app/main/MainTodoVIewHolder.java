package com.example.eos_basic_todo_app.main;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eos_basic_todo_app.R;
import com.example.eos_basic_todo_app.data.entity.TodoItem;

public class MainTodoVIewHolder extends RecyclerView.ViewHolder {

    private TextView todo_tv_title;
    private CheckBox todo_cb;

    public MainTodoVIewHolder(@NonNull View itemView) {
        super(itemView);

        todo_tv_title = itemView.findViewById(R.id.todo_tv_title);
        todo_cb = itemView.findViewById(R.id.todo_cb);
    }
    public void onBind(TodoItem item){
        todo_tv_title.setText(item.getTitle());
        todo_cb.setChecked();

    }
}
