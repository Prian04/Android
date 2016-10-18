package com.prian.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	int num1,num2,sum,sub,mul,div;
	Button btn1,btn2,btn3,btn4;
	EditText edt1,edt2;
	TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1 = (Button) findViewById(R.id.button1);
		btn2 = (Button) findViewById(R.id.button2);
		btn3 = (Button) findViewById(R.id.button3);
		btn4 = (Button) findViewById(R.id.button4);
		edt1 = (EditText) findViewById(R.id.editText1);
		edt2 = (EditText) findViewById(R.id.editText2);
		tv1 = (TextView) findViewById(R.id.textView1);
      /*  try{
        num1 = Integer.parseInt(edt1.getText().toString().trim());
        num2 = Integer.parseInt(edt2.getText().toString().trim());
        } catch(Exception e){
        	System.out.println("Error" + e.getMessage());
        }*/
       
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try{
			        num1 = Integer.parseInt(edt1.getText().toString().trim());
			        num2 = Integer.parseInt(edt2.getText().toString().trim());
				sum = num1+num2;				
				tv1.setText(Integer.toString(sum));
				} catch(Exception e){
					System.out.println(e.getMessage());
				}
			}
		});
        btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try{
		        num1 = Integer.parseInt(edt1.getText().toString().trim());
		        num2 = Integer.parseInt(edt2.getText().toString().trim());
				sub = num1-num2;
				tv1.setText(Integer.toString(sub));	
				} catch(Exception e){
					System.out.println(e.getMessage());
				}
			}
		});
        btn3.setOnClickListener(new View.OnClickListener() {
	
	        @Override
	        public void onClick(View v) {
	        	try{
		        num1 = Integer.parseInt(edt1.getText().toString().trim());
		        num2 = Integer.parseInt(edt2.getText().toString().trim());
	        	mul = num1*num2;
				tv1.setText(Integer.toString(mul));
	        	} catch(Exception e){
	        		System.out.println(e.getMessage());
	        	}
	}
});
        btn4.setOnClickListener(new View.OnClickListener() {
	
	        @Override
	        public void onClick(View v) {
	        	try{
		        num1 = Integer.parseInt(edt1.getText().toString().trim());
		        num2 = Integer.parseInt(edt2.getText().toString().trim());
		        if(num2 !=0){
	        	div = num1/num2;
				tv1.setText(Integer.toString(div));
				} else {
					tv1.setText("Number not divide by 0");
				}
	        	} catch(ArithmeticException e){
	        		System.out.println("Error: Don't divide a number by zero");
	        	}
	}
}); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
