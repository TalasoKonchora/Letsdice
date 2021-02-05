package talaso.learning.letsdice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initializing the assets
        Button btnroll = findViewById(R.id.btnRoll);
        final ImageView imgdice1 = findViewById(R.id.imgDice1);
        final ImageView imgdice2 = findViewById(R.id.imgDice2);
        final int[] dicearray ={
          R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };

        //Button listener
        btnroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("dice", "The button has been clicked: ");
                Random number = new Random();
                int generatednumber = number.nextInt(6);
                imgdice1.setImageResource(dicearray [generatednumber]);
                generatednumber = number.nextInt(6);
                imgdice2.setImageResource(dicearray [generatednumber]);
            }
        });


    }
}