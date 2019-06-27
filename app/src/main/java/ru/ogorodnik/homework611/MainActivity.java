package ru.ogorodnik.homework611;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView textView2;
EditText edittext;
static final String TEXTVIEW_TEXT = "text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView2 = (TextView)findViewById(R.id.textView2);
        Log.d("Lifecycle", "onStart()");
        Toast.makeText(MainActivity.this, "onStart()",  Toast.LENGTH_LONG).show();
        textView2.append("\n" + "onStart()");

        String text = "";
        if (savedInstanceState != null && savedInstanceState.containsKey(TEXTVIEW_TEXT)){
            text = savedInstanceState.getString(TEXTVIEW_TEXT);
            textView2.setText(text + "\n" + "Bundle = not null");
            Log.d("Lifecycle", "Bundle = not null");
        }
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d("Lifecycle", "onPostCreate()");
        Toast.makeText(MainActivity.this, "onPostCreate()", Toast.LENGTH_LONG).show();
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.append("\n" + "onPostCreate()");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Lifecycle", "onStart()");
        Toast.makeText(MainActivity.this, "onStart()", Toast.LENGTH_LONG).show();
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.append("\n" + "onStart()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Lifecycle", "onResume()");
        Toast.makeText(MainActivity.this, "onResume()", Toast.LENGTH_LONG).show();
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.append("\n" + "onResume()");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Lifecycle", "onPause()");
        Toast.makeText(MainActivity.this, "onPause()", Toast.LENGTH_LONG).show();
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.append("\n" + "onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Lifecycle", "onStop()");
        Toast.makeText(MainActivity.this, "onStop()", Toast.LENGTH_LONG).show();
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.append("\n" + "onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Lifecycle", "onDestroy()");
        Toast.makeText(MainActivity.this, "onDestroy()", Toast.LENGTH_LONG).show();
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.append("\n" + "onDestroy()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("Lifecycle", "onRestart()");
        Toast.makeText(MainActivity.this, "onRestart()", Toast.LENGTH_LONG).show();
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.append("\n" + "onRestart()");
    }

    @Override
    protected void onPostResume(){
        super.onPostResume();
        Log.d("Lifecycle", "onPostResume()");
        Toast.makeText(MainActivity.this, "onPostResume()", Toast.LENGTH_LONG).show();
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.append("\n" + "onPostResume()");
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.d("Lifecycle", "onKeyLongPress()");
        Toast.makeText(MainActivity.this, "onKeyLongPress()", Toast.LENGTH_LONG).show();
        textView2.append("\n" + "onKeyLongPress()");
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d("Lifecycle", "onKeyDown()");
        Toast.makeText(MainActivity.this, "onKeyDown()", Toast.LENGTH_LONG).show();
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.append("\n" + "onKeyDown()");
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
        Log.d("Lifecycle", "onBackPressed()");
        Toast.makeText(MainActivity.this, "onBackPressed()", Toast.LENGTH_LONG).show();
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.append("\n" + "onBackPressed()");
    }

    @Override
    public void onSaveInstanceState(Bundle saveInstanceState) {
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        saveInstanceState.putString(TEXTVIEW_TEXT, textView2.getText().toString()); // сохраняем текст
        Log.d("Lifecycle", "onSaveInstanceState()");
        Toast.makeText(MainActivity.this, "onSaveInstanceState()", Toast.LENGTH_LONG).show();
        textView2.append("\n" + "onSaveInstanceState()");
        super.onSaveInstanceState(saveInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle onRestoreInstanceState) {
        Log.d("Lifecycle", "onRestoreInstanceState()");
        Toast.makeText(MainActivity.this, "onRestoreInstanceState()", Toast.LENGTH_LONG).show();
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.append("\n" + "onRestoreInstanceState()");
        super.onRestoreInstanceState(onRestoreInstanceState);
    }
}
