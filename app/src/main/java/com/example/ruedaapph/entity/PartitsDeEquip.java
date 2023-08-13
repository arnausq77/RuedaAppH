package com.example.ruedaapph.entity;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class PartitsDeEquip {

    @Embedded
    public Equip equip;
    @Relation(
            parentColumn = "equipId",
            entityColumn = "equipIdDelPartit"
    )
    public List<Partit> playlists;
}
