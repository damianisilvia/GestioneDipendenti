public class Sviluppatore extends Dipendente {

    private static final double BONUS = 250.0;
    private static final double RAL = 40000.0;

    public Sviluppatore(String nome) {
        super(nome);
    }

    @Override
    public double stipendioBase() {
        return RAL / MENSILITA;  // Usato MENSILITA direttamente dalla classe Dipendente
    }

    @Override
    public double calcolaStipendio() {
        return stipendioBase() + BONUS;
    }

    // Rimosso il metodo getNome() se non c'è una modifica particolare da fare
    // public String getNome() {
    //     return super.getNome();
    // }
}
