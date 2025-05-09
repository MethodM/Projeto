package VeiculosConcecionaria;

public class Veiculo {
    String placa;
    int ano;

    public double calcularValorSeguro() {
        return 0;
    }

    public void exibirDetalhes(String placa, int ano){
        System.out.println("Placa: " + placa);
        System.out.println("Ano/Modelo: " + ano);
    }
}
