package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener{

    private CakeView myCakeView;
    private CakeModel myCakeModel;


        public CakeController(CakeView myCake){
            myCakeView = myCake;
            myCakeModel = myCakeView.getCakeModel();
        }
        @Override
        public void onClick(View v){
            myCakeModel.lit = false;
            myCakeView.invalidate();
            Log.d("blowButton","I have been blown out.");
        }
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            myCakeModel.hasCandles = isChecked;
            myCakeView.invalidate();
            Log.d("isCandles","Do I have candles?");
        }
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
            myCakeModel.numCandles = progress;
            myCakeView.invalidate();
            Log.d("candleSlide","Slide to the left/right.");
        }
        @Override
        public void onStartTrackingTouch(SeekBar seekBar){
            //empty
        }
        public void onStopTrackingTouch(SeekBar seekBar){
            //empty
        }
}
