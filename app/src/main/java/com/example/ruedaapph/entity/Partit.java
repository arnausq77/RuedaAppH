package com.example.ruedaapph.entity;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

import java.util.Date;

public class Partit {
    @PrimaryKey
    public int partitId;

    @ColumnInfo(name = "data")
    public Date data;

    @ColumnInfo(name = "equipIdDelPartit")
    public int equipIdDelPartit;
}
