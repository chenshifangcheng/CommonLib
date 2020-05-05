package com.chwyatt.commonlib.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chwyatt.commonlib.logger.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BaseFragment extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(this, "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(this, "onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d(this, "onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(this, "onViewCreated");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(this, "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(this, "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(this, "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(this, "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(this, "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(this, "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(this, "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(this, "onDetach");
    }

    @Override
    public void onAttachFragment(@NonNull Fragment childFragment) {
        super.onAttachFragment(childFragment);
        Log.d(this, "onAttachFragment");
    }
}
