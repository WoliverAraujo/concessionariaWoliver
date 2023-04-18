
public class CarroNovo extends Carro implements Venda {
    public CarroNovo(String marca, String modelo, int anoFabricacao, double valor) {
        super(marca, modelo, anoFabricacao, valor);
    }

    @Override
    public void vender() {
        System.out.println("Carro novo vendido!");
    }
}
