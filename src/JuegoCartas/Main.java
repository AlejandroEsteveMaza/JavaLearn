package JuegoCartas;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static PrinterSingleton printer = PrinterSingleton.getInstance();
    public static void main(String[] args) {

        Baraja baraja = new Baraja();

        baraja.mezclar();

        for (Carta carta : baraja.getCartas()){
            printer.printDebug(carta.toString());
        }


        Jugador jugador = new Jugador(baraja.repartirCartas(Jugador.MAX_PLAYER_INITIAL_CARDS), "Jugador 1");
        printer.print(jugador.toString());
        printer.print(String.valueOf(jugador.valorMano()));

        Jugador crupier = new Jugador(baraja.repartirCartas(Jugador.MAX_CRUPIER_INITIAL_CARDS), "Crupier");
        printer.print(crupier.toString());
        printer.print(String.valueOf(crupier.valorMano()));


        Scanner scanner = new Scanner(System.in);
        printer.print("\n 1. Pedir \n 2. Plantarse \n Elige una opcion: ");
        int opcion = scanner.nextInt();
        if (opcion == 1){
            printer.print("Cartas adicionales: ");
            int cantidadCartasAdicionales = scanner.nextInt();

            List<Carta> cartasAdicionales = baraja.repartirCartas(cantidadCartasAdicionales);
            jugador.addCardsToHand(cartasAdicionales);
            comprobarDerrota(jugador);
            printer.print(String.valueOf(jugador.valorMano()));
        }
        scanner.close();

        while (crupier.valorMano() < 17){
            crupier.addCardsToHand(baraja.repartirCartas(1));
            //printer.print(crupier.toString());
        }
        comprobarDerrota(crupier);

        int valorJugador = jugador.valorMano();
        int valorCrupier = crupier.valorMano();

        boolean jugadorGana = valorJugador <= 21 && (valorJugador > valorCrupier || valorCrupier > 21);
        boolean crupierGana = valorCrupier <= 21 && valorCrupier > valorJugador;


        printer.printDebug(valorJugador + " - " + valorCrupier);
        if (jugadorGana) {
            System.out.println("¡Jugador gana!");
        } else if (crupierGana) {
            System.out.println("¡Crupier gana!");
        } else {
            System.out.println("Empate. Las sumas son iguales.");
        }
    }

    private static void comprobarDerrota(Jugador jugador){
        int suma = jugador.valorMano();
        printer.printDebug(jugador.toString());
        if(suma>21)
            printer.print("HAS PERDIDO");
    }
}