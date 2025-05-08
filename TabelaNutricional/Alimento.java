public class Alimento {

    private String nome;
    private double calorias;
    private double gorduras;
    private double carboidratos;
    private double proteina;
    private double quantidade;

    public Alimento() {

    }
    // Retirado todos os valores "static" dos atributos, para não compartilhar entre todas as instâncias da classe Alimento

    //********* Passar valores como Parâmetro para aceitar alterações futuras
    public void adicionarAlimento(double calorias, double gorduras, double carboidratos, double proteina, double quantidade) {
        this.calorias = calorias;
        this.gorduras = gorduras;
        this.carboidratos = carboidratos;
        this.proteina = proteina;
        this.quantidade = quantidade;

    }
    public static void armazenarAlimento () {
        //Escrever código aqui
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCalorias () {
        return calorias;
    }
    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
    public double getGorduras() {
        return gorduras;
    }
    public void setGorduras(double gorduras) {
        this.gorduras = gorduras;
    }
    public double getCarboidratos() {
        return carboidratos;
    }
    public void setCarboidratos(double carboidratos) {
        this.carboidratos = carboidratos;
    }
    public double getProteina() {
        return proteina;
    }
    public void setProteina(double proteina) {
        this.proteina = proteina;
    }

    public Alimento(String nome, double calorias, double gorduras, double carboidratos, double proteina){
        this.nome = nome;
        this.calorias = calorias;
        this.gorduras = gorduras;
        this.carboidratos = carboidratos;
        this.proteina = proteina;
    }
    public Alimento(String nome, double calorias, double gorduras, double carboidratos, double proteina, double quantidade){
        this.nome = nome;
        this.calorias = calorias;
        this.gorduras = gorduras;
        this.carboidratos = carboidratos;
        this.proteina = proteina;
        this.quantidade = quantidade;
    }
    // Método que Calcula todas as Calorias, com os valors de 1g carbs = 4 calorias, 1g proteina = 4 calorias e 1g de gorduras = 9 calorias
    public double getCaloriasTotais() {
        double getCaloriasTotais = (carboidratos * 4 + proteina * 4 + gorduras * 9);
        return getCaloriasTotais; // Retorna o valor do método após o cálculo
    }
}
