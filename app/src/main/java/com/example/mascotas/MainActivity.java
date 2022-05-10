package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private  RecyclerView Adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
recyclerView.setLayoutManager(new LinearLayoutManager(this));
Adaptador = new RecyclerViewAdaptador(obtenerMascotas());
recyclerView.setAdapter(Adaptador.getAdapter());
public List<MascotaModelo> obtenerMascotas(){
    List<MascotaModelo> mascota = new ArrayList<>();
    mascota.add(new MascotaModelo("beagle",R.drawable.beagle));
    mascota.add(new MascotaModelo("bone",R.drawable.bone));
    mascota.add(new MascotaModelo("boxer",R.drawable.boxer));
    mascota.add(new MascotaModelo("braco",R.drawable.braco));
    mascota.add(new MascotaModelo("bulldog",R.drawable.bulldog));
    mascota.add(new MascotaModelo("cat",R.drawable.cat));

return mascota;

        }

    }
}