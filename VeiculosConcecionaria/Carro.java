package VeiculosConcecionaria;

public class Carro extends Veiculo implements Manutencao {
    int numeroPortas;

    @Override
    public double calcularValorSeguro() {
        return 800 + (numeroPortas * 112); // valores exemplo
    }

    //Manutenção
    public String realizarManutencao(){
        return "Manutenção do carro placa: " + placa + " realizada com sucesso!";
    }
}
