package sg.edu.rp.c346.id20024466.l08demosimplesave;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        String hi = "wassup";
        Toast.makeText(this, hi,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        String bye = "bye lol";
        Toast.makeText(this, bye,Toast.LENGTH_SHORT).show();
    }
}