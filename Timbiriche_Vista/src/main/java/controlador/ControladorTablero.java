/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.Jugador;
import modelo.Punto;
import modelo.TableroData;
import vista.Tablero;
import vista.TableroPanel;

/**
 *
 * @author HP
 */
public class ControladorTablero {

    Tablero tablero;
    TableroPanel tableroPanel;
    TableroData tableroData;

    public ControladorTablero(int numeroPuntos, List<Jugador> jugadores) {
        this.tablero = new Tablero();
        this.tableroPanel = new TableroPanel();
        tableroPanel.setSize(900, 700);
        this.tableroData = new TableroData(numeroPuntos,
                tableroPanel.getWidth(), tableroPanel.getHeight());
        tableroData.setJugadores(jugadores);
    }

    public void iniciar() {
        List<Punto> puntos = tableroData.getPuntos();
        tableroPanel.generarPuntos(puntos);
        tablero.cargarTablero(tableroPanel);
        ingresarJugadores();
        tablero.setVisible(true);
    }

    private void ingresarJugadores() {
        tablero.nombreJ1.setText(tableroData.getJugadores().get(0).getNombre());
        tablero.nombreJ2.setText(tableroData.getJugadores().get(1).getNombre());
        tablero.nombreJ3.setText(tableroData.getJugadores().get(2).getNombre());
        tablero.nombreJ4.setText(tableroData.getJugadores().get(3).getNombre());
    }

}
