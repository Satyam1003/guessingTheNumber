package com.satyamstudio.guessingthenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void checkGuess(View view){

        EditText guessedNumber = (EditText)findViewById(R.id.guessedNumber );
        String guessedNumberString = guessedNumber.getText().toString();
        int guessedNumberInt = Integer.parseInt(guessedNumberString);
        String message="";

        if(guessedNumberInt > randomNumber){
            message="Too High !!";
        }
        else if(guessedNumberInt < randomNumber){
            message="Too Low !!";
        }
        else{
            message="Correct, Well Done !!";
        }

        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 

        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(21);

    }
}
