package Es2;

import java.util.ArrayList;
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

                System.out.println("Numeri casuali generati: " + numeriCasuali);

                break;
            } catch (NumberFormatException e) {
                System.out.println("Input non valido. Inserisci un numero intero.");
            }
        } while (true);

// prima non mi chiudeva ora si bah
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
}
