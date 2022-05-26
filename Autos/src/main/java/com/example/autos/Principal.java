package com.example.autos;

import java.lang.reflect.Array;

public class Principal {
    public static void main(String[] args) {
        Auto miAuto = new Auto("Vocho", "Volkswagen",2019);

        Auto miAuto2 = new Auto();
        //System.out.println(miAuto);
        //System.out.println(miAuto2.toString());
        //System.out.println(miAuto2.Comparacion());
        //System.out.println(miAuto.toString());

        Auto[] arrayAuto = new Auto[5];

        arrayAuto[0] = new Auto("V9", "Ferrari", 2020);
        arrayAuto[1] = new Auto("V10", "Ferrari", 2021);
        arrayAuto[2] = new Auto("V11", "Ferrari", 2022);
        arrayAuto[3] = new Auto("V12", "Ferrari", 2022);
        arrayAuto[4] = new Auto("V13", "Ferrari", 2024);

        int cant = 0;

        for(Auto a: arrayAuto){
            System.out.println(a.toString());
            if(a.getAnio()==2022){
                cant++;
            }
        }
        System.out.println("La cantidad de autos del anio son: " + cant);
    }
}
