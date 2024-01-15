package JuegoCartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {

    private List<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        for (Palo palo: Palo.values()){
            for (Valor valor: Valor.values()){
                this.cartas.add(new Carta(valor, palo));
            }
        }
    }

    public void mezclar() {
        Collections.shuffle(cartas);
    }

    public List<Carta> getCartas() {
        return cartas;
    }
}
