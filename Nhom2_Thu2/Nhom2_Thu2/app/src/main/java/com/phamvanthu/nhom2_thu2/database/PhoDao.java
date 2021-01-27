package com.phamvanthu.nhom2_thu2.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.phamvanthu.nhom2_thu2.Pho;

import java.util.List;

@Dao
public interface PhoDao {
    @Query("SELECT * FROM Pho")
    List<Pho> getAll();

    @Query("DELETE FROM Pho")
    void deleteAll();

    @Insert
    void insert(Pho... phos);

    @Delete
    void delete(Pho... phos);

    @Update
    void update(Pho phos);
}
