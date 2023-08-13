package com.example.ruedaapph.interf;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import androidx.room.Upsert;

import com.example.ruedaapph.entity.Jugador;
import java.util.List;

@Dao
public interface JugadorDao {

    @Upsert
    void insert(Jugador jugador);

    @Update
    void update(Jugador jugador);

    @Delete
    void delete(Jugador jugador);

    @Query("SELECT * FROM jugadors")
    List<Jugador> getAllJugadors();
}
