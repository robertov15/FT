package com.example.roberto.puntodeventafte;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TextView;


public class AgregarCliente extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_agregar_cliente);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.agregar_cliente, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        Intent act = null;

        try{
            TextView t=(TextView)findViewById(R.id.txtClienteTitulo);
            t.setText("" + view.getId());
        }catch(Exception e){
        }

        switch(view.getId())
        {
            //case R.id.btnClienteAgregar:  break;
            case R.id.btnClienteNuevo: act = new Intent(this,ClienteNuevo.class);break;
            //case R.id.btnProductos: ;break;
        }

        startActivity(act);
    }
}
