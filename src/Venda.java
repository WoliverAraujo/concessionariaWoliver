import java.time.LocalDate;

public class Venda extends Concessionaria {

	public void venderCarro(Carro carro, Cliente cliente, double precoVenda) {
	    // Verifica se o carro está disponível para venda
	    if (!carros.contains(carro)) {
	        System.out.println("Carro não está disponível para venda.");
	        return;
	    }

	    // Calcula o preço de venda do carro
	    double precoCompra = carro.getPreco();
	    double despesasAdicionais = 1000; // exemplo
	    double comissaoVendedor = 0.05 * precoVenda; // exemplo
	    double precoFinal = precoCompra + despesasAdicionais + comissaoVendedor;

	    // Elabora o contrato de venda
	    String contrato = "CONTRATO DE VENDA\n";
	    contrato += "Vendedor: Concessionária XYZ\n";
	    contrato += "Comprador: " + cliente.getNome() + "\n";
	    contrato += "Carro: " + carro.getModelo() + " (" + carro.getAno() + ")\n";
	    contrato += "Preço de venda: R$ " + precoVenda + "\n";
	    contrato += "Condições de pagamento: A vista\n";
	    contrato += "Data da venda: " + LocalDate.now() + "\n";
	    System.out.println(contrato);

	    // Recebe o pagamento do comprador
	    cliente.efetuarPagamento(precoVenda);

	    // Atualiza o registro de carros vendidos
	    carros.remove(carro);
	    carrosVendidos.add(carro);

	    // Transfere a propriedade do carro para o comprador
	    carro.setProprietario(cliente);
	    System.out.println("Carro vendido para " + cliente.getNome() + ".");
	}
}
