package com.example.ivan.proyectofinalv2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by IVAN on 13/11/2017.
 */

public class EnterRunningData extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running_entry);

        TextView tv1;
        EditText edt1, edt2, edt3, edt4;
        Button ok;

        tv1 = (TextView) findViewById(R.id.tv_carrera);
        edt1 = (EditText) findViewById(R.id.edt_fecha);
        edt2 = (EditText) findViewById(R.id.edt_hora);
        edt3 = (EditText) findViewById(R.id.edt_min);
        edt4 = (EditText) findViewById(R.id.edt_seg);
        ok = (Button) findViewById(R.id.button);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Actividad Guardada", Toast.LENGTH_LONG).show();
            }
        });
    }
}
