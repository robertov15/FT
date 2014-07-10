package com.example.roberto.puntodeventafte;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class Venta extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_venta);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.venta, menu);
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
            TextView t=(TextView)findViewById(R.id.txtPagos);
            t.setText("" + view.getId());
        }catch(Exception e)
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Ejemplo de Mensaje Popup para Android OS desde Devtroce.com")
                    .setTitle("Atención!!")
                    .setCancelable(false)
                    .setNeutralButton("Aceptar",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
            AlertDialog alert = builder.create();
            alert.show();
        }

        switch(view.getId())
        {
            //case R.id.btnNuevaVenta:  break;
            case R.id.btnCliente: act = new Intent(this,AgregarCliente.class);break;
            //case R.id.btnProductos: ;break;
        }

        startActivity(act);
    }
}
