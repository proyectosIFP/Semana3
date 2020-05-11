package com.example.aplicacinftc.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aplicacinftc.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class tab1Fragment extends Fragment {

    private View view;

    public tab1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_tab1, container, false);

        return view;
    }
}
