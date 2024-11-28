import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, i, iMin;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti atleti ci sono in gara?");
        n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<String> nomi = new ArrayList<>(n);
        List<String> nazionali = new ArrayList<>(n);
        List<Float> tempi = new ArrayList<>(n);

        for (i = 0; i < n; i++) {
            System.out.println("nome " + (i + 1) + "° atleta: ");
            nomi.add(scanner.nextLine());
            System.out.println("Nazionale " + (i + 1) + "° atleta: ");
            nazionali.add(scanner.nextLine());
            System.out.println("Tempo " + (i + 1) + "° atleta: ");
            tempi.add(scanner.nextFloat());
            scanner.nextLine(); // Consume newline
        }

        System.out.println("Informazioni inserite");
        for (i = 0; i < n; i++) {
            System.out.println((i + 1) + "° atleta: " + nomi.get(i) + "; nazionale: " + nazionali.get(i)
                    + "; tempo: " + tempi.get(i));
        }

        System.out.println("Ricerca dell'atleta vincitore");
        float min = tempi.get(0);
        iMin = 0;

        for (i = 1; i < nomi.size(); i++) {
            if (tempi.get(i) < min) {
                iMin = i;
                min = tempi.get(i);
            }
        }

        System.out.println("Atleta vincitore: " + nomi.get(iMin)
                + "; nazionale: " + nazionali.get(iMin) + "; tempo: " + tempi.get(iMin));
        
        scanner.close();
    }
}
