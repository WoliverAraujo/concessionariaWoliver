
public abstract class Carro {
	private String placa;
    private String modelo;
    private int ano;
    private String fabricante;
    private double preco;

    public Carro(String placa, String modelo, int ano, String fabricante, double preco) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + ", Modelo: " + modelo + ", Ano: " + ano + ", Fabricante: " + fabricante + ", Preço: " + preco;
    }
}
