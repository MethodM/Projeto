import java.sql.SQLOutput;
import java.text.DecimalFormat;

public class AlimentoTestDrive {
    public static void main(String [] args) {
        Alimento maca = new Alimento("Maçã", 67.60, 0.08, 17.95, 0.34);
        Alimento carne = new Alimento("Carne", 287, 19.05, 0, 26.41);
        Alimento ovo = new Alimento("Ovo", 74, 4.97, 0.38, 6.29);
        Alimento arroz = new Alimento("Arroz", 128, 0.2, 28.1, 2.5);
        Alimento feijaoPreto = new Alimento("Feijão Preto", 132, 0.54, 23.71, 8.86);

        //Lista de Alimento
        ListaDeAlimentos listaDeAlimentos = new ListaDeAlimentos();
        listaDeAlimentos.addAlimento(maca);
        listaDeAlimentos.addAlimento(carne);
        listaDeAlimentos.addAlimento(ovo);
        listaDeAlimentos.addAlimento(arroz);
        listaDeAlimentos.addAlimento(feijaoPreto);


        DecimalFormat decimalFormat = new DecimalFormat("#.###"); // Até 3 digíto após a vírgula
        System.out.println("Maçã: " + decimalFormat.format(maca.getCaloriasTotais()) + " calorias");
        System.out.println("Carne: " + decimalFormat.format(carne.getCaloriasTotais()) + " calorias");
        System.out.println("Ovo: " + decimalFormat.format(ovo.getCaloriasTotais()) + " calorias");
        System.out.println("Arroz: " + decimalFormat.format(arroz.getCaloriasTotais()) + " calorias");
        System.out.println("Feijão Preto " + decimalFormat.format(feijaoPreto.getCaloriasTotais()) + " calorias");
    }
}
