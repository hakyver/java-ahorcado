import java.util.Scanner;

public class juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        String secreto = "black";
        boolean palabraadivinada = false;
        
        char[] letrasadivinadas = new char[secreto.length()];
        for (int i = 0; i < letrasadivinadas.length; i++) {
            letrasadivinadas[i] = '_';  
        }

        while (!palabraadivinada && intentos < 10) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasadivinadas));
            System.out.println("Introduce una letra:");
            char letra = scanner.next().charAt(0);
            boolean correcto = false;

            // Corregido el bloque for
            for (int i = 0; i < secreto.length(); i++) {
                if (secreto.charAt(i) == letra) {
                    letrasadivinadas[i] = letra;
                    correcto = true;
                }
            }

            if (!correcto) {
                intentos++;
                System.out.println("Incorrecto, inténtalo de nuevo. Intentos restantes: " + (10 - intentos));
            }

            if (String.valueOf(letrasadivinadas).equals(secreto)) {
                palabraadivinada = true;
                System.out.println("¡Has ganado! La palabra era: " + secreto);
            }
        }

        // Mensaje si el usuario no adivina la palabra
        if (!palabraadivinada) {
            System.out.println("Qué pena, no has podido adivinar la palabra. La palabra era: " + secreto);
        }

        scanner.close();
    }
}


