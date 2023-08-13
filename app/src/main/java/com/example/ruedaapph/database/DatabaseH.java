package com.example.ruedaapph.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.ruedaapph.entity.Jugador;
import com.example.ruedaapph.interf.JugadorDao;


@Database(
        entities = {Jugador.class},
        version = 1,
        exportSchema = false)
public abstract class DatabaseH extends RoomDatabase {

    public abstract JugadorDao jugadorDao();

   /* public static DatabaseH getInstance(Context context) {
        return Room.databaseBuilder(context.getApplicationContext(), DatabaseH.class, "app_database")
                .fallbackToDestructiveMigration()
                .build();
    }*/
}
