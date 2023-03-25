package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPlayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_players);

        final EditText playerone = findViewById(R.id.playerOneName);
        final EditText playertwo = findViewById(R.id.playerTwoName);
        final Button startbutn = findViewById(R.id.start);


        startbutn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String getplayeronename = playerone.getText().toString();
                final String getplayertwoname = playertwo.getText().toString();

                if(getplayeronename.isEmpty() || getplayertwoname.isEmpty()){
                    Toast.makeText(AddPlayers.this,"Please Enter Player Names",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(AddPlayers.this,MainActivity.class);
                    intent.putExtra("playerOne",getplayeronename);
                    intent.putExtra("playerTwo",getplayertwoname);
                    startActivity(intent);
                }
            }
        });
    }
}