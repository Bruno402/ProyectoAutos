package com.example.autos;

import java.lang.reflect.Array;
import java.time.LocalDate;

public class Auto {
    private String modelo;
    private String marca;
    private int anio;

    public int getAnio(){
        return anio;
    }

    public Auto(String mod, String marc, int an){
        this.modelo = mod;
        this.marca = marc;
        this.anio = an;
    }

    public Auto(){
        this.modelo = "V8";
        this.marca = "Ferrari";
        this.anio = 2020;
    }

    public String toString(){
        String descripcion = "El modelo es: " + modelo + ", la marca es: " + marca + " y el anio es: "+anio;
        return descripcion;
    }

    public Boolean Comparacion(){
        LocalDate date = LocalDate.now();
        Integer anio = date.getYear();
        if(this.anio < anio){
            return Boolean.TRUE;
        }
        else{
            return Boolean.FALSE;
        }
    }

    public void Todo(Array arrayRecibe){
        for(int i = 0; i < arrayRecibe.getLength(arrayRecibe); i++){
            System.out.println(i);
        }
    }

}