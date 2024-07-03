package com.example.menu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private TextView resTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up the toolbar
        Toolbar toolbar = findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        // Initialize the TextView
        resTV = findViewById(R.id.resultTextView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_option1) {
            resTV.setText("Option 1 was selected. Displaying details about Option 1...");
            return true;
        } else if (id == R.id.menu_option2) {
            resTV.setText("Option 2 was selected. Displaying details about Option 2...");
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    public void onDummyButtonClick(View view) {
        Toast.makeText(this, "Dummy button clicked", Toast.LENGTH_SHORT).show();
    }
}
