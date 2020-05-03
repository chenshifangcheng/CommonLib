package com.chwyatt.commonlib.base;

import android.os.Bundle;
import android.os.PersistableBundle;

import com.chwyatt.commonlib.logger.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d4lifecycle(this, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d4lifecycle(this, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d4lifecycle(this, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d4lifecycle(this, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d4lifecycle(this, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d4lifecycle(this, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d4lifecycle(this, "onRestart");
    }

    @Override
    public void onAttachFragment(@NonNull Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.d4lifecycle(this, "onAttachFragment");
    }
}
