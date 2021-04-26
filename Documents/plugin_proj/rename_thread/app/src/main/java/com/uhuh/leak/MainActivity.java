package com.uhuh.leak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


    new Thread(new Runnable() {
      @Override
      public void run() {
        Log.e("LM" , "start thread action");
      }
    }).start();

  }
}
