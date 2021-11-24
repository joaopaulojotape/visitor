public class Van implements Veiculo {

    private int sg;
    private int np;

    public Van(int capacidade, int portas) {
        this.sg = capacidade;
        this.np = portas;
    }

    public int getSg() {
        return sg;
    }

    public void setSg(int sg) {
        this.sg = sg;
    }

    public int getNp() {
        return np;
    }

    public void setNp(int np) {
        this.np = np;
    }

    @Override
    public int accept(Visitas visitas) {
        return visitas.visita(this);
    }
}
