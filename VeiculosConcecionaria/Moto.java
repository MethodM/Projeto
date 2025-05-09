package VeiculosConcecionaria;

public class Moto extends Veiculo implements Manutencao {
    int cilindrada;

    public double calcularValorSeguro(){
        return 400 + (cilindrada * 63.5); // Valores de exemplo
    }

    //Manutenção
    public String realizarManutencao(){
        return "Manutenção da moto placa: " + placa + " realizada!";
    }
}
