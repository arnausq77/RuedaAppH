package com.example.ruedaapph;

import android.os.Bundle;

import com.example.ruedaapph.database.DatabaseH;
import com.example.ruedaapph.entity.Jugador;
import com.example.ruedaapph.interf.JugadorDao;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.room.Database;
import androidx.room.Room;

import com.example.ruedaapph.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    public DatabaseH db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        System.out.println("__________________COMENÇA LA APP");

        db = Room.databaseBuilder(getApplicationContext(),
                DatabaseH.class, "db").build();
        new NouThread().start();

    }

    public class NouThread extends Thread{

        public void run(){
            super.run();
            JugadorDao jugadorDao = db.jugadorDao();
            Jugador jugador = new Jugador("NazariXD");
            System.out.println("__________________Jugador: "+jugador.nom);

            /*
            try {
                jugadorDao.insert(jugador);
            }catch (Exception e){
                System.out.println(e);
            }

             */

            List<Jugador> jugadors = jugadorDao.getAllJugadors();

            for (Jugador j : jugadors)
                System.out.println("El nom del jugador es: " + j.nom);

            db.close();
        }
    }




}//fi