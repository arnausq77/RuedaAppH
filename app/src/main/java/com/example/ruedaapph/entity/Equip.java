package com.example.ruedaapph.entity;

import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

public class Equip {

    @PrimaryKey
    public int equipId;

    @ColumnInfo(name = "nom")
    public String nom;

    @ColumnInfo(name = "gols")
    public int gols;

    @ColumnInfo(name = "xutsDins")
    public int xutsDins;

    @ColumnInfo(name = "xutsFora")
    public int xutsFora;

    @ColumnInfo(name = "faltes")
    public int faltes;

    @ColumnInfo(name = "faltesCapell")
    public int faltesCapell;


    //Getters i Setters
    public int getEquipId() {
        return equipId;
    }

    public void setEquipId(int equipId) {
        this.equipId = equipId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getXutsDins() {
        return xutsDins;
    }

    public void setXutsDins(int xutsDins) {
        this.xutsDins = xutsDins;
    }

    public int getXutsFora() {
        return xutsFora;
    }

    public void setXutsFora(int xutsFora) {
        this.xutsFora = xutsFora;
    }

    public int getFaltes() {
        return faltes;
    }

    public void setFaltes(int faltes) {
        this.faltes = faltes;
    }

    public int getFaltesCapell() {
        return faltesCapell;
    }

    public void setFaltesCapell(int faltesCapell) {
        this.faltesCapell = faltesCapell;
    }

}
