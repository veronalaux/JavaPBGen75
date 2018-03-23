/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevador;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author los armandos
 */
public class Edificio {

    private static int cantidadPisos;
    private static int cantidadDepas;
    private static int cantidadPeople;
    Random ran;
    Scanner leer;

    public Edificio() {
        leer = new Scanner(System.in);
        System.out.println("Dime el piso actual");
        int pisoActual = leer.nextInt();
        PisoActual(pisoActual);
    }

    public int cantidadPersonas() {
        ran = new Random();
        cantidadPeople = ran.nextInt(4) + 1;
        return cantidadPeople;
    }

    public int getPisoActual() {
        return cantidadPisos;
    }

    public void PisoActual(int piso) {
        if (piso > 6) {
            System.out.println("El edificio no tiene esos pisos, escoje otro");
            PisoActual(piso);
        } else {
            cantidadPisos = piso;
        }
    }

    public int cantDepas() {
        cantidadDepas = 4;
        return cantidadDepas;
    }

}
