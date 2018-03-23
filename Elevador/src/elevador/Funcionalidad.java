/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevador;

import java.util.Scanner;

/**
 *
 * @author Lotso <merengues.org>
 */
public class Funcionalidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Edificio objEdificio = new Edificio();
        Elevador objElevador = new Elevador();
//        System.out.println("Personas por departamento: "+objEdificio.cantidadPersonas());
        int opcion = 0;
        int cantidadPersonas = objElevador.getPersonas();
        do {
            System.out.println("=====ELEVATOR=====\n"
                    + "0.- Salir(Por las escaleras)\n"
                    + "1.- Subir persona(s)\n"
                    + "2.- Bajar persona(s)\n"
                    + "3.- Ver cuantos van\n"
                    + "Dime cual elegiste:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    objElevador.setResp("subir");
                    System.out.println("¿Cuántas personas van a subir?");
                    int subir = leer.nextInt();
                    cantidadPersonas = cantidadPersonas + subir;
                    break;
                case 2:
                    objElevador.setResp("bajar");
                    System.out.println("¿Cuántas personas van a bajar?");
                    int bajar = leer.nextInt();
                    cantidadPersonas = cantidadPersonas - bajar;
                    break;
                case 3:
                    System.out.println("Van echos salchicha " + cantidadPersonas + " personas");
                    break;
                default:
                    System.out.println("No juegues con el elevador");
                    break;
            }
        } while (opcion != 0);
    }
    
}
