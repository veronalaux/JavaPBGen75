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
public interface Comunicador {

    public void enviarMensaje(String mensaje);

    public void leerMensaje();

    public void pruebaSintaxis();
}
