package com.eightstudio.danboru.materialdesain.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.eightstudio.danboru.materialdesain.MaterialMain;
import com.eightstudio.danboru.materialdesain.R;

/**
 * Created by Danboru on 17/08/2016.
 */
public class SplashScreen extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.splash_screen);

        Intent utama = new Intent(getBaseContext(), MaterialMain.class);

        Thread thread = new Thread(
                new Runnable() {
                    @Override
                    public void run() {

                        try{

                            Thread.sleep(3000);

                        }catch(Exception e){

                            e.printStackTrace();
                        }

                    }
                }
        );

    }
}
