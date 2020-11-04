package com.alhumdulillah.androidalertdialogexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";


    private Button firstAlert,secondAlert,thirdAlert,sampleListView,checkBox,radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initialize();

        //set on click listener
        firstAlert.setOnClickListener(this);
        secondAlert.setOnClickListener(this);
        thirdAlert.setOnClickListener(this);
        sampleListView.setOnClickListener(this);
        checkBox.setOnClickListener(this);
        radioButton.setOnClickListener(this);

    }
    public void initialize(){
        firstAlert = findViewById(R.id.firstAlert);
        secondAlert = findViewById(R.id.secondAlert);
        thirdAlert = findViewById(R.id.thirdAlert);
        sampleListView = findViewById(R.id.sampleListView);
        checkBox = findViewById(R.id.checkButton);
        radioButton = findViewById(R.id.radioButton);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.firstAlert){
            alertOne();
        }else if (v.getId() == R.id.secondAlert){
            alertTwo();
        }else if (v.getId() == R.id.thirdAlert){
            alertThree();
        }else if (v.getId() == R.id.sampleListView){
            alertFour();
        }else if (v.getId() == R.id.radioButton){
            alertFive();
        }else if (v.getId() == R.id.checkButton){
            alertSix();
        }
    }



    public void alertOne(){
        //create anonymize class and set on positive button
        new AlertDialog.Builder(MainActivity.this)
                .setCancelable(false)
                .setTitle("Custom Title")
                .setMessage("Set Only Positive Button")
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        showToast("You Clicked OK");
                        dialog.cancel();
                    }
                })
                .show();
    }



    public void alertTwo(){
        //create anonymize class and set on positive button
        new AlertDialog.Builder(MainActivity.this)
                .setCancelable(false)
                .setTitle("Custom Title")
                .setMessage("Set Two Diffirent Button Alert Dialog")
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        showToast("You Clicked Ok");
                        dialog.cancel();
                    }
                })
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        showToast("You Clicked Cancel");
                        dialog.cancel();
                    }
                })
                .show();
    }




    public void alertThree(){
        //create anonymize class and set on positive button
        new AlertDialog.Builder(MainActivity.this)
                .setCancelable(false)
                .setMessage("Set Three Alert Dialog Button")
                .setTitle("Custom Title")
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        showToast("You Clicked Ok");
                        dialog.cancel();
                    }
                })
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        showToast("You Clicked Cancel");
                        dialog.cancel();
                    }
                })
                .setNeutralButton("CENTER", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        showToast("You Clicked Neutral");
                        dialog.cancel();
                    }
                })
                .show();
    }



    public void alertFour(){

        final CharSequence[]items = {"Xiaomi","Nokia","HTC","Sumsung","Readmi","Hornet","Appachi","KTM",
                "Xiaomi","Nokia","HTC","Sumsung","Readmi","Hornet","Appachi","KTM"};
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Make Your Selection");
        builder.setCancelable(false);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                showToast("You Chooses: "+items[which]);
                dialog.dismiss();
            }
        });
        builder.show();

    }


    public void alertFive(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Make Your Selection");
        builder.setCancelable(false);
       
        builder.show();
    }


    public void alertSix(){

    }


    public void showToast(String msg){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();
    }
}