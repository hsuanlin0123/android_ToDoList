package com.example.hsuanlin.simpletodo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class EditItemActivity extends ActionBarActivity {
    int targetPos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        targetPos = getIntent().getIntExtra("pos",0);
        String content = getIntent().getStringExtra("content");

        EditText etContent = (EditText) findViewById(R.id.mlText);
        etContent.setText("");
        etContent.append(content);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_edit_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onSubmit( View v){
        EditText etContent = (EditText) findViewById(R.id.mlText);
        String content = etContent.getText().toString();
        Intent data = new Intent();

        data.putExtra("pos", targetPos);
        data.putExtra("content", etContent.getText().toString());
        setResult(RESULT_OK,data);

        finish();
    }

}
