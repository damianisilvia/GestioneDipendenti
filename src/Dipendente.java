public abstract class Dipendente {
    protected String nome;
    protected static final int MENSILITA = 14;

    public Dipendente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double stipendioBase();
    public abstract double calcolaStipendio();
}
