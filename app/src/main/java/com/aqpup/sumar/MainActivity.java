package com.aqpup.sumar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import model.Operacion;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etNumber1 =(EditText)findViewById(R.id.etNumber1);
        final EditText etNumber2 =(EditText)findViewById(R.id.etNumber2);

        Button bSumar = (Button)findViewById(R.id.bSumar);

        final TextView tvResult =(TextView)findViewById(R.id.tvResult);

        final Operacion operacion = new Operacion();

        bSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int number1 = Integer.valueOf(etNumber1.getText().toString());
                int number2 = Integer.valueOf(etNumber2.getText().toString());

                int result = operacion.sumar(number1, number2);

                tvResult.setText(result+"");

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
