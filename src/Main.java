public class Main {
    public static void main(String[] args) {
        // Creo alcuni dipendenti
        Manager m = new Manager("Mario Rossi");
        Operaio o1 = new Operaio("Anna Bianchi", 160); // ore mensili tipiche
        Operaio o2 = new Operaio("Giuseppe Verdi", 140);

        // Creo l'azienda e aggiungo i dipendenti
        Azienda azienda = new Azienda();
        azienda.getDipendenti().add(m);
        azienda.getDipendenti().add(o1);
        azienda.getDipendenti().add(o2);

        // Stampo i dettagli dei dipendenti usando il metodo di utilità
        System.out.println("Elenco dipendenti:");
        for (Dipendente d : azienda.getDipendenti()) {
            System.out.println("- " + d.getNome() + " → Stipendio: " + GestioneDipendenti.formatEuro(d.calcolaStipendio()));
        }

        // Calcolo e stampo la spesa totale mensile
        double spesaMensileTotale = azienda.calcolaSpesaMensile();
        System.out.println("\n Spesa mensile totale azienda: " + GestioneDipendenti.formatEuro(spesaMensileTotale));
    }
}
