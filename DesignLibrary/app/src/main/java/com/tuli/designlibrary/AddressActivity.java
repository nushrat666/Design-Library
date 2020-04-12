package com.tuli.designlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AddressActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        Intent intent= getIntent();

        String name= intent.getStringExtra("name");
        String Id= intent.getStringExtra("Id");
        String Designation= intent.getStringExtra("Designation");

        Employee employee=(Employee)intent.getSerializableExtra("employee");

        ((TextView)findViewById(R.id.show)).setText(name+"\n"+Id+"\n"+Designation
                +"\n"+employee);


    }
}
