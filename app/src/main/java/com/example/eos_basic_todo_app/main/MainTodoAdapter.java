package com.example.eos_basic_todo_app.main;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eos_basic_todo_app.R;
import com.example.eos_basic_todo_app.data.entity.TodoItem;

import java.util.ArrayList;

public class MainTodoAdapter extends RecyclerView.Adapter<MainTodoVIewHolder> {

    private ArrayList<TodoItem>itemList = new ArrayList<>();

    @NonNull
    @Override
    public MainTodoVIewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MainTodoVIewHolder vIewHolder =
                new MainTodoVIewHolder(LayoutInflater.from(parent.getContext()).
                        inflate(R.layout.item_todo,parent,false));
        return vIewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainTodoVIewHolder holder, int position) {
        holder.onBind(itemList.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
