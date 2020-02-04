package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView myCakeView = findViewById(R.id.cakeview);
        CakeController myCakeController = new CakeController(myCakeView);

        Button myBlowOut = findViewById(R.id.blowButton);
        myBlowOut.setOnClickListener(myCakeController);

        Switch myCandles = findViewById(R.id.isCandles);
        myCandles.setOnCheckedChangeListener(myCakeController);

        SeekBar mySeekBar = findViewById(R.id.candleSlide);
        mySeekBar.setOnSeekBarChangeListener(myCakeController);
    }
    public void goodbye(View button) {
        Log.i("button","Goodbye");
    }
}
