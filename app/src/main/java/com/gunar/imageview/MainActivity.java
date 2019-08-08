package com.gunar.imageview;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int imagenes[] = {R.drawable.aries, R.drawable.tauro, R.drawable.geminis, R.drawable.cancer, R.drawable.leo, R.drawable.virgo, R.drawable.libra, R.drawable.escorpion, R.drawable.sagitario, R.drawable.capricornio, R.drawable.acuario, R.drawable.piscis};
    String nombres[] = {"aries", "tauro", "geminis", "cancer", "leo", "virgo", "libra", "escorpion", "sagitario", "capricornio", "acuario", "piscis"};
    int indice = 0;
    private ImageView imagen;
    private TextView nombre;
    private int aux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aux = 0;
        imagen = (ImageView) findViewById(R.id.imageView);
        nombre = (TextView) findViewById(R.id.texto);
    }

    public void siguiente(View view) {
        indice++;
        if(indice>11) indice=0;
        nombre.setText(nombres[indice]);
        imagen.setImageResource(imagenes[indice]);
    }

    public void anterior(View view) {
        indice--;
        if(indice>0) indice=11;
        nombre.setText(nombres[indice]);
        imagen.setImageResource(imagenes[indice]);
    }

    public void ocultar(View view) {

    }
}
