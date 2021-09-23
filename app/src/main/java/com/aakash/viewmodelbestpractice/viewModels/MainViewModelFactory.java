package com.aakash.viewmodelbestpractice.viewModels;

import android.app.Application;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class MainViewModelFactory implements ViewModelProvider.Factory {
    private Application mApplication;
    private int mParam;




    public MainViewModelFactory(Application application, int param) {
        mApplication = application;
        mParam = param;
    }


    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        return (T) new MainViewModel(mParam);
//        return (T) new MainViewModel(mApplication, mParam);  if you need context in ViewModel as well then you can pass this as an argument
    }
}

