package JuegoCartas;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Baraja baraja = new Baraja();

        baraja.mezclar();

        for (Carta carta : baraja.getCartas()){
            System.out.println(carta.toString());
        }


    }
}