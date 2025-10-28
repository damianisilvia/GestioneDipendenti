import java.text.NumberFormat;
import java.util.Locale;

public class TestFormat {
    public static void main(String[] args) {
        // Creiamo un formattatore per la valuta italiana
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.ITALY);

        // Test di formattazione
        double valore1 = 10000.0;
        double valore2 = 1234.56;
        double valore3 = 987654.321;

        System.out.println("Valore 1: " + nf.format(valore1)); // 10.000,00 €
        System.out.println("Valore 2: " + nf.format(valore2)); // 1.234,56 €
        System.out.println("Valore 3: " + nf.format(valore3)); // 987.654,32 €

        // Se vuoi testare anche il tuo metodo del Main:
        System.out.println("\nTest con GestioneDipendenti.formatEuro():");
        System.out.println(GestioneDipendenti.formatEuro(10000.0));
        System.out.println(GestioneDipendenti.formatEuro(1234.56));
        System.out.println(GestioneDipendenti.formatEuro(987654.321));
    }
}
