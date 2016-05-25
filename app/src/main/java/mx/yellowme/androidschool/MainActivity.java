package mx.yellowme.androidschool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewUsuario;
    private EditText editTextUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewUsuario = (TextView) findViewById(R.id.textViewUsuario);
        editTextUsuario = (EditText) findViewById(R.id.editTextUsuario);
    }

    public void setValue(View view){
        String cadena = editTextUsuario.getText().toString();
        editTextUsuario.setText(cadena);
    }
}
