package JuegoCartas;

import java.util.List;

public class Jugador {
    public static final int MAX_PLAYER_INITIAL_CARDS = 2;
    public static final int MAX_CRUPIER_INITIAL_CARDS = 1;

    private List<Carta> handCards;
    private String nombre;

    public Jugador(List<Carta> handCards, String nombre) {
        this.handCards = handCards;
        this.nombre = nombre;
    }

    public int sizeCartas(){
        return this.handCards.size();
    }

    public List<Carta> getHandCards() {
        return handCards;
    }

    public int cantidadCartas() {
        return handCards.size();
    }

    @Override
    public String toString() {
        String text = "Cartas de " + this.nombre +": ";
        for (Carta carta : this.handCards){
            text = text.concat(", "+carta.toString());
        }
        return text;

    }

    public void addCardsToHand(List<Carta> cartasAdicionales) {
        this.handCards.addAll(cartasAdicionales);
    }

    public int valorMano() {
        return handCards.stream()
                .mapToInt(carta -> carta.getValor().getValor())  // Obtén el valor del enum y conviértelo a int
                .sum();
    }

    public String getNombre() {
        return nombre;
    }
}
