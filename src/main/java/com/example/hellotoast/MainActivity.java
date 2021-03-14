package com.example.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    private int count;
    private TextView showcount;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showcount = (TextView) findViewById(R.id.textView);
    }

    public void showToast(View view)
    {
        Toast toast=Toast.makeText(this,"TOAST TO YOU!",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view)
    {
        count++;
        if(showcount!=null)
            showcount.setText(Integer.toString(count));
    }
}

