/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paloma;

/**
 *
 * @author Verona <github.com/veronalaux>
 */
// Clases (abstractas o no) se heredan, las interfaces se implementan
public class Fax extends Carta implements Comunicador, Internet {

    private String[] marcadoRapido;
    private String[] memoriaCelular;
    private String mensaje;

    public Fax(int listaNumeros) {
        marcadoRapido = new String[listaNumeros];
        memoriaCelular = new String[100];
    }

    public void marcaTelefono(int numLista) {
        super.Cantar(marcadoRapido[numLista]);
    }

    public void enviarMensaje(String mensa) {
        mensaje = mensa;
        System.out.println(mensaje);
    }

    public String getMensaje() {
        return mensaje;
    }

    public void ConexionInternet() {
        System.out.println("Mensaje en camino...");
    }

    private String recibeMensjae() {
        // Mecanismos de recepción de mensajes
        return memoriaCelular[0] = getMensaje();
    }

    public void leerMensaje() {
        System.out.print("Mensaje recibido " + recibeMensjae());
    }

    public void pruebaSintaxis() {
    }
}
