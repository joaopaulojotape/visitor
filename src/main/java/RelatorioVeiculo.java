public class RelatorioVeiculo implements Visitas {


    @Override
    public int visita(Carro carro) {
        int serviceCharge = 0;
        if(carro.getCor()=="Azul"){
            serviceCharge += 100;
        }else{
            serviceCharge += 50;
        }
        System.out.println("Taxa de serviço: " + serviceCharge);
        return serviceCharge;
    }

    @Override
    public int visita(Van van) {
        int serviceCharge = 0;
        if(van.getNp()>4){
            serviceCharge += 500;
        }else{
            serviceCharge += 100;
        }
        System.out.println("Taxa de serviço para Van: " + serviceCharge);
        return serviceCharge;
    }

    @Override
    public int visita(Moto moto) {
        int serviceCharge = 0;
        if(moto.getPotenciaMotor()>=200){
            serviceCharge += 200;
        }else{
            serviceCharge += 50;
        }
        System.out.println("Taxa de serviço para Moto: " + serviceCharge);
        return serviceCharge;
    }
}
