package com.example.pedidos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    private Button btn_exibir;
    private CheckBox ck_pastel;
    private CheckBox ck_misto;
    private CheckBox ck_refri;
    private CheckBox ck_fritas;
    private CheckBox ck_coxinha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_exibir = findViewById(R.id.btn_exibir);
        ck_pastel = findViewById(R.id.ck_pastel);
        ck_misto = findViewById(R.id.ck_misto);
        ck_coxinha = findViewById(R.id.ck_coxinha);
        ck_fritas = findViewById(R.id.ck_fritas);
        ck_refri = findViewById(R.id.ck_refri);

        btn_exibir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                double total = 0;

                if (ck_pastel.isChecked()){
                    total += 5;
                }
                if (ck_refri.isChecked()){
                    total += 3.5;
                }
                if (ck_fritas.isChecked()){
                    total += 8;
                }
                if (ck_misto.isChecked()){
                    total += 6;
                }
                if (ck_coxinha.isChecked()){
                    total += 4;
                }

                AlertDialog.Builder janela = new AlertDialog.Builder(MainActivity.this);
                janela.setTitle(R.string.app_name);
                janela.setMessage("Valor total = " + String.format("%.2f", total));
                janela.setNeutralButton("Ok", null);
                janela.show();

            }
        });

    }
}