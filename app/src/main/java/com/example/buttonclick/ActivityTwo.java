package com.example.buttonclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener{
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Button button = (Button) findViewById(R.id.btn2);

        editText = (EditText) findViewById(R.id.text);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn2:
                String inputText = editText.getText().toString();
                Toast.makeText(ActivityTwo.this, inputText, Toast.LENGTH_SHORT).show();
                break;
            default:
                break;

        }

    }
}
