package com.example.sreejithpattery.samplefcmessaging;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = getIntent();
//        Log.d(TAG,"category"+i.getCategories().toString());
//        Log.d(TAG,"extras"+i.getExtras().toString());

    }

    public void btnGetFbIdClicked(View view) {// Get token
        String token = FirebaseInstanceId.getInstance().getToken();

        // Log and toast
        String msg = getString(R.string.msg_token_fmt, token);
        Log.d(TAG, msg);
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();

    }
}
