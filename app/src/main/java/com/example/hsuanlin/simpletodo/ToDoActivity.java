package com.example.hsuanlin.simpletodo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * Created by hsuanlin on 2015/7/22.
 */
public class ToDoActivity extends Activity {
    @Override
    protected  void onCreate( Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
