/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paloma;

import java.util.Scanner;

/**
 *
 * @author Verona <github.com/veronalaux>
 */
public class Paloma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime cuantos mensajes vas a enviar");
        int mensajes = leer.nextInt();
        Fax objFax = new Fax(mensajes);
        Carta objCarta = new Carta();
        int opcion = 0;

        do {
            System.out.println("\n============PALOMA MENSAJERA===========\n"
                    + "0.- Salir\n"
                    + "1.- Cantar\n"
                    + "2.- Enviar mensaje\n"
                    + "3.- Trayecto\n"
                    + "4.- Recibe mensaje\n"
                    + "5.- Lee mensaje\n"
                    + "¿Qué opción escojiste?");
            opcion = leer.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("curruuuuuu(bye idioma paloma)");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("¿A que ciudad vas enviar el mensaje?\n"
                            + "1.- Guadalajara\n"
                            + "2.- Morelia\n"
                            + "3.- Tangamandapio");
                    leer.nextLine();
                    System.out.println("");
                    int numero = leer.nextInt();
                    if (numero + 1 > mensajes) {
                        System.out.println("Tranquilo viejo!! No son tantos mensajes");
                        break;
                    }
                    objFax.marcaTelefono(numero);
                    break;
                case 2:
                    System.out.println("Dime el mensaje que vas a enviar");
                    leer.nextLine();
                    System.out.println("");
                    String mensaje = leer.nextLine();
                    objFax.enviarMensaje(mensaje);
                    break;
                case 3:
                    objFax.ConexionInternet();
                    break;
                case 4:
                    System.out.println("Mensaje recibido");
                    break;
                case 5:
                    objFax.leerMensaje();
                    break;
                default:
                    System.out.println("Eso no lo entiende la paloma");
                    break;
            }
        } while (opcion != 0);

    }

}
