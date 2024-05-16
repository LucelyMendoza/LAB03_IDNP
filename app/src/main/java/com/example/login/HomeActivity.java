package com.example.login;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.idnp2024a.loginsample.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main),(v, insets)->{
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(SystemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/
        String accountEntity= getIntent().getStringExtra("ACCOUNT");
            Log.d("HomeActivity", accountEntity);
    }


}