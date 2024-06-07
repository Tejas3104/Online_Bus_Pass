package com.example.onlinebuspass.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.onlinebuspass.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Set text to the TextView
        binding.textHome.setText("Welcome to our innovative online bus pass app! Say goodbye to long queues and paper tickets. With our user-friendly interface, you can easily purchase and manage your bus passes from the comfort of your fingertips. Enjoy seamless travel experiences with our secure payment system and instant pass delivery. Whether you're a daily commuter or an occasional traveler, our app ensures hassle-free transportation at your convenience. Download now and embark on a journey of effortless mobility!");

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
