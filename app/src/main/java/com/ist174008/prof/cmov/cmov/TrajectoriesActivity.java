package com.ist174008.prof.cmov.cmov;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.TextView;

/**
 * Created by ist174008 on 21/03/2016.
 */
public class TrajectoriesActivity extends AppCompatActivity {

        @Override
        public void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);

            TextView tv=new TextView(this);
            tv.setTextSize(25);
            tv.setGravity(Gravity.CENTER_VERTICAL);
            tv.setText("This Is TRAJ Activity");

            setContentView(tv);
        }
    }

