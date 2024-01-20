package JuegoCartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Baraja {

    private List<Carta> cartas;

    public Baraja() {
        cartas = new LinkedList<>();
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

    public int cantidadCartas() {
        return cartas.size();
    }

    public List<Carta> repartirCartas(int maxInitialCards) {
        int cantidadCartas = this.cantidadCartas();

        //lista con cartas extraidas de baraja
        List<Carta> ultimosElementos =  new ArrayList<>(this.cartas.subList(cantidadCartas - maxInitialCards, cantidadCartas));
        Collections.reverse(ultimosElementos);

        // eliminar cartas extraidas de baraja original
        this.cartas.subList(cantidadCartas - maxInitialCards, cantidadCartas).clear();

        return ultimosElementos;

    }

    public Carta get(int i) {
       return this.cartas.get(i);
    }
}
