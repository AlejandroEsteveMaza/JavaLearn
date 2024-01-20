package Lambda;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        numerosNegativos();
    }

    private static void filtradoNumerosPares() {
        // Utiliza una expresión lambda para filtrar solo los números pares
        // Imprime el resultado
        List<Integer> listaNumeros = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
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

    public static void verificacionCadenaVacia() {
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

    public static void concatenarCadenas(){
        List<String> cadenas = Arrays.asList("Hola", " ", "Mundo", "!");

        String cadenaConcatenada = cadenas.stream()
                .reduce("", (a, b) -> a + b);

        System.out.println(cadenaConcatenada);

    }

    public static void ordenarNumerosEliminarRepetidos(){
        List<Integer> numsDesordenados = Arrays.asList(9, 2, 7, 0, 5, 8, 7, 1, 3, 2, 6, 4);

        List<Integer> listaSinDuplicadosOrdenada =  numsDesordenados.stream().distinct().sorted().toList();

        System.out.println("Ascendente: " + listaSinDuplicadosOrdenada);
    }

    public static void numerosNegativos(){
        List<Integer> numeros= Arrays.asList(1,-2,3);

        boolean hayNumeroNegativo =  numeros.stream().anyMatch(n -> n < 0);

        System.out.println(hayNumeroNegativo);
    }
}
