package com.tuli.designlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText employeeNameET;
    private TextInputEditText employeeIdET;
    private TextInputEditText employeeDesignationET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        employeeNameET=findViewById(R.id.employeeNameValue);
        employeeIdET=findViewById(R.id.employeeIdValue);
        employeeDesignationET=findViewById(R.id.employeeDesignationValue);
    }

    public void gotoAddressActivity(View view) {
        String name=employeeNameET.getText().toString();
        String Id=employeeIdET.getText().toString();
        String Designation=employeeDesignationET.getText().toString();

        Employee employee = new Employee();
        employee.setEmployeeName(name);
        employee.setEmployeeId(Id);
        employee.setEmployeeDesignation(Designation);

        Intent intent = new Intent(MainActivity.this,AddressActivity.class);
        intent.putExtra("employee",employee);

        intent.putExtra("name",name);
        intent.putExtra("Id",Id);
        intent.putExtra("Designation",Designation);



        startActivity(intent);

    }
}
