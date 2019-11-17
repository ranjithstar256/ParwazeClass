package com.example.parwazeclass;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    CheckBox c;
    RadioGroup r;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        r=findViewById(R.id.rd);
        c=findViewById(R.id.checkBox);
    }

    public void stat(View view) {
        if (r.getCheckedRadioButtonId() == R.id.radioButton) {
            s = "A";
        } else {
            s = "B";
        }
        Toast.makeText(this, "" + c.isChecked() + "\n" + s, Toast.LENGTH_SHORT).show();
    }
    public void par(View view) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this,onDateSetListener,2012,7,20);
        datePickerDialog.show();
    }
    DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            textView.setText(""+dayOfMonth+"/"+month+"/"+year);
        }
    };
    public void tim(View view) {
    }
}
