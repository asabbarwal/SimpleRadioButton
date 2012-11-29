package com.abhisheksabbarwal.simpleradiobuttonexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button displayBtn;
	private RadioGroup radioOptionGrp;
	private RadioButton radioOptBtn;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        displayBtn = (Button)findViewById(R.id.btnDisplay);
        
        displayBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				//Get Reference to Radio group which holds the radio buttons
				radioOptionGrp = (RadioGroup) findViewById(R.id.radioOpt);
				
				//Get id of selected radioButton
				int selectOptId = radioOptionGrp.getCheckedRadioButtonId();
				
				//Get Reference to the Selected RadioButton
				radioOptBtn = (RadioButton) findViewById(selectOptId);
				
				//Display value of the selected RadioButton
				Toast.makeText(getApplicationContext(), radioOptBtn.getText(), Toast.LENGTH_SHORT).show();
				
			}
		});
        
    }

}
