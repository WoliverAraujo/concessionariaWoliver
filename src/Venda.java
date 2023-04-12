
public class Venda {
    private Concessionaria concessionaria;
    private Carro carro;
    private double valor;

    public Venda(Concessionaria concessionaria, Carro carro, double valor) {
        this.concessionaria = concessionaria;
        this.carro = carro;
        this.valor = valor;
    }

    public void efetuarVenda() {
        concessionaria.removerCarro(carro);
        System.out.println("Carro vendido: ");
        carro.imprimirInformacoes();
        System.out.println("Valor da venda: R$" + valor);
    }
}