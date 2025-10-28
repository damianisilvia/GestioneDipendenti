public class Manager extends Dipendente {

    private static final double BONUS = 1000.0;
    private static final double RAL = 120000.0;

    public Manager(String nome) {
        super(nome);
    }

    @Override
    public double stipendioBase() {
        return RAL / MENSILITA;  // Corretto il riferimento alla costante
    }

    @Override
    public double calcolaStipendio() {
        return stipendioBase() + BONUS;
    }
}
