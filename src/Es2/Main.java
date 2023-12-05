package Es2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Inserisci il numero di elementi della lista di numeri: ");
            String inputUtente = input.nextLine();

            try {
                int numeroElementi = Integer.parseInt(inputUtente);

                ArrayList<Integer> numeriCasuali = generaNumeriCasuali(numeroElementi);

                Collections.sort(numeriCasuali);

                System.out.println("Numeri casuali generati (ordine crescente): " + numeriCasuali);

                stampaInversa(numeriCasuali);

                break;
            } catch (NumberFormatException e) {
                System.out.println("Input non valido. Inserisci un numero intero.");
            }
        } while (true);

        //scanner che fa come gli pare

        input.close();
    }

    private static ArrayList<Integer> generaNumeriCasuali(int numeroElementi) {
        ArrayList<Integer> numeriCasuali = new ArrayList<>();

        for (int i = 0; i < numeroElementi; i++) {
            int numeroCasuale = (int) (Math.random() * 101);
            numeriCasuali.add(numeroCasuale);
        }
        return numeriCasuali;
    }

    private static void stampaInversa(ArrayList<Integer> lista) {
        // Copia l'ArrayList in modo che la lista originale non venga modificata
        ArrayList<Integer> copiaLista = new ArrayList<>(lista);

        // Inverti l'ArrayList
        Collections.reverse(copiaLista);

        System.out.println("Numeri casuali generati (ordine inverso): " + copiaLista);
    }
}
