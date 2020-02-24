package com.example.drawboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MyView myView;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        myView = findViewById(R.id.draw);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        myView.clean();
            }
        });
    }
}
