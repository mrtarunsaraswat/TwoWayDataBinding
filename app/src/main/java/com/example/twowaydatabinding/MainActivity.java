package com.example.twowaydatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.twowaydatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Contact contact = new Contact( "Tarun","mrtarunaraswat@gmail.com" );
        mainBinding = DataBindingUtil.setContentView( this,R.layout.activity_main );
        mainBinding.setContact( contact );
    }
}
