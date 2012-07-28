package cjag.android.ex01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btn01 = (Button) findViewById(R.id.btn01);
        btn01.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "ボタン１クリック", Toast.LENGTH_SHORT).show();
			}
		});
        
        Button btn02 = (Button) findViewById(R.id.btn02);
        btn02.setOnLongClickListener(new View.OnLongClickListener() {
			
			@Override
			public boolean onLongClick(View v) {
				Toast.makeText(getApplicationContext(), "ボタン2クリック", Toast.LENGTH_SHORT).show();
				return true;
			}
		});
    }
}