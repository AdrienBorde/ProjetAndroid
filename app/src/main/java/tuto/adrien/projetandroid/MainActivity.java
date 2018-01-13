package tuto.adrien.projetandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final ImageButton vanillabutton = findViewById(R.id.vanillabutton);
        vanillabutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Vanilla.class);
                startActivity(intent);
            }
        });

        final ImageButton bcbutton = findViewById(R.id.bcbutton);
        final ImageButton wotlkbutton = findViewById(R.id.wotlkbutton);
        final ImageButton catabutton = findViewById(R.id.catabutton);
        final ImageButton mopbutton = findViewById(R.id.mopbutton);
        final ImageButton wodbutton = findViewById(R.id.wodbutton);
        final ImageButton legionbutton = findViewById(R.id.legionbutton);
    }
}
