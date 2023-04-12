
public class Estoque {
    private Concessionaria concessionaria;

    public Estoque() {
        this.concessionaria = new Concessionaria();
    }

    public void adicionarCarro(Carro carro) {
        concessionaria.adicionarCarro(carro);
    }

    public void removerCarro(Carro carro) {
        concessionaria.removerCarro(carro);
    }

    public void realizarVenda(Carro carro, double valor) {
        Venda venda = new Venda(concessionaria, carro, valor);
        venda.efetuarVenda();
    }

    public void realizarCompra(Carro carro, double valor) {
        Compra compra = new Compra(concessionaria, carro, valor);
        compra.efetuarCompra();
    }

}

