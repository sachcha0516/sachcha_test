package com.example.myapplication.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.myapplication.Entities.User;

import java.util.List;

@Dao
public interface UserDao {
    // allowing the insert of the same word multiple times by passing a
    // conflict resolution strategy
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(User user);

    @Query("DELETE FROM Student_Registry")
    void deleteAll();

    @Query("SELECT * FROM Student_Registry")
    LiveData<List<User>> getUserNames();
}
