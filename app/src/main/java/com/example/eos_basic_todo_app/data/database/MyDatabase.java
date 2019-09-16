package com.example.eos_basic_todo_app.data.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.eos_basic_todo_app.data.dao.TodoDao;
import com.example.eos_basic_todo_app.data.entity.TodoItem;

@Database(version = 1, entities = {TodoItem.class})
public abstract class MyDatabase extends RoomDatabase{
    abstract public TodoDao todoDao();

    private static MyDatabase myDatabase;

    public static MyDatabase getInstance(Context context){
        if(myDatabase == null){
            myDatabase = Room.databaseBuilder(context.getApplicationContext(),
                    MyDatabase.class,"myDatabase.db")
                    .allowMainThreadQueries().build();
        }
    }
}
