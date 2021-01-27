package com.phamvanthu.nhom2_thu2.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.phamvanthu.nhom2_thu2.Pho;

@Database(entities = {Pho.class}, version = 1)
public abstract class PhoDatabase extends RoomDatabase {
    private static final String DATABASE_NAME="pho.db";
    private static PhoDatabase instance;

    public static synchronized PhoDatabase getInstance(Context context){
        if(instance==null){
            instance= Room.databaseBuilder(context.getApplicationContext(), PhoDatabase.class, DATABASE_NAME)
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
    public abstract PhoDao phoDao();
}
