package Es1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il numero di parole che vuoi");

        int numeroParole = Integer.parseInt(input.nextLine());

        List<String> paroleUniche = new ArrayList<>();
        List<String> paroleDuplicate = new ArrayList<>();
        Set<String> paroleUnicheChecker = new HashSet<>();

        System.out.println("Inserisci " + numeroParole + " parole");

        // Metodo che chiede e aggiunge le parole ad ogni posizione dell'array
        for (int i = 0; i < numeroParole; i++) {
            String nuovaParola = input.nextLine();


            if (i == numeroParole - 1) {
                System.out.println("Ecco i tuoi array di parole");
            } else {
                if (!paroleUnicheChecker.add(nuovaParola)) {
                    paroleDuplicate.add(nuovaParola);
                    System.out.println("Inserisci un'altra parola");
                } else {
                    paroleUniche.add(nuovaParola);
                    System.out.println("Inserisci un'altra parola");
                }
            }
        }

        if (paroleUniche.isEmpty()) {
            System.out.println("Tutte le parole inserite sono duplicate. Nessuna parola unica.");
        } else {
            System.out.println("Le parole uniche sono: " + paroleUniche.size() + " e sono " + paroleUniche);
        }

        System.out.println("Le parole duplicate sono: " + paroleDuplicate.size() + " e sono " + paroleDuplicate);


        input.close();
    }
}
