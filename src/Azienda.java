import java.util.ArrayList;
import java.util.List;

public class Azienda {

    private List<Dipendente> dipendenti;

    public Azienda() {
        this.dipendenti = new ArrayList<>();
    }

    public List<Dipendente> getDipendenti() {
        return dipendenti;
    }

    public void setDipendenti(List<Dipendente> dipendenti) {
        this.dipendenti = dipendenti;
    }

    public double calcolaSpesaMensile() {
        double totale = 0.0;
        for (Dipendente d : dipendenti)
            totale += d.calcolaStipendio();
        return totale;
    }
}
