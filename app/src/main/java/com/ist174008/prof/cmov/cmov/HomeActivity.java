package com.ist174008.prof.cmov.cmov;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_home);

    }

    public void onBookBike(View view) {
        Intent intent = new Intent(this, BookBikeActivity.class);
        startActivity(intent);

    }

    public void onSocial(View view) {
        Intent intent = new Intent(this, SocialActivity.class);
        startActivity(intent);

    }

    public void onUserInfo(View view) {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);

    }

    public void onTrajectories(View view) {
        Intent intent = new Intent(this, TrajectoriesActivity.class);
        startActivity(intent);

    }

}
