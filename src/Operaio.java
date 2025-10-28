public class Operaio extends Dipendente {

    private int oreLavorate;
    private static final double PAGA_ORARIA = 25;

    public Operaio(String nome, int oreLavorate) {
        super(nome);
        this.oreLavorate = oreLavorate;
    }

    public int getOreLavorate() {
        return oreLavorate;
    }

    public void setOreLavorate(int oreLavorate) {
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double stipendioBase() {
        return PAGA_ORARIA;  // Mantiene la paga oraria
    }

    @Override
    public double calcolaStipendio() {
        return stipendioBase() * oreLavorate;  // Corregge il calcolo
    }
}
