package com.example.ruedaapph.entity;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class EquipAmbJugadors {

    @Embedded
    public Equip equip;

    @Relation(parentColumn = "id", entityColumn = "id", associateBy = @Junction(EquipJugadorsCrossRef.class))
    public List<Jugador> jugadores;
}
