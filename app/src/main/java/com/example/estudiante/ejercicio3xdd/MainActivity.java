package com.example.estudiante.ejercicio3xdd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_respuesta;
    EditText et_masa;
    EditText et_altura;
    Button btn_boton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_masa=findViewById(R.id.et_masa);
        et_altura=findViewById(R.id.et_altura);
        tv_respuesta=findViewById(R.id.tv_respuesta);
        btn_boton=findViewById(R.id.btn_boton);

        btn_boton.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             String masa=et_masa.getText().toString();
                                             String Altura= et_altura.getText().toString();
                                             float masaF= Float.valueOf(masa);
                                             float AlturaF =Float.valueOf(Altura);
                                             float Altur= AlturaF/100;
                                             float res = (masaF/(Altur*Altur));
                                             tv_respuesta.setText(""+res);
                                         }
                                     }
        );

    }
}
