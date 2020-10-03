package com.example.pokemontrainerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pokemons p1 = new Pokemons("Bulbasaur",R.drawable.bulbasaur, 49, 49, 98);
        Pokemons p2 = new Pokemons("Articuno", R.drawable.articuno, 85, 100, 185 );
        Pokemons p3 = new Pokemons("Charizard", R.drawable.charizard,84, 78, 162);
        Pokemons p4 = new Pokemons("Eevee", R.drawable.eevee, 55, 50 , 105);
        Pokemons p5 = new Pokemons("Pikachu", R.drawable.pikachu, 55, 40, 95);
        Pokemons p6 = new Pokemons("Squirtle", R.drawable.squirtle, 48, 65, 113);

        ArrayList<Pokemons> pokemon = new ArrayList<>();
        pokemon.add(p1);
        pokemon.add(p2);
        pokemon.add(p3);
        pokemon.add(p4);
        pokemon.add(p5);
        pokemon.add(p6);

        RecyclerView pokemonz = findViewById(R.id.pokemonzList);


    }
}