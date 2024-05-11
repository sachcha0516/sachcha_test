package com.example.myapplication;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.myapplication.DAO.UserDao;
import com.example.myapplication.Entities.User;

import java.util.List;

public class UserRepository {
    private UserDao mUserDao;
    //private LiveData<List<User>> mAllUsers;

    // Note that in order to unit test the WordRepository, you have to remove the Application
    // dependency. This adds complexity and much more code, and this sample is not about testing.
    // See the BasicSample in the android-architecture-components repository at
    // https://github.com/googlesamples
    UserRepository(Application application) {
        UserRoomDatabase db = UserRoomDatabase.getDatabase(application);
        mUserDao = db.userDao();
        //mAllUsers = mUserDao.getUserNames();
    }

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    LiveData<List<User>> getAllUsers() {
        return mUserDao.getUserNames();
    }


    // You must call this on a non-UI thread or your app will throw an exception. Room ensures
    // that you're not doing any long running operations on the main thread, blocking the UI.
    void insert(User user) {
        UserRoomDatabase.databaseWriteExecutor.execute(() -> {
            mUserDao.insert(user);
        });
    }
}