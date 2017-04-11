package com.example.jorendegoede.studentname_pset1;

import android.content.res.Configuration;
import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // imageviews
        ImageView hat = (ImageView) findViewById(R.id.Hat);
        ImageView ears = (ImageView) findViewById(R.id.Ears);
        ImageView mustache = (ImageView) findViewById(R.id.Mustache);
        ImageView eyes = (ImageView) findViewById(R.id.Eyes);
        ImageView arms = (ImageView) findViewById(R.id.Arms);
        ImageView mouth = (ImageView) findViewById(R.id.Mouth);
        ImageView eyebrows = (ImageView) findViewById(R.id.Eyebrows);
        ImageView nose = (ImageView) findViewById(R.id.Nose);
        ImageView glasses = (ImageView) findViewById(R.id.Glasses);
        ImageView shoes = (ImageView) findViewById(R.id.Shoes);
        // save visibility
        savedInstanceState.putInt("hat", hat.getVisibility());
        savedInstanceState.putInt("ears", ears.getVisibility());
        savedInstanceState.putInt("mustache", mustache.getVisibility());
        savedInstanceState.putInt("eyes", eyes.getVisibility());
        savedInstanceState.putInt("arms", arms.getVisibility());
        savedInstanceState.putInt("mouth", mouth.getVisibility());
        savedInstanceState.putInt("eyebrows", eyebrows.getVisibility());
        savedInstanceState.putInt("nose", nose.getVisibility());
        savedInstanceState.putInt("glasses", glasses.getVisibility());
        savedInstanceState.putInt("shoes", shoes.getVisibility());

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);

        // restore visibility
        int hat = savedInstanceState.getInt("hat");
        if (hat == 0) {
            hat.setVisibility(View.VISIBLE);
        }
        else if (hat == 4) {
            hat.setVisibility(View.INVISIBLE);
        }
        break;
    }

    public void onCheckboxClicked (View view) {
        // if checked
        boolean checked = ((CheckBox) view).isChecked();
        // ImageViews
        ImageView hat = (ImageView) findViewById(R.id.Hat);
        ImageView ears = (ImageView) findViewById(R.id.Ears);
        ImageView mustache = (ImageView) findViewById(R.id.Mustache);
        ImageView eyes = (ImageView) findViewById(R.id.Eyes);
        ImageView arms = (ImageView) findViewById(R.id.Arms);
        ImageView mouth = (ImageView) findViewById(R.id.Mouth);
        ImageView eyebrows = (ImageView) findViewById(R.id.Eyebrows);
        ImageView nose = (ImageView) findViewById(R.id.Nose);
        ImageView glasses = (ImageView) findViewById(R.id.Glasses);
        ImageView shoes = (ImageView) findViewById(R.id.Shoes);

        switch (view.getId()) {
            // Hat
            case R.id.Checkbox_Hat:
                if (checked) {
                    hat.setVisibility(View.VISIBLE);
                }
                else {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;
            // Ears
            case R.id.Checkbox_Ears:
                if (checked) {
                    ears.setVisibility(View.VISIBLE);
                }
                else {
                    ears.setVisibility(View.INVISIBLE);
                }
                break;
            // Mustache
            case R.id.Checkbox_Mustache:
                if (checked) {
                    mustache.setVisibility(View.VISIBLE);
                }
                else {
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;
            // Eyes
            case R.id.Checkbox_Eyes:
                if (checked) {
                    eyes.setVisibility(View.VISIBLE);
                }
                else {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
            // Arms
            case R.id.Checkbox_Arms:
                if (checked) {
                    arms.setVisibility(View.VISIBLE);
                }
                else {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
            // Mouth
            case R.id.Checkbox_Mouth:
                if (checked) {
                    mouth.setVisibility(View.VISIBLE);
                }
                else {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;
            // Eyebrows
            case R.id.Checkbox_Eyebrows:
                if (checked) {
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            // Nose
            case R.id.Checkbox_Nose:
                if (checked) {
                    nose.setVisibility(View.VISIBLE);
                }
                else {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
            // Glasses
            case R.id.Checkbox_Glasses:
                if (checked) {
                    glasses.setVisibility(View.VISIBLE);
                }
                else {
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;
            // Shoes
            case R.id.Checkbox_Shoes:
                if (checked) {
                    shoes.setVisibility(View.VISIBLE);
                }
                else {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}
