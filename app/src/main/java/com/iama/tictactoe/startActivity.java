package com.iama.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class startActivity extends AppCompatActivity {

    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button play = findViewById(R.id.start);
        et1 = findViewById(R.id.player1);
        et2 = findViewById(R.id.player2);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                i.putExtra("player1",et1.getText().toString());
                i.putExtra("player2",et2.getText().toString());
                startActivity(i);
            }
        });
    }
}
