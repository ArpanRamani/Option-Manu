package com.example.optionmanu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.content.ClipData;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initView();
    }

    private void initView() {

        btnClick = findViewById(R.id.btnClick);

        btnClick.setOnClickListener(v->{
            PopupMenu popup = new PopupMenu(MainActivity.this, btnClick);

            popup.getMenuInflater()
                    .inflate(R.menu.option_manu_activity, popup.getMenu());

            popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    switch(item.getItemId()){

                        case R.id.New:
                            Toast.makeText(MainActivity.this, "New button click", Toast.LENGTH_SHORT).show();
                            break;

                        case R.id.Group:
                            Toast.makeText(MainActivity.this, "Group button click", Toast.LENGTH_SHORT).show();
                            break;

                        case R.id.Setting:
                            Toast.makeText(MainActivity.this, "Setting button click", Toast.LENGTH_SHORT).show();
                            break;

                        case R.id.Exit:
                            Toast.makeText(MainActivity.this, "Exit button click", Toast.LENGTH_SHORT).show();
                            break;
                    }
                    return true;
                }
            });

            popup.show();
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_manu_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
//        switch(item.getItemId()){
//
//            case R.id.New:
//                Toast.makeText(this, "New button click", Toast.LENGTH_SHORT).show();
//                break;
//
//            case R.id.Group:
//                Toast.makeText(this, "Group button click", Toast.LENGTH_SHORT).show();
//                break;
//
//            case R.id.Setting:
//                Toast.makeText(this, "Setting button click", Toast.LENGTH_SHORT).show();
//                break;
//
//            case R.id.Exit:
//                Toast.makeText(this, "Exit button click", Toast.LENGTH_SHORT).show();
//                break;
//        }

        return true;
    }

}