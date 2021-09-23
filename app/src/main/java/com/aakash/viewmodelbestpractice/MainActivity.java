package com.aakash.viewmodelbestpractice;

import android.app.Application;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import com.aakash.viewmodelbestpractice.databinding.ActivityMainBinding;
import com.aakash.viewmodelbestpractice.viewModels.MainViewModel;
import com.aakash.viewmodelbestpractice.viewModels.MainViewModelFactory;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainViewModel mainViewModel;
    Application application;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        application = (Application) getApplicationContext();
        setContentView(binding.getRoot());
        mainViewModel = new ViewModelProvider(this, new MainViewModelFactory(application, 10)).get(MainViewModel.class);
        setText();
        binding.button.setOnClickListener(v -> {
            mainViewModel.fun1();
            setText();
        });
    }

    private void setText() {
        binding.txtChange.setText(String.valueOf(mainViewModel.count));
    }
}











/*TODO For Only ViewModel Purpose it's Okay but now we are going to Use View Model Factory!!!*/
/*public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        setText();
        binding.button.setOnClickListener(v -> {
            mainViewModel.fun1();
            setText();
        });
    }

    private void setText() {
        binding.txtChange.setText(String.valueOf(mainViewModel.count));
    }
}*/