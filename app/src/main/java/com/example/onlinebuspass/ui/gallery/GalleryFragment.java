package com.example.onlinebuspass.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.onlinebuspass.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    public FragmentGalleryBinding binding;


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
