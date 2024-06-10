/**
 * A classe Carro representa um veículo automotor com propriedades básicas
 * e métodos que definem seu comportamento.
 */
public class Carro {
    // Propriedades do carro
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double velocidadeAtual;

    /**
     * Construtor para criar uma instância de Carro com as propriedades especificadas.
     *
     * @param marca  A marca do carro
     * @param modelo O modelo do carro
     * @param ano    O ano de fabricação do carro
     * @param cor    A cor do carro
     */
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeAtual = 0.0;
    }

    // Métodos para acessar e modificar as propriedades do carro

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    // Métodos que definem o comportamento do carro

    /**
     * Acelera o carro aumentando a velocidade atual.
     *
     * @param incremento A quantidade de velocidade a ser adicionada
     */
    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidadeAtual += incremento;
        }
    }

    /**
     * Freia o carro diminuindo a velocidade atual.
     *
     * @param decremento A quantidade de velocidade a ser reduzida
     */
    public void frear(double decremento) {
        if (decremento > 0 && this.velocidadeAtual >= decremento) {
            this.velocidadeAtual -= decremento;
        }
    }

    /**
     * Exibe as informações do carro.
     */
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }

    public static void main(String[] args) {
        // Criando um objeto Carro e testando seus métodos
        Carro meuCarro = new Carro("Toyota", "Corolla", 2021, "Prata");
        meuCarro.exibirInformacoes();
        meuCarro.acelerar(50);
        System.out.println("Velocidade após acelerar: " + meuCarro.getVelocidadeAtual() + " km/h");
        meuCarro.frear(20);
        System.out.println("Velocidade após frear: " + meuCarro.getVelocidadeAtual() + " km/h");
    }
}
