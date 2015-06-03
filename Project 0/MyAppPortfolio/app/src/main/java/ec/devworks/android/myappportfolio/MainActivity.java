package ec.devworks.android.myappportfolio;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ec.devworks.android.myappportfolio.ec.devworks.android.myappportfolio.util.CrazyColor;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton = (Button) findViewById(R.id.button);
        Button boton2 = (Button) findViewById(R.id.button2);
        Button boton3 = (Button) findViewById(R.id.button3);
        Button boton4 = (Button) findViewById(R.id.button4);
        Button boton5 = (Button) findViewById(R.id.button5);
        Button boton6 = (Button) findViewById(R.id.button6);

        List<Button> lista = new ArrayList<>();
        lista.add(boton);
        lista.add(boton2);
        lista.add(boton3);
        lista.add(boton4);
        lista.add(boton5);
        lista.add(boton6);

        for(Button b: lista){
                b.setBackgroundColor(Color.parseColor(CrazyColor.color()));
            final Button bf = b;
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "This button launches my " + bf.getText().toString() + " app!", Toast.LENGTH_SHORT).show();
                }
            });
        }
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
