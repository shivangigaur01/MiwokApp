package com.example.miwok;

import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class NumbersClickListener implements View.OnClickListener {

    @Override

    public void onClick(View view) {
        Toast.makeText(view.getContext(),"Open the list of numbers",Toast.LENGTH_SHORT).show();}
}


