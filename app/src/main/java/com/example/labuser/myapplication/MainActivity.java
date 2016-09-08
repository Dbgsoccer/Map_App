package com.example.labuser.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*protected void btnClicked(View view){
        Intent intent = new intent(this,userInput.class);
        EditText txt = (EditText)findViewById(R.id.userInput).getTe;
        startActivity(intent);
    }
*/
    protected void makeMap(View view){
        String input = ((EditText)findViewById(R.id.userInput)).getText().toString();
        Uri data = Uri.parse(""+input);
        Intent intent=new intent(intent.ACTION_m);
        startActivity();
    }
}
