package com.co.catastro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Clae {

    public static void main(String[] args) {

        Integer numeros = 10;
        Long numerosGrandes = 5000000l;
        String texto = "Holis";
        Character caracter = 'x';
        Boolean verdaderoFalso = true; // false
        Float decimales = 10.20f;
        Double decimalesGrandes = 10.30;

        System.out.println("Integer: " + numeros);
        System.out.println("Long: " + numerosGrandes);
        System.out.println("String: " + texto);
        System.out.println("Character: " + caracter);
        System.out.println("Boolean: " + verdaderoFalso);
        System.out.println("Float: " + decimales);
        System.out.println("Double: " + decimalesGrandes);

        Integer operando1 = 38;
        Integer operando2 = 54;
        Integer suma = operando1 + operando2;

        System.out.println("");
        System.out.println("La suma de " + operando1 + " + " +  operando2 + " Es igual a: " + suma);

        List<Integer> lstEnteros = new ArrayList<>();
        lstEnteros.add(5); // 0
        lstEnteros.add(9); // 1
        lstEnteros.add(97); // 2
        lstEnteros.add(1024); // 3

        for (int i = 0; i < lstEnteros.size(); i++) {
            if (lstEnteros.get(i) > 10) {
                System.out.println(lstEnteros.get(i));
            }
        }

        System.out.println("Foreach: ");
        for (Integer num : lstEnteros) {
            if (num > 10) {
                System.out.println(num);
            }
        }

    }

}
