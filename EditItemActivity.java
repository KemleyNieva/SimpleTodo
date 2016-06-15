package com.codepath.simepletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class EditItemActivity extends AppCompatActivity {
 int pos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_edit_item);
        pos = getIntent().getIntExtra("pos", 0);
        String item = getIntent().getStringExtra("text");
        EditText etNewItem = (EditText) findViewById(R.id.editText);
        etNewItem.setText(item);

    }

    public void onSubmit(View v){
        EditText etName = (EditText) findViewById(R.id.editText);
        // Prepare data intent
        Intent data = new Intent();
        // Pass relevant data back as a result
        data.putExtra("change", etName.getText().toString());
        data.putExtra("pos", pos); // ints work too
        // Activity finished ok, return the data
        setResult(RESULT_OK, data); // set result code and bundle data for response
        finish(); // closes the activity, pass data to parent


    }

}
