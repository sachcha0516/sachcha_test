package com.example.myapplication;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.myapplication.Entities.User;

import java.util.List;

public class UserViewModel extends AndroidViewModel {
    private UserRepository mRepository;

    public UserViewModel (Application application) {
        super(application);
        mRepository = new UserRepository(application);
    }

    LiveData<List<User>> getAllUsers() { return mRepository.getAllUsers(); }

    public void insert(User user) { mRepository.insert(user); }
}
