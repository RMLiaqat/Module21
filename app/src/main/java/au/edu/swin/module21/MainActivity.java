package au.edu.swin.module21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long sysTime=System.currentTimeMillis();
        String TimeStr= DateFormat.format("kk:mm:ss", sysTime).toString();
        TextView tv1=(TextView) findViewById(R.id.tv);
        tv1.setText("Current Time is "+TimeStr);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("state", "Start Sate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("state", "Resume Sate");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("state", "Stop Sate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("state", "RE Start Sate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("state", "Destroy Sate");
    }

}