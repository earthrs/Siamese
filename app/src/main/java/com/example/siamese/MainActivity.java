package com.example.siamese;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    SensorManager sensorManager;
        private static final int POLL_INTERVAL = 500;
        private Handler hdr = new Handler();
        private PowerManager.WakeLock wl;
        SensorInfo sensor_info = new SensorInfo();
        Boolean shown_dialog = false;
        private static final int shake_threshold = 15;

        private Runnable pollTask = new Runnable() {
            public void run() {
                showDialog();
                hdr.postDelayed(pollTask, POLL_INTERVAL);
            }
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            sensorManager=(SensorManager)getSystemService(SENSOR_SERVICE);
        }

        @SuppressLint("WakelockTimeout")
        @Override
        protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_NORMAL);
            hdr.postDelayed(pollTask, POLL_INTERVAL);
        }
        @Override
         public void onSensorChanged(SensorEvent event) {
            int type = event.sensor.getType();
        if (type == Sensor.TYPE_ACCELEROMETER) {
            sensor_info.accX=event.values[0];
            sensor_info.accY=event.values[1];
            sensor_info.accZ=event.values[2];
            }
         }

        @Override
        public void onAccuracyChanged(Sensor sensor, int i) {

        }
        @Override
        protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
        hdr.removeCallbacks(pollTask);
        }


         static class SensorInfo{
            float accX, accY, accZ;
    }

    public void showDialog() {
        Typeface fonts =  Typeface.createFromAsset(getAssets(),"fonts/DSNYWR__.TTF");

        if( (Math.abs(sensor_info.accX)>shake_threshold) || (Math.abs(sensor_info.accY)>shake_threshold) || (Math.abs(sensor_info.accZ)>shake_threshold) ) {
            if(!shown_dialog) {
                shown_dialog = true;
                Random rand = new Random();
                 int paperNo = rand.nextInt(23)+1;

                final AlertDialog.Builder viewDialog = new AlertDialog.Builder(this);


                if(paperNo == 1){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.one);
                }if(paperNo == 2){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.two);
                }if(paperNo == 3){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.three);
                }if(paperNo == 4){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.four);
                }if(paperNo == 5){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.five);
                }if(paperNo == 6){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.six);
                }if(paperNo == 7){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.seven);
                }if(paperNo == 8){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.eight);
                }if(paperNo == 9){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.nine);
                }if(paperNo == 10){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.ten);
                }if(paperNo == 11){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.eleven);
                }if(paperNo == 12){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.twelve);
                }if(paperNo == 13){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.thirteen);
                }if(paperNo == 14){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.fourteen);
                }if(paperNo == 15){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.fifteen);
                }if(paperNo == 16){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.sixteen);
                }if(paperNo == 17){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.seventeen);
                }if(paperNo == 18){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.eighteen);
                }if(paperNo == 19){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.nineteen);
                }if(paperNo == 20){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.twenty);
                }if(paperNo == 21){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.twentyOne);
                }if(paperNo == 22){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.twentyTwo);
                }if(paperNo == 23){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.twentyThree);
                }if(paperNo == 24){
                    viewDialog.setTitle("เซียมซีหมายเลขที่ "+paperNo );
                    viewDialog.setMessage(R.string.twentyFour);
                }



                viewDialog.setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                shown_dialog = false;
                            }
                        });
                viewDialog.show();
            }//end if
        }//end if
    }
}
