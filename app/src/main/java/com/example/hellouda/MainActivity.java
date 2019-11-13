package com.example.hellouda;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.provider.Settings;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnProducts;
    private Button btnAboutUs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //enlazas activity  con el layout
        btnProducts = (Button) findViewById(R.id.btnEnter);
        btnAboutUs = (Button) findViewById(R.id.btnAboutUs);
        btnProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,
                        ProductListActivity.class);
                startActivity(i);
            }
        });
        btnAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,
                        AboutActivity.class);
                startActivity(i);
            }
        });
    }
    @Override
    protected void onResume(){
        super.onResume(); //este codigo se ejecuta antes del todo
        //en este punto la aplicacion ya cargo
        //this en un activity;
        Toast.makeText(this,
                "Aplicacion Stopeada",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this,
                "Aplicacion Stopeada",
                Toast.LENGTH_LONG).show();
    }



 //   @Override
   // public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
   // (())   getMenuInflater().inflate(R.menu.menu_main, menu);
   ///()     return true;
   // }

   // @Override
   // public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
     //   int id = item.getItemId();

        //noinspection SimplifiableIfStatement
     //   if (id == R.id.action_settings) {
      //      return true;
       // }

      //  return super.onOptionsItemSelected(item);
    //}
}
