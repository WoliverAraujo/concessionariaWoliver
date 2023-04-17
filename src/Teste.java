
public class Teste {
	
	public static void main(String[] args) {
        Carro carro = new CarroUsado("Toyota", "Corolla", 2020, 120000);
        Compra compra = new Compra(carro, 80000);
        Movimento movimento = new Movimento(compra, "01/01/2023");

        System.out.println("Compra realizada em " + movimento.getData());
        System.out.println("Marca do carro: " + carro.getMarca());
        System.out.println("Modelo do carro: " + carro.getModelo());
        System.out.println("Ano do carro: " + carro.getAno());
        System.out.println("Valor da compra: " + compra.getValor());
    }

}
