public class ServicoVeiculoVisitor {

    private static int calculoT(Veiculo[] veiculos) {
        Visitas i = new RelatorioVeiculo();
        int total = 0;
        for(Veiculo veiculo : veiculos){
            total = total + veiculo.accept(i);
        }
        return total;
    }

}
