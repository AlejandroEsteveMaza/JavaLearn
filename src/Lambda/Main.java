package Lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        longitudMayor3();
    }

    private static void filtradoNumerosPares() {
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

        // Utiliza una expresión lambda para duplicar (x2) cada número
        // Imprime el resultado

        numeros.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);

    }

    public static void verificaciónCadenaVacía() {
        List<String> cadenas = Arrays.asList("Hola", "", "Java", "Lambda");

        // Utiliza una expresión lambda para verificar si alguna cadena está vacía
        // Imprime el resultado

        boolean cadenaVacia = cadenas.stream()
                .anyMatch(String::isEmpty);

        System.out.println(cadenaVacia);

    }

    public static void longitudMayor3() {
        List<String> cadenas = Arrays.asList("Hola", "", "Jav", "a", " ", "    ", "JOSITO");

        // Dada una lista de strings, utiliza funciones lambda para contar cuántos de ellos tienen una longitud mayor a 3 caracteres.

        cadenas.stream()
                .filter(c -> c.length() > 3)
                .forEach(System.out::println);

        var cantidad = cadenas.stream()
                .filter(c -> c.length() > 3)
                .count();

        System.out.println("Cantidad de cadenas con longitud mayor a 3: " + cantidad);

    }


    /*
    Ejercicio 5: Concatenar cadenas

    Descripción:
    Crea una lista de cadenas y utiliza funciones lambda para concatenarlas todas en una única cadena.

    Condiciones de Superación:
    Mostrar por consola la cadena resultante.
    */
}
