import java.util.Arrays;

public class PrimitivoVsObjeto {

    public static void main(String[] args) {
        //Devolver SI, si contiene a
        //Porque el primer ejemplo imprime NO? No tiene sentido verdad?

        char[] letras = {'a', 'b', 'c'};

        if (Arrays.asList(letras).contains('a')) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        System.out.println("___________________________________");

        for (char letra : letras){
            if (letra == 'a'){
                System.out.println("SI");
            }
        }

        System.out.println("___________________________________");

        for (char letra : letras){
            Character caracter = Character.valueOf(letra);
            if (caracter.equals('a')){
                System.out.println("SI");
            }
        }

        System.out.println("___________________________________");

        Character[] letras2 = {'a', 'b', 'c'};

        if (Arrays.asList(letras2).contains('a')) {
            System.out.println("SI");
        }
    }

}
