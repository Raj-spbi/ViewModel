package com.aakash.viewmodelbestpractice.viewModels;

import android.app.Application;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    public int count = 0;

    public MainViewModel(int counter) {
        count = counter;
    }

    public void fun1() {
        count++;
    }
}

/*TODO, For View Model Purpose Only It was Okay,But now We are gonne use ViewModelFactory!!!*/

/*public class MainViewModel extends ViewModel {
    public int count = 0;

    public void fun1() {
        count++;
    }
}*/