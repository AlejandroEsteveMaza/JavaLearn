package Lambda;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        filtradoNumerosPares();
    }

    private static void filtradoNumerosPares(){
        // Utiliza una expresión lambda para filtrar solo los números pares
        // Imprime el resultado
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //v1
        List<Integer> listaNumerosPares = listaNumeros
                .stream()
                .filter(n -> n % 2 == 0)
                .toList();

        listaNumerosPares.forEach(System.out::println);

        //v2
        listaNumeros
                .stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    public static void operacionSobreCadaElementoDeUnaLista() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Utiliza una expresión lambda para duplicar cada número
        // Imprime el resultado
    }

    public static void verificaciónCadenaVacía() {
        List<String> cadenas = Arrays.asList("Hola", "", "Java", "Lambda");

        // Utiliza una expresión lambda para verificar si alguna cadena está vacía
        // Imprime el resultado
    }
}
