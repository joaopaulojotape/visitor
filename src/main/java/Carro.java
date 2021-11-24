public class Carro implements Veiculo {

    private String cor;
    private int DataFabricacao;

    public Carro(String cor, int DataFabricacao) {
        this.cor = cor;
        this.DataFabricacao = DataFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getDataFabricacao() {
        return DataFabricacao;
    }

    public void setDataFabricacao(int dataFabricacao) {
        this.DataFabricacao = dataFabricacao;
    }

    @Override
    public int accept(Visitas visitas) {
        return visitas.visita(this);
    }
}
