package net.shreygupta.icccricketresults;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.button1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater l = getLayoutInflater();
                View v1 = l.inflate(R.layout.my_layout, null);
                Toast t = new Toast(getApplicationContext());
                t.setGravity(Gravity.BOTTOM, 0, 0);
                t.setView(v1);
                t.show();
            }
        });

    }
}