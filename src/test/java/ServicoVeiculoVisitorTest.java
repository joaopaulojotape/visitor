import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;



public class ServicoVeiculoVisitorTest {


    private static int calculateTotal(Veiculo[] veiculos) {
        Visitas i = new RelatorioVeiculo();
        int total = 0;
        for(Veiculo veiculo : veiculos){
            total = total + veiculo.accept(i);
        }
        return total;
    }


    @Test
    public void custo() {

        Veiculo[] veiculos = new Veiculo[]{
                new Carro("azul", 2010),
                new Van(5000, 6),
                new Moto(100, "TV")
        };

        int totalCost = calculateTotal(veiculos);

        assertEquals(600, totalCost);

 }



}