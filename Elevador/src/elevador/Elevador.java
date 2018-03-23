/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevador;

import java.util.Scanner;

/**
 *
 * @author los Armandos
 */
public class Elevador {

    private static int cantPersonas;
    private static String direccion;
    private static String status;
    private static String solicitud;
    private String resp;
    Scanner leer;

    public Elevador() {
        leer = new Scanner(System.in);
        System.out.println("Dime que quieres hacer:\n"
                + "bajar\n"
                + "subir");
        String respuesta = leer.nextLine();
        setResp(respuesta);
//        String dire = direccionElevador(respuesta);
        if (getResp().equals("subir")) {
//            System.out.println("Vas a " + dire);
            System.out.println("Dime la cantidad de personas a subir");
            int numSubir = leer.nextInt();
            String estadoElevador = validarSubir(numSubir);
            if (estadoElevador.equals("libre")) {
                System.out.println("Puede subir, somos " + getPersonas() + " personas");
            } else {
                System.out.println("Está lleno, no cabe, somos " + getPersonas() + " personas");
            }
        } else {
//            System.out.println("Vas a " + dire);
            System.out.println("Dime la cantidad de personas a bajar");
            int numBajar = leer.nextInt();
            String estadoElevador = validarBajar(numBajar);
            if (estadoElevador.equals("libre")) {
                System.out.println("Puede bajar, hay " + getPersonas() + " personas");
            } else {
                System.out.println("NO puede bajar, porque hay " + getPersonas() + " personas");
            }
        }
    }

    public String getResp() {
        return resp;
    }

    public void setResp(String respue) {
        if (respue.equals("subir")) {
            resp = "subir";
        } else {
            resp = "bajar";
        }
    }

    public String validarSubir(int cantidadPersonas) {
        if (subir(cantidadPersonas) >= 5) {
            status = "ocupado";
        } else {
            if (cantidadPersonas > subir(cantidadPersonas)) {
                status = "ocupado";
            } else {
                status = "libre";
            }
        }
        return status;
    }

    public String validarBajar(int cantidadPersonas) {
        if (bajar(cantidadPersonas) <= 0) {
            status = "ocupado";
        } else {
            status = "libre";
        }

        return status;
    }

    public int bajar(int cantidadPersonas) {
        cantPersonas = cantidadPersonas;
        return cantPersonas;
    }

    public int getPersonas() {
        return cantPersonas;
    }

    public int subir(int cantidadPersonas) {
        cantPersonas = cantidadPersonas;
        return cantPersonas;
    }

    public String direccionElevador(String direcElevador) {
        solicitudBajarSubir(direcElevador);
        if (direcElevador.equals(getSolicitud())) {
            direccion = "arriba";
        }
        if (direccion.equals(getSolicitud())) {
            direccion = "abajo";
        }
        return direccion;
    }

    public void solicitudBajarSubir(String soli) {
        if (soli.equals("bajar")) {
            solicitud = "bajar";
        }
        if (soli.equals("subir")) {
            solicitud = "subir";
        }
//        return solicitud;
    }

    public String getSolicitud() {
        return solicitud;
    }

}
