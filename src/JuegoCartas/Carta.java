package JuegoCartas;

public class Carta {

    private Valor valor;
    private Palo palo;

    public Carta(Valor valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return valor + " " + palo;
    }

    public Valor getValor() {
        return valor;
    }

    public Palo getPalo() {
        return palo;
    }
}
