package com.example.vedeshkumar.emptylayouttestapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mobikul.emptylayout.EmptyFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtn(View view) {
        // To create a default empty page
//        new EmptyFragment().show(this);

        //To create a custom empty page
        new EmptyFragment()
                .setImageDrawableId(R.drawable.my_image)
                .setTitleText("Your Cart Is Empty")
                .setContentText("Add some product to your cart and view them here")
                .setButtonText("Continue Shopping")
                .setButtonOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getSupportFragmentManager().popBackStack();
                    }
                })
                .show(this, R.id.testing);
    }
}