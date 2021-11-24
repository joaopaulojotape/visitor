public class Moto implements Veiculo {

    private int PotenciaMotor;
    private String marca;

    public Moto(int PotenciaMotor, String marca) {
        this.PotenciaMotor = PotenciaMotor;
        this.marca = marca;
    }

    public int getPotenciaMotor() {
        return PotenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.PotenciaMotor = potenciaMotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int accept(Visitas visitas) {
        return visitas.visita(this);
    }
}
