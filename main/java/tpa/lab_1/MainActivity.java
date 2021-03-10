package tpa.lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.enterText);
        textView = (TextView) findViewById(R.id.displayText);
        button = findViewById(R.id.button);

        Context context = getApplicationContext();






        button.setOnClickListener(v -> {
            textView.setText(editText.getText());
//            Intent myIntent = new Intent(this, SecondActivity.class);
//            startActivity(myIntent);
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public void test(View view){
        Log.d("BUM","KBOOM");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("editText",editText.getText().toString());
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textView.setText(savedInstanceState.getString("editText"));
    }

    public void onStart() {
        super.onStart();
        Log.d("START","APEL START");
    }

    public void onResume() {
        super.onResume();
        Log.d("RESUME","APEL RESUME");
    }

    public void onPause() {
        super.onPause();
        Log.d("PAUSE","APEL PAUSE");
    }

    public void onStop() {
        super.onStop();
        Log.d("STOP","APEL STOP");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.d("DESTROY","APEL DESTROY");
    }

}