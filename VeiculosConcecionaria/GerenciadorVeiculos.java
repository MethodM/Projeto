package VeiculosConcecionaria;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorVeiculos {
    public static void main(String[] args) {

        List<Veiculo> veiculos = new ArrayList<>();

        //Carro
        Carro carro = new Carro();
        carro.placa = "ABC-1234";
        carro.ano = 2018;
        carro.numeroPortas = 4;
        veiculos.add(carro);

        Carro carro1 = new Carro();
        carro1.placa = "DEF-5678";
        carro1.ano = 2019;
        carro1.numeroPortas = 2;
        veiculos.add(carro1);

        Carro carro2 = new Carro();
        carro2.placa = "GHI-9101";
        carro2.ano = 2020;
        carro2.numeroPortas = 4;
        veiculos.add(carro2);

        Carro carro3 = new Carro();
        carro3.placa = "JKL-2345";
        carro3.ano = 2021;
        carro3.numeroPortas = 4;
        veiculos.add(carro3);

        //Moto
        Moto moto = new Moto();
        moto.placa = "ZXC-4321";
        moto.ano = 2022;
        moto.cilindrada = 180;
        veiculos.add(moto);

        Moto moto1 = new Moto();
        moto1.placa = "QWE-5678";
        moto1.ano = 2023;
        moto1.cilindrada = 200;
        veiculos.add(moto1);

        Moto moto2 = new Moto();
        moto2.placa = "RTY-4567";
        moto2.ano = 2024;
        moto2.cilindrada = 250;
        veiculos.add(moto2);

        System.out.println("Detalhes do Carro: ");
        carro.exibirDetalhes(carro.placa, carro.ano);
        System.out.println("Valor do Seguro é de: R$ " + carro.calcularValorSeguro());

        System.out.println("Detalhes da Moto: ");
        moto.exibirDetalhes(moto.placa, moto.ano);
        System.out.println("Valor do Seguro da Moto é de: R$ " + moto.calcularValorSeguro());

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes(veiculo.placa, veiculo.ano); // chama os métodos para iteração
            System.out.println("Valor do Seguro é de R$ " + veiculo.calcularValorSeguro());

            if (veiculo instanceof Manutencao) {
                Manutencao manutencao = (Manutencao) veiculo;
                System.out.println(manutencao.realizarManutencao());
            } else {
                System.out.println("Veículo não possui manutenção.");
            }
        }
    }
}
