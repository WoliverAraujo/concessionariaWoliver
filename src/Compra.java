
public class Compra {
    private Concessionaria concessionaria;
    private Carro carro;
    private double valor;

    public Compra(Concessionaria concessionaria, Carro carro, double valor) {
        this.concessionaria = concessionaria;
        this.carro = carro;
        this.valor = valor;
    }

    public void efetuarCompra() {
        concessionaria.adicionarCarro(carro);
        System.out.println("Carro comprado: ");
        carro.imprimirInformacoes();
        System.out.println("Valor da compra: R$" + valor);
    }
}
