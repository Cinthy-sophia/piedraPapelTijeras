package com.cinthyasophia.piedrapapeltijera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvTitulo;
    private TextView tvAnuncio;
    private Button bReiniciar;
    private Button bPiedra;
    private Button bPapel;
    private Button bTijera;
    private ImageView ivImagen;
    private ImageView ivImagen2;
    private int numJugador;
    private int numAl;

    private Lib lib= new Lib();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTitulo= findViewById(R.id.tvTitulo);
        bPiedra= findViewById(R.id.bPiedra);
        bPapel= findViewById(R.id.bPapel);
        bTijera= findViewById(R.id.bTijera);
        bReiniciar= findViewById(R.id.bReiniciar);
        ivImagen= findViewById(R.id.ivImagen);
        tvAnuncio= findViewById(R.id.tvAnuncio);


        numAl=lib.aleatorio(0,2);

        bPiedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numJugador=0;
                ivImagen.setImageResource(R.drawable.piedra);
                if (numAl==2){
                    tvAnuncio.setText(R.string.youWin);

                }else{
                    tvAnuncio.setText(R.string.youLose);

                }
            }


        });
        bPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numJugador=1;
                ivImagen.setImageResource(R.drawable.papel);
                if (numAl==0){
                    tvAnuncio.setText(R.string.youWin);

                }else{
                    tvAnuncio.setText(R.string.youLose);
                }
            }


        });
        bTijera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numJugador=2;
                ivImagen.setImageResource(R.drawable.tijera);
                if (numAl==1){
                    tvAnuncio.setText(R.string.youWin);

                }else{
                    tvAnuncio.setText(R.string.youLose);
                }
            }
        });

        bReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numAl=lib.aleatorio(0,1);
                ivImagen.setImageResource(R.drawable.piedrapapeltijer);
                tvAnuncio.setText("");

            }
        });
    }

}
