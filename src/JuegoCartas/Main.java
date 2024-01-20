package JuegoCartas;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PrinterSingleton printer = PrinterSingleton.getInstance();

        Baraja baraja = new Baraja();

        baraja.mezclar();

        for (Carta carta : baraja.getCartas()){
            printer.printDebug(carta.toString());
        }


        Jugador jugador = new Jugador(baraja.repartirCartas(Jugador.MAX_PLAYER_INITIAL_CARDS));
        printer.print(jugador.toString());

        Jugador crupier = new Jugador(baraja.repartirCartas(Jugador.MAX_CRUPIER_INITIAL_CARDS));
        printer.print(crupier.toString());


        Scanner scanner = new Scanner(System.in);
        printer.print("\n 1. Pedir \n 2. Plantarse");
        int opcion = scanner.nextInt();
        if (opcion == 1){
            int cantidadCartasAdicionales = scanner.nextInt();

            List<Carta> cartasAdicionales = baraja.repartirCartas(cantidadCartasAdicionales);
            jugador.addCardsToHand(cartasAdicionales);
            int suma = jugador.sumarValoresCartas();
            printer.print(jugador.toString());
            if(jugador.sumarValoresCartas()>21)
                printer.print("HAS PERDIDO");
        }

        scanner.close();

    }
}