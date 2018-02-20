package comdeep.example.classroom.vsp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


    }
    public void openInauguration(View view) {
        Intent i = new Intent(this, InaugurationActivity.class);
        startActivity(i);
    }
    public void openPerson(View view) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }
}
