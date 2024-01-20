package JuegoCartas;

import java.util.List;
import java.util.stream.Collectors;

public class Jugador {
    public static final int MAX_PLAYER_INITIAL_CARDS = 2;
    public static final int MAX_CRUPIER_INITIAL_CARDS = 1;

    private List<Carta> handCards;

    public Jugador(List<Carta> handCards) {
        this.handCards = handCards;
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
        String text = "";
        for (Carta carta : this.handCards){
            text = text.concat(" "+carta.toString());
        }
        return text;

    }

    public void addCardsToHand(List<Carta> cartasAdicionales) {
        this.handCards.addAll(cartasAdicionales);
    }

    public int sumarValoresCartas() {
        return handCards.stream()
                .mapToInt(carta -> carta.getValor().getValor())  // Obtén el valor del enum y conviértelo a int
                .sum();
    }
}
