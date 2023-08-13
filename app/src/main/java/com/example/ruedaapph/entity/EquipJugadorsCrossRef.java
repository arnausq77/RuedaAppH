package com.example.ruedaapph.entity;

import androidx.room.Entity;

@Entity(primaryKeys = {"equipId", "jugadorId"})
public class EquipJugadorsCrossRef {

    public int equipId;
    public int jugadorId;

}
